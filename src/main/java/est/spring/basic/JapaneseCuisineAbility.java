package est.spring.basic;

import java.util.List;

public class JapaneseCuisineAbility {

    private int exp = 0;

    private void increaseExp() {
        exp++;
    }

    public void apply(List<String> ingredient) {
        this.increaseExp();

        String ingredients = String.join(" ", ingredient);
        System.out.println(ingredients + "를 볶아서 일본 음식을 요리했습니다!");

    }

    public int getExp() {
        return this.exp;
    }

}
