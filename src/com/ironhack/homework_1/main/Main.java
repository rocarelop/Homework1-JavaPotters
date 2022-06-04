package com.ironhack.homework_1.main;

import com.ironhack.homework_1.main.Clases.RandomParty;
import com.ironhack.homework_1.main.Clases.Warrior;
import com.ironhack.homework_1.main.Clases.Wizard;

import java.util.Scanner;

import static com.ironhack.homework_1.main.Clases.Customized.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do{
            System.out.println("Por favor seleccionar: \n" +
                    "1. Si quieres una full party random \n" +
                    "2. Si crear tu propio personaje \n");
            option = scanner.nextInt();
        } while (option != 1 && option != 2);

            switch(option){
                case 1:
                    System.out.println("Has elegido crear una full party random");
                    System.out.println("Cuantos jugadores tiene cada equipo?");
                    int numMemberParty = scanner.nextInt();
                    RandomParty team1 = new RandomParty(numMemberParty);
                    RandomParty team2 = new RandomParty(numMemberParty);
                    break;
                case 2:
                    System.out.println("Has elegido crear tu personaje");
                    System.out.println("Cuantos jugadores tiene cada equipo?");
                    numMemberParty = scanner.nextInt();
                    team1 = new RandomParty(numMemberParty);
                    team2 = new RandomParty(numMemberParty);
                    do{
                        System.out.println("Por favor seleccionar: \n" +
                                "1. Si quieres crear un Wizard \n" +
                                "2. Si quieres crear un Warrior \n" +
                                "3.  Ya no quiero mas personajes");
                        option = scanner.nextInt();

                        switch(option){
                            case 1:
                                System.out.println("Creando un mago");
                                Wizard wizard = createCustomizedWizard();
                                break;
                            case 2:
                                System.out.println("Creando un guerrero");
                                Warrior warrior = createCustomizedWarrior();
                                break;
                            case 3:
                                System.out.println("Tu equipo esta completo");
                                break;
                            default:
                                System.out.println("Opcion erronea");
                        }
                    } while (option == 1 || option == 2);

                    ///
                    break;
                default:
                    System.out.println("Opcion erronea");
            }

        scanner.close();
    }


}
