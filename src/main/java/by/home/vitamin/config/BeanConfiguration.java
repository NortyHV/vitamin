package by.home.vitamin.config;

import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Color;
import by.home.vitamin.model.entity.enums.Type;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;

import java.util.Map;


@Configuration
@RequiredArgsConstructor

public class BeanConfiguration {


    @Bean
    public Map<Type, Vitamin> vitamins() {


        Map<Type, Vitamin> vitaminList = new HashMap<>();


        Vitamin A = Vitamin.builder().colorByType(Map.ofEntries(
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
                Map.entry(Type.Zn, Color.GREEN))).build();
        vitaminList.put(Type.A, A);


        Vitamin B1 = Vitamin.builder().colorByType(Map.ofEntries(
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
                Map.entry(Type.Zn, Color.WHITE))).build();
        vitaminList.put(Type.B1, B1);


        Vitamin B2 = Vitamin.builder().colorByType(Map.ofEntries(
                Map.entry(Type.A, Color.WHITE),
                Map.entry(Type.B1, Color.RED),
                Map.entry(Type.B3, Color.GREEN),
                Map.entry(Type.B5, Color.GREEN),
                Map.entry(Type.B6, Color.GREEN),
                Map.entry(Type.B9, Color.GREEN),
                Map.entry(Type.B12, Color.RED),
                Map.entry(Type.C, Color.WHITE),
                Map.entry(Type.D, Color.WHITE),
                Map.entry(Type.E, Color.WHITE),
                Map.entry(Type.Fe, Color.RED),
                Map.entry(Type.Cu, Color.WHITE),
                Map.entry(Type.Zn, Color.WHITE))).build();
        vitaminList.put(Type.B2, B2);

        Vitamin B3 = Vitamin.builder().colorByType(Map.ofEntries(
                        Map.entry(Type.A, Color.WHITE),
                        Map.entry(Type.B1, Color.RED),
                        Map.entry(Type.B2, Color.GREEN),
                        Map.entry(Type.B3, Color.GRAY),
                        Map.entry(Type.B5, Color.WHITE),
                        Map.entry(Type.B6, Color.GREEN),
                        Map.entry(Type.B9, Color.WHITE),
                        Map.entry(Type.B12, Color.WHITE),
                        Map.entry(Type.C, Color.WHITE),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.WHITE),
                        Map.entry(Type.Fe, Color.GREEN),
                        Map.entry(Type.Cu, Color.GREEN),
                        Map.entry(Type.Zn, Color.WHITE)))
                .build();
        vitaminList.put(Type.B3, B3);


        Vitamin B5 = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.WHITE),
                        Map.entry(Type.B1, Color.GREEN),
                        Map.entry(Type.B2, Color.GREEN),
                        Map.entry(Type.B3, Color.WHITE),
                        Map.entry(Type.B5, Color.GRAY),
                        Map.entry(Type.B6, Color.WHITE),
                        Map.entry(Type.B9, Color.GREEN),
                        Map.entry(Type.B12, Color.GREEN),
                        Map.entry(Type.C, Color.GREEN),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.WHITE),
                        Map.entry(Type.Fe, Color.WHITE),
                        Map.entry(Type.Cu, Color.RED),
                        Map.entry(Type.Zn, Color.WHITE)))
                .build();
        vitaminList.put(Type.B5, B5);


        Vitamin B6 = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.WHITE),
                        Map.entry(Type.B1, Color.RED),
                        Map.entry(Type.B2, Color.GREEN),
                        Map.entry(Type.B3, Color.GREEN),
                        Map.entry(Type.B5, Color.WHITE),
                        Map.entry(Type.B6, Color.GRAY),
                        Map.entry(Type.B9, Color.WHITE),
                        Map.entry(Type.B12, Color.RED),
                        Map.entry(Type.C, Color.WHITE),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.WHITE),
                        Map.entry(Type.Fe, Color.WHITE),
                        Map.entry(Type.Cu, Color.GREEN),
                        Map.entry(Type.Zn, Color.GREEN)))
                .build();
        vitaminList.put(Type.B6, B6);


        Vitamin B9 = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.WHITE),
                        Map.entry(Type.B1, Color.WHITE),
                        Map.entry(Type.B2, Color.GREEN),
                        Map.entry(Type.B3, Color.WHITE),
                        Map.entry(Type.B5, Color.GREEN),
                        Map.entry(Type.B6, Color.WHITE),
                        Map.entry(Type.B9, Color.GRAY),
                        Map.entry(Type.B12, Color.GREEN),
                        Map.entry(Type.C, Color.GREEN),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.WHITE),
                        Map.entry(Type.Fe, Color.WHITE),
                        Map.entry(Type.Cu, Color.WHITE),
                        Map.entry(Type.Zn, Color.RED)))
                .build();
        vitaminList.put(Type.B9, B9);


        Vitamin B12 = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.RED),
                        Map.entry(Type.B1, Color.RED),
                        Map.entry(Type.B2, Color.RED),
                        Map.entry(Type.B3, Color.WHITE),
                        Map.entry(Type.B5, Color.GREEN),
                        Map.entry(Type.B6, Color.RED),
                        Map.entry(Type.B9, Color.GREEN),
                        Map.entry(Type.B12, Color.GRAY),
                        Map.entry(Type.C, Color.RED),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.RED),
                        Map.entry(Type.Fe, Color.RED),
                        Map.entry(Type.Cu, Color.RED),
                        Map.entry(Type.Zn, Color.WHITE)))
                .build();
        vitaminList.put(Type.B12, B12);


        Vitamin C = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.GREEN),
                        Map.entry(Type.B1, Color.RED),
                        Map.entry(Type.B2, Color.WHITE),
                        Map.entry(Type.B3, Color.WHITE),
                        Map.entry(Type.B5, Color.GREEN),
                        Map.entry(Type.B6, Color.WHITE),
                        Map.entry(Type.B9, Color.GREEN),
                        Map.entry(Type.B12, Color.RED),
                        Map.entry(Type.C, Color.GRAY),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.GREEN),
                        Map.entry(Type.Fe, Color.GREEN),
                        Map.entry(Type.Cu, Color.RED),
                        Map.entry(Type.Zn, Color.WHITE)))
                .build();
        vitaminList.put(Type.C, C);


        Vitamin D = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.RED),
                        Map.entry(Type.B1, Color.WHITE),
                        Map.entry(Type.B2, Color.WHITE),
                        Map.entry(Type.B3, Color.WHITE),
                        Map.entry(Type.B5, Color.WHITE),
                        Map.entry(Type.B6, Color.WHITE),
                        Map.entry(Type.B9, Color.WHITE),
                        Map.entry(Type.B12, Color.WHITE),
                        Map.entry(Type.C, Color.WHITE),
                        Map.entry(Type.D, Color.GRAY),
                        Map.entry(Type.E, Color.RED),
                        Map.entry(Type.Fe, Color.WHITE),
                        Map.entry(Type.Cu, Color.WHITE),
                        Map.entry(Type.Zn, Color.WHITE)))
                .build();
        vitaminList.put(Type.D, D);


        Vitamin E = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.GREEN),
                        Map.entry(Type.B1, Color.WHITE),
                        Map.entry(Type.B2, Color.WHITE),
                        Map.entry(Type.B3, Color.WHITE),
                        Map.entry(Type.B5, Color.WHITE),
                        Map.entry(Type.B6, Color.WHITE),
                        Map.entry(Type.B9, Color.WHITE),
                        Map.entry(Type.B12, Color.RED),
                        Map.entry(Type.C, Color.GREEN),
                        Map.entry(Type.D, Color.RED),
                        Map.entry(Type.E, Color.GRAY),
                        Map.entry(Type.Fe, Color.RED),
                        Map.entry(Type.Cu, Color.RED),
                        Map.entry(Type.Zn, Color.RED)))
                .build();
        vitaminList.put(Type.E, E);


        Vitamin Fe = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.GREEN),
                        Map.entry(Type.B1, Color.RED),
                        Map.entry(Type.B2, Color.RED),
                        Map.entry(Type.B3, Color.GREEN),
                        Map.entry(Type.B5, Color.WHITE),
                        Map.entry(Type.B6, Color.WHITE),
                        Map.entry(Type.B9, Color.WHITE),
                        Map.entry(Type.B12, Color.RED),
                        Map.entry(Type.C, Color.GREEN),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.RED),
                        Map.entry(Type.Fe, Color.GRAY),
                        Map.entry(Type.Cu, Color.GREEN),
                        Map.entry(Type.Zn, Color.RED)))
                .build();
        vitaminList.put(Type.Fe, Fe);


        Vitamin Cu = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.WHITE),
                        Map.entry(Type.B1, Color.WHITE),
                        Map.entry(Type.B2, Color.RED),
                        Map.entry(Type.B3, Color.GREEN),
                        Map.entry(Type.B5, Color.RED),
                        Map.entry(Type.B6, Color.GREEN),
                        Map.entry(Type.B9, Color.WHITE),
                        Map.entry(Type.B12, Color.RED),
                        Map.entry(Type.C, Color.RED),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.RED),
                        Map.entry(Type.Fe, Color.GREEN),
                        Map.entry(Type.Cu, Color.GRAY),
                        Map.entry(Type.Zn, Color.RED)))
                .build();
        vitaminList.put(Type.Cu, Cu);


        Vitamin Zn = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.GREEN),
                        Map.entry(Type.B1, Color.WHITE),
                        Map.entry(Type.B2, Color.GREEN),
                        Map.entry(Type.B3, Color.WHITE),
                        Map.entry(Type.B5, Color.WHITE),
                        Map.entry(Type.B6, Color.GREEN),
                        Map.entry(Type.B9, Color.WHITE),
                        Map.entry(Type.B12, Color.WHITE),
                        Map.entry(Type.C, Color.WHITE),
                        Map.entry(Type.D, Color.WHITE),
                        Map.entry(Type.E, Color.RED),
                        Map.entry(Type.Fe, Color.RED),
                        Map.entry(Type.Cu, Color.RED),
                        Map.entry(Type.Zn, Color.GRAY)))
                .build();
        vitaminList.put(Type.Zn, Zn);


        return vitaminList;


    }
}


