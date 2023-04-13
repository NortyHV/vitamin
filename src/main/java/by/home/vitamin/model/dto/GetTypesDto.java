package by.home.vitamin.model.dto;

import by.home.vitamin.model.entity.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTypesDto {

    private Set<Type> types;
}
