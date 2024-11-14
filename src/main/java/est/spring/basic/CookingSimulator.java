package est.spring.basic;

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
        Chief chief = configuration.chief();

        chief.cook(ingredients);

    }

}
