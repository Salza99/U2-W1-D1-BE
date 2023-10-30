package EPICODE.U2W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping extends Alimento {
    private String name;


    public Topping(Double price, Double calories) {
        super(price, calories);
    }





}
