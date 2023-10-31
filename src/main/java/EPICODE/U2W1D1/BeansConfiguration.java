package EPICODE.U2W1D1;

import EPICODE.U2W1D1.entities.Drink;
import EPICODE.U2W1D1.entities.Menu;
import EPICODE.U2W1D1.entities.Pizza;
import EPICODE.U2W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {


    @Bean
    public Menu menu(Pizza margherita, Drink coke){
    Menu menu = new Menu();
    menu.addPizza(margherita);
    menu.addBeverage(coke);
    return menu;
    }
    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza("margherita", 4.5);
        List<Topping> margheritaToppings = new ArrayList<>();
        Topping pomodoro = new Topping("pomodoro", 65, 0.0);
        Topping mozzarella = new Topping("mozzarella", 50, 0.0);
        pizza.addIngredients(pomodoro);
        pizza.addIngredients(mozzarella);
        return pizza;
    }
    @Bean
    public Pizza pizzaChose(Topping prosciutto) {
        Pizza pizza = new Pizza("prosciutto", 5.5);

        Topping pomodoro = new Topping("pomodoro", 65, 0.0);
        Topping mozzarella = new Topping("mozzarella", 50, 0.0);
        pizza.addIngredients(pomodoro);
        pizza.addIngredients(mozzarella);
        pizza.addIngredients(prosciutto);
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
    @Bean
    public Topping prosciutto() {return new Topping("prosciutto", 45, 1.0);}
}
