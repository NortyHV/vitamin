package by.home.vitamin.service;

import by.home.vitamin.config.BeanConfiguration;
import by.home.vitamin.model.entity.enums.Type;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class VitaminServiceTest {

    private BeanConfiguration beanConfiguration;
    private VitaminService vitaminService = new VitaminService(Map.of());

    @Test
    @DisplayName(value = " Должен создать контейнер \"цветов совместимости\" правильно ")
    void createTempContainer_ok() {
        Set<Type> vitaminUser = new HashSet<>();
        vitaminUser.add(Type.A);
        vitaminUser.add(Type.B1);

        Map<Type, int[]> expected = Map.of(Type.B1, new int[]{}); // то, каким должен быть результат работы алгоритма
        Map<Type, int[]> actual = vitaminService.createTempContainer(vitaminUser);
        assertNotNull(actual);
        actual.entrySet().forEach(actualPair -> {
                    assertTrue(expected.containsKey(actualPair.getKey()));
                    int[] expectedValue = expected.get(actualPair.getKey());
                    int[] actualValue = actualPair.getValue();
                    assertEquals(expectedValue.length, actualValue.length);
                    for (int i = 0; i < expectedValue.length; i++) {
                        assertEquals(expectedValue[i], actualValue[i]);
                    }
                }
        );
    }
}
