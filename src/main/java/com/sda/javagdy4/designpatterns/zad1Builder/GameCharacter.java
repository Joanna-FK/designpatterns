package com.sda.javagdy4.designpatterns.zad1Builder;

public class GameCharacter {
private String name;
private int health, mana, numberOfPoints;

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }

    private GameCharacter(String name, int health, int mana, int numberOfPoints) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.numberOfPoints = numberOfPoints;
    }

    public static class GameCharacterBuilder{

        private String name;
        private int health;
        private int mana;
        private int numberOfPoints;

        public GameCharacterBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GameCharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public GameCharacterBuilder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public GameCharacterBuilder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public GameCharacter createGameCharacter() {
            return new GameCharacter(name, health, mana, numberOfPoints);
        }
    }
}
