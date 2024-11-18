package est.spring.basic.exp;

import java.util.Arrays;
import java.util.List;

public class CookingSimulator {

    public static void main(String[] args){

//        KoreanCuisineAbility koreanCuisineAbility = new KoreanCuisineAbility();
//        JapaneseCuisineAbility japaneseCuisineAbility = new JapaneseCuisineAbility();

//        Chief chief = new Chief(koreanCuisineAbility);
//        Chief chief = new Chief(japaneseCuisineAbility);

        GameConfiguration configuration = new GameConfiguration();

        List<String> ingredients = Arrays.asList("김치", "대파", "마늘", "고춧가루");

        Chief chief1 = configuration.chief();
        Chief chief2 = configuration.chief();

        chief1.cook(ingredients);
        chief2.cook(ingredients);

        KoreanCuisineAbility appliedCuisineAbility = configuration.koreanCuisineAbility();
        int exp = appliedCuisineAbility.getExp();

        System.out.println("exp = " + exp); // 0

    }

}
