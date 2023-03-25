package by.home.vitamin.service;

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

    Set<Enum> enumTypeList = new HashSet<Enum>();

    public List<Vitamin> admissionSchedule(List vitamins) {
        Set<Vitamin> morning = new HashSet<>();
        Set<Vitamin> dinner = new HashSet<>();
        Set<Vitamin> evening = new HashSet<>();

        List<Vitamin> admissionSchedule = new ArrayList<>();

        if(isWorkList(vitamins)) {
            return null;
        }
        return admissionSchedule;

    }
boolean isWorkList(List<String> vitamins) {
toUpperCase(vitamins);
enumTypeList.add(Type.E);
    enumTypeList.add(Type.B5);
    enumTypeList.add(Type.B1);
    enumTypeList.add(Type.B2);
    enumTypeList.add(Type.B3);
    enumTypeList.add(Type.B6);
    enumTypeList.add(Type.B9);
    enumTypeList.add(Type.B12);
    enumTypeList.add(Type.D);
    enumTypeList.add(Type.C);
    enumTypeList.add(Type.Cu);
    enumTypeList.add(Type.Fe);
    enumTypeList.add(Type.A);

       return new HashSet<>(vitamins).containsAll(enumTypeList);
}

void toUpperCase(List list){
    list.stream().map(e -> e.toString().toUpperCase());
}

}
