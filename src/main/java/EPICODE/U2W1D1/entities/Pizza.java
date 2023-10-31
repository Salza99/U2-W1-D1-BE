package EPICODE.U2W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Pizza  {
    private String name;
    private Double price;
    private List<Topping> ingredients;

    public Pizza(String name, Double price) {
        this.name = name;
        this.price = price;
        ingredients = new ArrayList<>();
    }

    public void addIngredients(Topping ingredient) {
        ingredients.add(ingredient);
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Topping> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
