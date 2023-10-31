package EPICODE.U2W1D1;

import EPICODE.U2W1D1.entities.Drink;
import EPICODE.U2W1D1.entities.Pizza;
import EPICODE.U2W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {


    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza("margherita", 4.5);
        List<Topping> margheritaToppings = new ArrayList<>();
        Topping pomodoro = new Topping("pomodoro", 65, 0.0);
        Topping mozzarella = new Topping("mozzarella", 50, 0.0);
        margheritaToppings.add(pomodoro);
        margheritaToppings.add(mozzarella);
        pizza.setIngredients(margheritaToppings);
        return pizza;
    }
    @Bean
    public Pizza pizzachose(Topping a) {
        Pizza pizza = new Pizza("prosciutto", 5.5);
        List<Topping> margheritaToppings = new ArrayList<>();
        Topping pomodoro = new Topping("pomodoro", 65, 0.0);
        Topping mozzarella = new Topping("mozzarella", 50, 0.0);
        margheritaToppings.add(pomodoro);
        margheritaToppings.add(mozzarella);
        margheritaToppings.add(a);
        pizza.setIngredients(margheritaToppings);
        return pizza;
    }

    @Bean
    public Drink coke(){
        return new Drink("coca-cola", 2.5, 150);
    }
    @Bean
    public Drink sprite(){
        return new Drink("sprite", 2.5, 160);
    }
}
