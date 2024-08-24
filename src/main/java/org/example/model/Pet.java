package org.example.model;

public class Pet {
    private String name;
    private int humgerLevel ;
    private int happiniesLevel ;

    public Pet (String name ) {
        this.name = name ;
        this.humgerLevel = 50 ;
        this.happiniesLevel = 50 ;
    }
    public String getName() {
        return name;
    }

    public int getHumgerLevel() {
        return humgerLevel;
    }

    public int getHappiniesLevel() {
        return happiniesLevel;
    }

    public void setHumgerLevel(int humgerLevel) {
        this.humgerLevel = humgerLevel ;
    }

    public void setHappiniesLevel(int happiniesLevel) {
        this.happiniesLevel = happiniesLevel;
    }

//    public void increaseHunger(int amount) {
//        // Use getter and setter to modify the hunger
//        int currentHunger = getHumgerLevel();  // Get current hunger
//        setHumgerLevel(currentHunger + amount); // Increase hunger
//    }
//
//    // Method to decrease hunger
//    public void decreaseHunger(int amount) {
//        int currentHunger = getHappiniesLevel();  // Get current hunger
//        setHumgerLevel(currentHunger - amount); // Decrease hunger
//    }
//
//    public void increaseHappyLevel(int amount) {
//        int currentHappyLevel= getHappiniesLevel();
//        int currentHungerLevel = getHumgerLevel() ;
//        setHappiniesLevel(currentHappyLevel + amount);
//        setHumgerLevel(currentHungerLevel - amount );
//
//    }
}
