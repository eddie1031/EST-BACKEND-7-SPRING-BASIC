package est.spring.basic.exp;

public class GameConfiguration {

    public JapaneseCuisineAbility japaneseCuisineAbility() {
        return new JapaneseCuisineAbility();
    }

    public KoreanCuisineAbility koreanCuisineAbility() {
        return new KoreanCuisineAbility();
    }

    public Chief chief() {
        return new Chief(koreanCuisineAbility());
    }

}
