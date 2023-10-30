package EPICODE.U2W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza extends Alimento {
    private List<Topping> Ingredients;

    public Pizza(Double price, Double calories, List<Topping> ingredients) {
        super(5 + price,250 + calories );
        Ingredients = ingredients;
    }
}
