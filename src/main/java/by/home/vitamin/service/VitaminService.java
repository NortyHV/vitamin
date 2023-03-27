package by.home.vitamin.service;

import by.home.vitamin.config.BeanConfiguration;
import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Color;
import by.home.vitamin.model.entity.enums.Type;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class VitaminService {

    Map<Type, Vitamin> vitamins;

    Map<Type, Vitamin> vitaminsNew;


    public List<List<ArrayList>> admissionSchedule(Set<Type> vitaminUser) {
        List<ArrayList> morning = new ArrayList<>();
        List<ArrayList> dinner = new ArrayList<>();
        List<ArrayList> evening = new ArrayList<>();


        List<List<ArrayList>> admissionSchedule = new ArrayList<>();
        admissionSchedule.add(morning);
        admissionSchedule.add(dinner);
        admissionSchedule.add(evening);

        Map<Type, int[]> counters = createTempContainer(vitaminUser);

        Color ab1 = vitamins.get(Type.A).getColorByType().get(Type.B1);

        Color ab1_new = vitaminsNew.get(Type.A).getB1();

        Color b1a = vitaminsNew.get(Type.B1).getA();

        return admissionSchedule;


    }

    Map<Type,int[]> createTempContainer(Set<Type> vitaminUser){

        Map<Type, int[]> tempContainer = new HashMap<>(vitaminUser.size());
        for (Type typeVitamin: vitaminUser) {
            int[] counter = new int[3];
            tempContainer.put(typeVitamin, counter);       //tempContainer - контейнер для кол-ва (RED, GREEN, WHITE)
            for (Type typeVitamin2: vitaminUser) {
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


}
