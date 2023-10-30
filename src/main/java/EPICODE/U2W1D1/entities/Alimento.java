package EPICODE.U2W1D1.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Alimento {
    private Double price;
    private Double calories;

    public Alimento(Double price, Double calories) {
        this.price = price;
        this.calories = calories;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getPrice() {
        return price;
    }

    public Double getCalories() {
        return calories;
    }
}
