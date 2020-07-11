package com.sda.javagdy4.designpatterns.zad1Builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameCharacter.GameCharacterBuilder gameCharacterBuilder =  new GameCharacter.GameCharacterBuilder();

        List<GameCharacter> gameCharacterList= new ArrayList<>();
        gameCharacterList.add(gameCharacterBuilder.setName("lionHart").createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setHealth(98).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setMana(58).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setNumberOfPoints(563).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setName("lionHart").createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setHealth(98).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setMana(58).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setNumberOfPoints(563).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setName("lionHart").createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setHealth(98).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setMana(58).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setNumberOfPoints(563).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setName("Hart").createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setHealth(75).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setMana(45).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setNumberOfPoints(300).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setName("King").createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setHealth(68).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setMana(47).createGameCharacter());
        gameCharacterList.add(gameCharacterBuilder.setNumberOfPoints(452).createGameCharacter());

        System.out.println(gameCharacterList);
    }
}
