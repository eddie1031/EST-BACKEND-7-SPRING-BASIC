package est.spring.basic;

import java.util.List;

public class Chief {

//    private KoreanCuisineAbility ability = new KoreanCuisineAbility();
    private JapaneseCuisineAbility ability = new JapaneseCuisineAbility();

    public void cook(List<String> ingredient) {
        ability.apply(ingredient);
    }

}
