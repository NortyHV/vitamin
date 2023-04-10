package by.home.vitamin.service;

import by.home.vitamin.model.dto.AdmissionSheduleResponseDto;
import by.home.vitamin.model.dto.CompatibilityCounterItem;
import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Color;
import by.home.vitamin.model.entity.enums.Type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.*;

import static by.home.vitamin.model.entity.enums.Color.GREEN;
import static by.home.vitamin.model.entity.enums.Color.WHITE;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@AllArgsConstructor
public class VitaminService {


    Map<Type, Vitamin> vitamins;
//    Map<Type, Vitamin> vitaminsMap;


    public AdmissionSheduleResponseDto admissionSchedule(Set<Type> vitaminUser) {
        List<Type> morning = new ArrayList<>();
        List<Type> dinner = new ArrayList<>();
        List<Type> evening = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Map<Type, CompatibilityCounterItem> counters = createTempContainer(vitaminUser);
            Type worst = findWorst(counters);
            List<Type> comp = findCompatible(worst, counters);
            switch (i) {
                case 0:
                    morning.add(worst);
                    morning.addAll(comp);
                    break;
                case 1:
                    dinner.add(worst);
                    dinner.addAll(comp);
                    break;
                case 2:
                    evening.add(worst);
                    evening.addAll(comp);
                    break;
                default:
                    break;
            }
            vitaminUser.remove(worst);
            vitaminUser.removeAll(comp);
            if (vitaminUser.size() == 0) break;

        }
//        Color ab1_new = vitaminsMap.get(Type.A).getB1();

        return AdmissionSheduleResponseDto
                .builder()
                .morning(morning)
                .dinner(dinner)
                .evening(evening)
                .build();
    }


    Map<Type, CompatibilityCounterItem> createTempContainer(Set<Type> vitaminUser) {
        Map<Type, CompatibilityCounterItem> container = new HashMap<>();
        for (Type typeVitamin : vitaminUser) {
            CompatibilityCounterItem item = CompatibilityCounterItem.builder().build();
            for (Type typeVitamin2 : vitaminUser) {
                if (!typeVitamin.equals(typeVitamin2)) {
                    Vitamin v1 = vitamins.get(typeVitamin);
                    item.increment(v1.getColorByType().get(typeVitamin2));
                }
            }
            container.put(typeVitamin, item);
        }
        return container;
    }

    //находим самый проблемный Витамин из списка
    Type findWorst(Map<Type, CompatibilityCounterItem> cont) {
        Type worst = null;
        int worstCount = 0;
        for (Type vit : cont.keySet()) {
            CompatibilityCounterItem item = cont.get(vit);
            if (item.getRed() >= worstCount || worst == null) {
                worst = vit;
                worstCount = item.getRed();
            }
        }
        return worst;
    }

    //находим подходящие витамины к определенному витамину
    private List<Type> findCompatible(Type worst, Map<Type, CompatibilityCounterItem> cont) {
        List<Type> compatible = new ArrayList<>();
        for (Type vit : cont.keySet()) {
            if (!worst.equals(vit)) {
                Vitamin v1 = vitamins.get(vit);
                Color color = v1.getColorByType().get(worst);
                if (color.equals(GREEN) || color.equals(WHITE)) {
                    compatible.add(vit);
                }
            }
        }
        return compatible;
    }


}