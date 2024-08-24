package org.example.servies;

import org.example.model.Pet;

import java.util.Scanner;

public class PetGame {
    private Pet pet;
    private Scanner sc = new Scanner(System.in);
    boolean isAdopted = false;

    public void startGame() {
        int numberGivenByUser ;
        do {
            displayMenuMethods();
            numberGivenByUser = getUserInput();

            if (numberGivenByUser < 0 || numberGivenByUser > 5) {
                System.out.println("Wrong Input");
                System.out.println("********************************");
                continue;
            }
            switch (numberGivenByUser) {
                case 1: adoptPet();
                    break;
                case 2:
                case 3:
                    case  4:
                        if (!isAdopted ) {
                            System.out.println("You msut adopt a Pet first");
                            System.out.println("********************************");

                        }else {
                            hanleChoices(numberGivenByUser);
                            if (pet.getHumgerLevel() >= 90 || pet.getHumgerLevel() < 30 ) {
                                System.out.printf("Game Over, Your Pet's condition has reached to a critical level as hunger Level is %d  ", pet.getHumgerLevel());
                                System.exit(0);
                            }
                            if ( pet.getHappiniesLevel() >= 100 ) {
                                System.out.printf("Game Over, Your Pet's condition has reached to a critical level as Happy Level is %d and now is full  ", pet.getHappiniesLevel());
                                System.exit(0);
                            }
                        }
                        break;
                case 5 :
                    if (!isAdopted) {
                        System.out.println("The Game Ended without Adopting any Pet");
                    } else {
                        System.out.println("Thank you for playing with "+ pet.getName() );
                    }
            }
        }while (numberGivenByUser != 5);
    }

    public void adoptPet() {
        System.out.println("Enter Pet Name");
        String name = sc.next();
        pet = new Pet(name);
        pet.setHumgerLevel(pet.getHumgerLevel());
        pet.setHappiniesLevel(pet.getHappiniesLevel());
        isAdopted = true;
        System.out.printf("Pet %s Adopted Successfully and hunger Level is %d and happinies Level is %d%n", pet.getName(),pet.getHumgerLevel(),pet.getHappiniesLevel());

    }
    public void hanleChoices (int choice) {
        switch (choice) {
            case 2 : {
                pet.setHumgerLevel(pet.getHumgerLevel()+ 10);
                System.out.printf("Pet  is fed and now the level of Hunger is %d  %n", pet.getHumgerLevel());
                if (pet.getHumgerLevel() == 30) {
                    System.out.println("Alert!! Your Pet is very Hungry, You Must Feed Your Pet ");
                } else if (pet.getHumgerLevel() >= 80) {
                    System.out.println("Your Hunger Level of your pet is almost full so try to play with him") ;
                }
                break;
            }
            case 3 : {
                pet.setHappiniesLevel(pet.getHappiniesLevel() + 10);
                pet.setHumgerLevel(pet.getHumgerLevel() - 10);

                System.out.printf("Pet played and happier also the level is %d  %n", pet.getHappiniesLevel());
                if (pet.getHumgerLevel() == 30) {
                    System.out.println("Alert!! Your Pet is very Hungry, You Must Feed Your Pet ");
                }
                break;

            }
            case 4 : {
                System.out.printf("%s Hunger Level is %d and Happinies is %d  %n", pet.getName(), pet.getHumgerLevel(), pet.getHappiniesLevel());
                break;
            }
        }

    }

    public void displayMenuMethods() {
        System.out.println("1. Adopt pet ");
        System.out.println("2. Feed Pet ");
        System.out.println("3. Play with pet ");
        System.out.println("4. Check Status ");
        System.out.println("5. End Game ");
        System.out.println("Enter your choice");
    }

    public int getUserInput() {
        return sc.nextInt();
    }
}
