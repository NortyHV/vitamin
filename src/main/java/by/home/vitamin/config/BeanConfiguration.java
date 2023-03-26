package by.home.vitamin.config;

import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Color;
import by.home.vitamin.model.entity.enums.Type;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;

import java.util.Map;

import static by.home.vitamin.model.entity.enums.Type.*;

@Configuration
@RequiredArgsConstructor

public class BeanConfiguration {


    @Bean
    public Map<Type, Vitamin> vitamins() {


        Map<Type, Vitamin> vitaminList = new HashMap<>();


        Vitamin A = Vitamin.builder().colorByType(Map.ofEntries(Map.entry( Type.B1, Color.WHITE),
              Map.entry(Type.B2, Color.WHITE),
                Map.entry(Type.B2, Color.WHITE),
                Map.entry(Type.B3, Color.WHITE),
                Map.entry(Type.B5, Color.WHITE),
                Map.entry(Type.B6, Color.WHITE),
                Map.entry(Type.B9, Color.WHITE),
                Map.entry(Type.B12, Color.RED),
                Map.entry(Type.C, Color.GREEN),
                Map.entry(Type.D, Color.RED),
                Map.entry(Type.E, Color.GREEN),
                Map.entry(Type.Cu, Color.WHITE),
                Map.entry(Type.Zn, Color.GREEN))).build();

vitaminList.put(Type.A, A);



//                .A(Color.GRAY)
//                .B1(Color.WHITE)
//                .B2(Color.WHITE)
//                .B3(Color.WHITE)
//                .B5(Color.WHITE)
//                .B6(Color.WHITE)
//                .B9(Color.WHITE)
//                .B12(Color.RED)
//                .C(Color.GREEN)
//                .D(Color.RED)
//                .E(Color.GREEN)
//                .Fe(Color.GREEN)
//                .Cu(Color.WHITE)
//                .Zn(Color.GREEN)
//                .build();


        Vitamin B1 = Vitamin.builder().colorByType(Type.)..build();
//                .A(Color.WHITE)
//                .B1(Color.GRAY)
//                .B2(Color.RED)
//                .B3(Color.RED)
//                .B5(Color.GREEN)
//                .B6(Color.RED)
//                .B9(Color.WHITE)
//                .B12(Color.RED)
//                .C(Color.RED)
//                .D(Color.WHITE)
//                .E(Color.WHITE)
//                .Fe(Color.RED)
//                .Cu(Color.WHITE)
//                .Zn(Color.WHITE)
//                .build();


        Vitamin B2 = Vitamin.builder().colorByType(Type.A, Color.WHITE)
//                .A(Color.WHITE)
//                .B1(Color.RED)
//                .B2(Color.GRAY)
//                .B3(Color.GREEN)
//                .B5(Color.GREEN)
//                .B6(Color.GREEN)
//                .B9(Color.GREEN)
//                .B12(Color.RED)
//                .C(Color.WHITE)
//                .D(Color.WHITE)
//                .E(Color.WHITE)
//                .Fe(Color.RED)
//                .Cu(Color.WHITE)
//                .Zn(Color.WHITE)
//                .build();

        Vitamin B3 = Vitamin.builder()
                .A(Color.WHITE)
                .B1(Color.RED)
                .B2(Color.GREEN)
                .B3(Color.GRAY)
                .B5(Color.WHITE)
                .B6(Color.GREEN)
                .B9(Color.WHITE)
                .B12(Color.WHITE)
                .C(Color.WHITE)
                .D(Color.WHITE)
                .E(Color.WHITE)
                .Fe(Color.GREEN)
                .Cu(Color.GREEN)
                .Zn(Color.WHITE)
                .build();

        Vitamin B5 = Vitamin.builder()
                .A(Color.WHITE)
                .B1(Color.GREEN)
                .B2(Color.GREEN)
                .B3(Color.WHITE)
                .B5(Color.GRAY)
                .B6(Color.WHITE)
                .B9(Color.GREEN)
                .B12(Color.GREEN)
                .C(Color.GREEN)
                .D(Color.WHITE)
                .E(Color.WHITE)
                .Fe(Color.WHITE)
                .Cu(Color.RED)
                .Zn(Color.WHITE)
                .build();


        Vitamin B6 = Vitamin.builder()
                .A(Color.WHITE)
                .B1(Color.RED)
                .B2(Color.GREEN)
                .B3(Color.GREEN)
                .B5(Color.WHITE)
                .B6(Color.GRAY)
                .B9(Color.WHITE)
                .B12(Color.RED)
                .C(Color.WHITE)
                .D(Color.WHITE)
                .E(Color.WHITE)
                .Fe(Color.WHITE)
                .Cu(Color.GREEN)
                .Zn(Color.GREEN)
                .build();

        Vitamin B9 = Vitamin.builder()
                .A(Color.WHITE)
                .B1(Color.WHITE)
                .B2(Color.GREEN)
                .B3(Color.WHITE)
                .B5(Color.GREEN)
                .B6(Color.WHITE)
                .B9(Color.GRAY)
                .B12(Color.GREEN)
                .C(Color.GREEN)
                .D(Color.WHITE)
                .E(Color.WHITE)
                .Fe(Color.WHITE)
                .Cu(Color.WHITE)
                .Zn(Color.RED)
                .build();

        Vitamin B12 = Vitamin.builder()
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

        Vitamin C = Vitamin.builder()
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

        Vitamin D = Vitamin.builder()
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

        Vitamin E = Vitamin.builder()
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

        Vitamin Fe = Vitamin.builder()
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

        Vitamin Cu = Vitamin.builder()
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

        Vitamin Zn = Vitamin.builder()
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




        return vitaminList;

    }


}
