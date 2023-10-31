package EPICODE.U2W1D1;

import EPICODE.U2W1D1.entities.Drink;
import EPICODE.U2W1D1.entities.Menu;
import EPICODE.U2W1D1.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class U2W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2W1D1Application.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(Menu.class, args);

		Menu menu = context.getBean(Menu.class);
		menu.addPizza((Pizza) context.getBean("margherita", Pizza.class));
		menu.addBeverage((Drink) context.getBean("coke", Drink.class));
		menu.addBeverage((Drink) context.getBean("sprite", Drink.class));
		System.out.println("Menu:");
		System.out.println("Pizzas:");
		menu.getPizzas().forEach(pizza -> System.out.println(pizza.getName()));
		System.out.println("Beverages:");
		menu.getBeverages().forEach(beverage -> System.out.println(beverage.getName()));
	}

}
