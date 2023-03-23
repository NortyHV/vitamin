package by.home.vitamin.config;

import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Color;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@RequiredArgsConstructor

public class BeanConfiguration {


    @Bean
    public List<Vitamin> vitamins() {

        Vitamin vitamin;

        List<Vitamin> vitaminList = new ArrayList<>();


        Vitamin A = Vitamin.builder()
                .A(Color.GRAY)
                .B1(Color.WHITE)
                .B2(Color.WHITE)
                .B3(Color.WHITE)
                .B5(Color.WHITE)
                .B6(Color.WHITE)
                .B9(Color.WHITE)
                .B12(Color.RED)
                .C(Color.GREEN)
                .D(Color.RED)
                .E(Color.GREEN)
                .Fe(Color.GREEN)
                .Cu(Color.WHITE)
                .Zn(Color.GREEN)
                .build();


        Vitamin B1 = Vitamin.builder()
                .A(Color.WHITE)
                .B1(Color.GRAY)
                .B2(Color.RED)
                .B3(Color.RED)
                .B5(Color.GREEN)
                .B6(Color.RED)
                .B9(Color.WHITE)
                .B12(Color.RED)
                .C(Color.RED)
                .D(Color.WHITE)
                .E(Color.WHITE)
                .Fe(Color.RED)
                .Cu(Color.WHITE)
                .Zn(Color.WHITE)
                .build();




        Vitamin B2 = Vitamin.builder()
                .A(Color.WHITE)
                .B1(Color.RED)
                .B2(Color.GRAY)
                .B3(Color.GREEN)
                .B5(Color.GREEN)
                .B6(Color.GREEN)
                .B9(Color.GREEN)
                .B12(Color.RED)
                .C(Color.WHITE)
                .D(Color.WHITE)
                .E(Color.WHITE)
                .Fe(Color.RED)
                .Cu(Color.WHITE)
                .Zn(Color.WHITE)
                .build();

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
                .A(Color.GRAY)
                .B1()
                .B2()
                .B3()
                .B5()
                .B6()
                .B9()
                .B12()
                .C()
                .D()
                .E()
                .Fe()
                .Cu()
                .Zn()
                .build();

        Vitamin D = Vitamin.builder()
                .A(Color.GRAY)
                .B1()
                .B2()
                .B3()
                .B5()
                .B6()
                .B9()
                .B12()
                .C()
                .D()
                .E()
                .Fe()
                .Cu()
                .Zn()
                .build();

        Vitamin E = Vitamin.builder()
                .A(Color.GRAY)
                .B1()
                .B2()
                .B3()
                .B5()
                .B6()
                .B9()
                .B12()
                .C()
                .D()
                .E()
                .Fe()
                .Cu()
                .Zn()
                .build();

        Vitamin Fe = Vitamin.builder()
                .A(Color.GRAY)
                .B1()
                .B2()
                .B3()
                .B5()
                .B6()
                .B9()
                .B12()
                .C()
                .D()
                .E()
                .Fe()
                .Cu()
                .Zn()
                .build();

        Vitamin Cu = Vitamin.builder()
                .A(Color.GRAY)
                .B1()
                .B2()
                .B3()
                .B5()
                .B6()
                .B9()
                .B12()
                .C()
                .D()
                .E()
                .Fe()
                .Cu()
                .Zn()
                .build();

        Vitamin Zn = Vitamin.builder()
                .A(Color.GRAY)
                .B1()
                .B2()
                .B3()
                .B5()
                .B6()
                .B9()
                .B12()
                .C()
                .D()
                .E()
                .Fe()
                .Cu()
                .Zn()
                .build();


        vitaminList.add(A);
        vitaminList.add(B1);
        vitaminList.add(B2);
        vitaminList.add(B3);
        vitaminList.add(B5);
        vitaminList.add(B6);
        vitaminList.add(B9);
        vitaminList.add(B12);
        vitaminList.add(C);
        vitaminList.add(D);
        vitaminList.add(E);
        vitaminList.add(Fe);
        vitaminList.add(Cu);
        vitaminList.add(Zn);




    }


}
