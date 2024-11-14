package est.spring.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class CookingSimulatorApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(
                CookingGameSimulatorConfiguration.class
            );

        List<String> ingredients = Arrays.asList("무", "소고기", "후추");

        // CookingGameSimulatorConfiguration 의 @Bean 메서드 이름과 동일
        Chief chief1 = context.getBean("chief", Chief.class);

        chief1.cook(ingredients);
        chief1.cook(ingredients);

        // CookingGameSimulatorConfiguration 의 @Bean 메서드 이름과 동일
        Chief chief2 = context.getBean("chief", Chief.class);

        chief2.cook(ingredients);
        chief2.cook(ingredients);

        KoreanCuisineAbility appliedCuisineAbility = context.getBean(
                "koreanCuisineAbility"
                , KoreanCuisineAbility.class
        );

        int exp = appliedCuisineAbility.getExp();
        System.out.println("exp = " + exp); // 4

    }

}
