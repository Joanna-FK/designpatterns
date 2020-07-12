package com.sda.javagdy4.designpatterns.decorator.zad2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SimplePizza implements IPizza{
    private List<String> ingredients = new ArrayList<>();
    private double price = 10.00;


    public SimplePizza(){
        this.ingredients.addAll(Arrays.asList("sos",  "cheese"));
    }
    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
