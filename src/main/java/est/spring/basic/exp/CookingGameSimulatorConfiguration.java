package est.spring.basic.exp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CookingGameSimulatorConfiguration {

    @Bean
    public JapaneseCuisineAbility japaneseCuisineAbility() {
        return new JapaneseCuisineAbility();
    }

    @Bean
    public KoreanCuisineAbility koreanCuisineAbility() {
        return new KoreanCuisineAbility();
    }

    @Bean
    public Chief chief() {
        return new Chief(koreanCuisineAbility());
    }

}
