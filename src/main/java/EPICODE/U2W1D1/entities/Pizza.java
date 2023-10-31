package EPICODE.U2W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pizza  {
    private String name;
    private Double price;
    private List<Topping> Ingredients;

    public Pizza(String name, Double price) {
        this.name = name;
        this.price = price;
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
        return Ingredients;
    }

    public void setIngredients(List<Topping> ingredients) {
        Ingredients = ingredients;
    }
}
