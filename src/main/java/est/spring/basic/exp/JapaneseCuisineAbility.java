package est.spring.basic.exp;

import java.util.List;

public class JapaneseCuisineAbility implements CuisineAbility {

    private int exp = 0;

    private void increaseExp() {
        exp++;
    }

    @Override
    public void apply(List<String> ingredient) {
        this.increaseExp();

        String ingredients = String.join(" ", ingredient);
        System.out.println(ingredients + "를 볶아서 일본 음식을 요리했습니다!");

    }

    public int getExp() {
        return this.exp;
    }

}
