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
import java.util.stream.Collectors;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class VitaminService {
    BeanConfiguration beanConfiguration;


    public List<List<ArrayList>> admissionSchedule(List<Vitamin> vitaminUser) {
        List<ArrayList> morning = new ArrayList<>();
        List<ArrayList> dinner = new ArrayList<>();
        List<ArrayList> evening = new ArrayList<>();
        int size = vitaminUser.size();

        List<List<ArrayList>> admissionSchedule = new ArrayList<>();
        admissionSchedule.add(morning);
        admissionSchedule.add(dinner);
        admissionSchedule.add(evening);


        for (int i = 0; i < vitaminUser.size(); i++) {
            for (int j = 0; j < beanConfiguration.vitamins().size(); j++) {
                if (vitaminUser.get(i).equals(beanConfiguration.vitamins().get(j))){

                }
            }
        }

        return admissionSchedule;


    }


}
