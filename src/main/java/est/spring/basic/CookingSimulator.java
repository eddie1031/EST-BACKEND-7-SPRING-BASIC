package est.spring.basic;

import java.util.Arrays;
import java.util.List;

public class CookingSimulator {

    public static void main(String[] args){

        Chief chief = new Chief();

        List<String> ingredients = Arrays.asList("김치", "대파", "마늘", "고춧가루");

        chief.cook(ingredients);

    }

}
