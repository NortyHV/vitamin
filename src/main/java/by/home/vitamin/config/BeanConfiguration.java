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

        Vitamin B9 = Vitamin.builder().colorByType(Map.ofEntries(

                        Map.entry(Type.A, Color.WHITE)
                        Map.entry(Type.B1.Color.WHITE),
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


        Vitamin B12 = Vitamin.builder().colorByType(Map.ofEntries(

                .A(Color.RED)
                .B1(Color.RED)
                .B2(Color.RED)
                .B3(Color.WHITE)
                .B5(Color.GREEN)
                .B6(Color.RED)
                .B9(Color.GREEN)
                .B12(Color.GRAY)
                .C(Color.RED)
                .D(Color.WHITE)
                .E(Color.RED)
                .Fe(Color.RED)
                .Cu(Color.RED)
                .Zn(Color.WHITE)
                .build();


        Vitamin C = Vitamin.builder().colorByType(Map.ofEntries(

                .A(Color.GREEN)
                .B1(Color.RED)
                .B2(Color.WHITE)
                .B3(Color.WHITE)
                .B5(Color.GREEN)
                .B6(Color.WHITE)
                .B9(Color.GREEN)
                .B12(Color.RED)
                .C(Color.GRAY)
                .D(Color.WHITE)
                .E(Color.GREEN)
                .Fe(Color.GREEN)
                .Cu(Color.RED)
                .Zn(Color.WHITE)
                .build();


        Vitamin D = Vitamin.builder().colorByType(Map.ofEntries(

                .A(Color.RED)
                .B1(Color.WHITE)
                .B2(Color.WHITE)
                .B3(Color.WHITE)
                .B5(Color.WHITE)
                .B6(Color.WHITE)
                .B9(Color.WHITE)
                .B12(Color.WHITE)
                .C(Color.WHITE)
                .D(Color.GRAY)
                .E(Color.RED)
                .Fe(Color.WHITE)
                .Cu(Color.WHITE)
                .Zn(Color.WHITE)
                .build();


        Vitamin E = Vitamin.builder().colorByType(Map.ofEntries(

                .A(Color.GREEN)
                .B1(Color.WHITE)
                .B2(Color.WHITE)
                .B3(Color.WHITE)
                .B5(Color.WHITE)
                .B6(Color.WHITE)
                .B9(Color.WHITE)
                .B12(Color.RED)
                .C(Color.GREEN)
                .D(Color.RED)
                .E(Color.GRAY)
                .Fe(Color.RED)
                .Cu(Color.RED)
                .Zn(Color.RED)
                .build();


        Vitamin Fe = Vitamin.builder().colorByType(Map.ofEntries(

                .A(Color.GREEN)
                .B1(Color.RED)
                .B2(Color.RED)
                .B3(Color.GREEN)
                .B5(Color.WHITE)
                .B6(Color.WHITE)
                .B9(Color.WHITE)
                .B12(Color.RED)
                .C(Color.GREEN)
                .D(Color.WHITE)
                .E(Color.RED)
                .Fe(Color.GRAY)
                .Cu(Color.GREEN)
                .Zn(Color.RED)
                .build();


        Vitamin Cu = Vitamin.builder().colorByType(Map.ofEntries(

                .A(Color.WHITE)
                .B1(Color.WHITE)
                .B2(Color.RED)
                .B3(Color.GREEN)
                .B5(Color.RED)
                .B6(Color.GREEN)
                .B9(Color.WHITE)
                .B12(Color.RED)
                .C(Color.RED)
                .D(Color.WHITE)
                .E(Color.RED)
                .Fe(Color.GREEN)
                .Cu(Color.GRAY)
                .Zn(Color.RED)
                .build();


        Vitamin Zn = Vitamin.builder().colorByType(Map.ofEntries(

                .A(Color.GREEN)
                .B1(Color.WHITE)
                .B2(Color.GREEN)
                .B3(Color.WHITE)
                .B5(Color.WHITE)
                .B6(Color.GREEN)
                .B9(Color.WHITE)
                .B12(Color.WHITE)
                .C(Color.WHITE)
                .D(Color.WHITE)
                .E(Color.RED)
                .Fe(Color.RED)
                .Cu(Color.RED)
                .Zn(Color.GRAY)
                .build();
    }


    @Bean
    public Map<Type, Vitamin> vitaminsMap(Vitamin A,
                                          Vitamin B1,
                                          Vitamin B2,
                                          Vitamin B3,
                                          Vitamin B5,
                                          Vitamin B6,
                                          Vitamin B9,
                                          Vitamin B12,
                                          Vitamin C,
                                          Vitamin D,
                                          Vitamin E,
                                          Vitamin Fe,
                                          Vitamin Cu,
                                          Vitamin Zn) {
        return Map.ofEntries(
                Map.entry(Type.A, A),
                Map.entry(Type.B1, B1),
                Map.entry(Type.B2, B2),
                Map.entry(Type.B3, B3),
                Map.entry(Type.B5, B5),
                Map.entry(Type.B6, B6),
                Map.entry(Type.B9, B9),
                Map.entry(Type.B12, B12),
                Map.entry(Type.C, C),
                Map.entry(Type.D, D),
                Map.entry(Type.E, E),
                Map.entry(Type.Fe, Fe),
                Map.entry(Type.Cu, Cu),
                Map.entry(Type.Zn, Zn));
    }

        return vitaminList;


}
}


