package org.example;


import org.example.models.Hotel;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Veuillez entrer le nom de votre hôtel");
        String nomHotel = scanner.next();
        Hotel newHotel = new Hotel(nomHotel, 20);

        switch (choix){
            case 1:
                choixOne();
                break;
            case 2:
                choixTwo();
                break;
            case 3:
                choixThree();
                break;
            case 4:
                choixFour();
                break;
            case 0:
                System.out.println("Au revoir !!!");
                break;
            default:
                System.out.println("Choix invalide !!!!");

        }
    }
}