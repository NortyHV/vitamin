package by.home.vitamin.service;

import by.home.vitamin.config.BeanConfiguration;
import by.home.vitamin.model.entity.enums.Type;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VitaminServiceTest {

    private BeanConfiguration beanConfiguration;
    private VitaminService vitaminService;

    @Test
    @DisplayName(value = " Должен создать контейнер \"цветов совместимости\" правильно ")
    void createTempContainer_ok() {
        Set<Type> vitaminUser = new HashSet<>();
        vitaminUser.add(Type.A);
        vitaminUser.add(Type.B1);

       Map<Type, int[]> temp = vitaminService.createTempContainer(vitaminUser);

assertNotNull(temp);
    }
}
