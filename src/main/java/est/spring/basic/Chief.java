package est.spring.basic;

import java.util.List;

public class Chief {

//    private KoreanCuisineAbility ability = new KoreanCuisineAbility();
//    private JapaneseCuisineAbility ability = new JapaneseCuisineAbility();

    private CuisineAbility cuisineAbility;

    public Chief(CuisineAbility cuisineAbility) {
        this.cuisineAbility = cuisineAbility;
    }

    public void cook(List<String> ingredient) {
        cuisineAbility.apply(ingredient);
    }

}
