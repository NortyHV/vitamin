package by.home.vitamin.model.dto;

import by.home.vitamin.model.entity.enums.Type;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdmissionSheduleResponseDto {

    List<Type> morning;
    List<Type> dinner;
    List<Type> evening;
}
