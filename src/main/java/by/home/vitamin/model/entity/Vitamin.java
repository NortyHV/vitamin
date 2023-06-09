package by.home.vitamin.model.entity;

import by.home.vitamin.model.entity.enums.Color;
import by.home.vitamin.model.entity.enums.Type;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.domain.EntityScan;


import java.util.Map;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vitamin {


  Map<Type, Color> colorByType;

    Color A;
    Color B1;
    Color B2;
    Color B3;
    Color B5;
    Color B6;
    Color B9;
    Color B12;
    Color C;
    Color D;
    Color E;
    Color Fe;
    Color Cu;
    Color Zn;


}
