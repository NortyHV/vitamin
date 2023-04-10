package by.home.vitamin.service;

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


    public List<List<Type>> admissionSchedule(Set<Type> vitaminUser) {
        List<Type> morning = new ArrayList<>();
        List<Type> dinner = new ArrayList<>();
        List<Type> evening = new ArrayList<>();


        List<List<Type>> admissionSchedule = new ArrayList<>();
        admissionSchedule.add(morning);
        admissionSchedule.add(dinner);
        admissionSchedule.add(evening);

        for (int i=0;i<3;i++) {
            Map<Type, int[]> counters = createTempContainer(vitaminUser);
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
            }
            vitaminUser.remove(worst);
            vitaminUser.removeAll(comp);
            if (vitaminUser.size() == 0) break;

        }


//        Color ab1_new = vitaminsMap.get(Type.A).getB1();

        return admissionSchedule;


    }


    Map<Type, int[]> createTempContainer(Set<Type> vitaminUser) {

        Map<Type, int[]> tempContainer = new HashMap<>(vitaminUser.size());
        for (Type typeVitamin : vitaminUser) {
            int[] counter = new int[3];
            tempContainer.put(typeVitamin, counter);      //tempContainer - контейнер для кол-ва (RED, GREEN, WHITE)
            for (Type typeVitamin2 : vitaminUser) {
                if (!typeVitamin.equals(typeVitamin2)) {
                    Vitamin v1 = vitamins.get(typeVitamin);
                    switch (v1.getColorByType().get(typeVitamin2)) {
                        case RED -> counter[0]++;
                        case GREEN -> counter[1]++;
                        case WHITE -> counter[2]++;
                    }
                }
            }
        }
        return tempContainer;
    }

    //находим самый проблемный Витамин из списка
    Type findWorst(Map<Type, int[]> cont) {
        Type worst = null;
        int worstCount = 0;
        for (Type vit: cont.keySet()) {
            int[] arr = cont.get(vit);
            if (arr[0] >= worstCount || worst == null) {
                worst = vit;
                worstCount = arr[0];
            }
        }
        return worst;
    }

    //находим подходящие витамины к определенному витамину
    List<Type> findCompatible(Type worst, Map<Type, int[]> cont) {
        List<Type> compatible = new ArrayList<>();
        for (Type vit: cont.keySet()) {
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