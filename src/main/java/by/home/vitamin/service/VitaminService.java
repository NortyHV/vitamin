package by.home.vitamin.service;

import by.home.vitamin.config.BeanConfiguration;
import by.home.vitamin.model.entity.Vitamin;
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
    BeanConfiguration beanConfiguration;


    public List<List<ArrayList>> admissionSchedule(Set<Type> vitaminUser) {
        List<ArrayList> morning = new ArrayList<>();
        List<ArrayList> dinner = new ArrayList<>();
        List<ArrayList> evening = new ArrayList<>();
        int size = vitaminUser.size();

        List<List<ArrayList>> admissionSchedule = new ArrayList<>();
        admissionSchedule.add(morning);
        admissionSchedule.add(dinner);
        admissionSchedule.add(evening);

        Map<Type, int[]> counters = new HashMap<Type, int[]>(size);
        for (Type vitamin: vitaminUser) {
            int[] counter = new int[3];
            counters.put(vitamin, counter);
            for (Type vitamin2: vitaminUser) {
                if (!vitamin.equals(vitamin2)) {
                    Vitamin v1 = beanConfiguration.vitamins().get(vitamin);
                    switch (v1.getColorByType().get(vitamin2)) {
                        case RED -> counter[0]++;
                        case GREEN -> counter[1]++;
                        case WHITE -> counter[2]++;
                    }
                }
            }
        }






        return admissionSchedule;


    }
}
