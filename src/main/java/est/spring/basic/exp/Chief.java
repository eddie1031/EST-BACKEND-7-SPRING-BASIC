package est.spring.basic.exp;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
