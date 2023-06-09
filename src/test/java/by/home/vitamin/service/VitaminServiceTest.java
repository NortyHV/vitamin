package by.home.vitamin.service;

import by.home.vitamin.config.BeanConfiguration;
import by.home.vitamin.model.dto.CompatibilityCounterItem;
import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Color;
import by.home.vitamin.model.entity.enums.Type;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class VitaminServiceTest {

    private BeanConfiguration beanConfiguration;
    private VitaminService vitaminService = new VitaminService(Map.of(
            Type.A, Vitamin.builder().colorByType(Map.ofEntries(
                    Map.entry(Type.B1, Color.WHITE),
                    Map.entry(Type.B2, Color.WHITE),
                    Map.entry(Type.B3, Color.WHITE),
                    Map.entry(Type.B5, Color.WHITE),
                    Map.entry(Type.B6, Color.WHITE),
                    Map.entry(Type.B9, Color.WHITE),
                    Map.entry(Type.B12, Color.RED),
                    Map.entry(Type.C, Color.GREEN),
                    Map.entry(Type.D, Color.RED),
                    Map.entry(Type.E, Color.GREEN),
                    Map.entry(Type.Fe, Color.GREEN),
                    Map.entry(Type.Cu, Color.WHITE),
                    Map.entry(Type.Zn, Color.GREEN))).build(),
            Type.B1, Vitamin.builder().colorByType(Map.ofEntries(
                    Map.entry(Type.A, Color.WHITE),
                    Map.entry(Type.B2, Color.RED),
                    Map.entry(Type.B3, Color.RED),
                    Map.entry(Type.B5, Color.GREEN),
                    Map.entry(Type.B6, Color.RED),
                    Map.entry(Type.B9, Color.WHITE),
                    Map.entry(Type.B12, Color.RED),
                    Map.entry(Type.C, Color.RED),
                    Map.entry(Type.D, Color.WHITE),
                    Map.entry(Type.E, Color.WHITE),
                    Map.entry(Type.Fe, Color.RED),
                    Map.entry(Type.Cu, Color.WHITE),
                    Map.entry(Type.Zn, Color.WHITE))).build()));


    @Test
    @DisplayName(value = " Должен создать контейнер \"цветов совместимости\" правильно ")
    void createTempContainer_ok() {
        Set<Type> vitaminUser = new HashSet<>();
        vitaminUser.add(Type.A);
        vitaminUser.add(Type.B1);

        Map<Type, CompatibilityCounterItem> expected = Map.of(              // то, каким должен быть результат работы алгоритма
                Type.B1, CompatibilityCounterItem.builder().red(0).green(0).white(1).build(),
                Type.A, CompatibilityCounterItem.builder().red(0).green(0).white(1).build());
        Map<Type, CompatibilityCounterItem> actual = vitaminService.createTempContainer(vitaminUser);
        assertNotNull(actual);
        actual.entrySet().forEach(actualPair -> {
                    assertTrue(expected.containsKey(actualPair.getKey()));
                    CompatibilityCounterItem expectedValue = expected.get(actualPair.getKey());
                    CompatibilityCounterItem actualValue = actualPair.getValue();
                    assertEquals(expectedValue.getRed(), actualValue.getRed());
                    assertEquals(expectedValue.getGreen(), actualValue.getGreen());
                    assertEquals(expectedValue.getWhite(), actualValue.getWhite());
                }
        );
    }

    @Test
    @DisplayName(value = " Должен найти самый проблемный витамин")
    void findWorst_ok() {
        Map<Type, CompatibilityCounterItem> cont = Map.of(
                Type.B1, CompatibilityCounterItem.builder().red(1).green(0).white(1).build(),
                Type.A, CompatibilityCounterItem.builder().red(0).green(0).white(2).build(),
                Type.B2, CompatibilityCounterItem.builder().red(1).green(0).white(1).build());

        Type expectedWorstOne = Type.B1;          // Type.B2 тоже походит -> ?
        Type expectedWorstTwo = Type.B2;
        Type actualWorst = vitaminService.findWorst(cont);

        assertNotNull(actualWorst);
        assertTrue(actualWorst.equals(expectedWorstOne) || actualWorst.equals(expectedWorstTwo));


    }
}