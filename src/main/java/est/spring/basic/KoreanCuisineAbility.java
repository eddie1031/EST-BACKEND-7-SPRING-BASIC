package est.spring.basic;

import java.util.List;

public class KoreanCuisineAbility implements CuisineAbility{

    private int exp = 0;

    private void increaseExp() {
        exp++;
    }

    @Override
    public void apply(List<String> ingredient) {
        this.increaseExp();

        String ingredients = String.join(" ", ingredient);
        System.out.println(ingredients + "를 끓여서 한국 음식을 요리했습니다!");

    }

    public int getExp() {
        return this.exp;
    }

}
