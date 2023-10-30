package EPICODE.U2W1D1;

import EPICODE.U2W1D1.entities.Pizza;
import EPICODE.U2W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    public Pizza getPizza(List<Topping> ingredient) {
        Topping toppingTotale = ingredient.stream().reduce((topping, topping2) -> {
            topping.setCalories(topping.getCalories() + topping2.getCalories());
            topping.setPrice(topping.getPrice() + topping2.getPrice());
            return topping;
        }).get();

        return new Pizza(toppingTotale.getPrice(), toppingTotale.getCalories(), ingredient);
    }
}
