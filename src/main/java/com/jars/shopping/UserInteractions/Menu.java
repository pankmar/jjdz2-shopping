package com.jars.shopping.UserInteractions;

import java.util.Scanner;

public class Menu {

    public void displayWelcomeScreen() {
        System.out.println("\n\n************************************");
        System.out.println("*****  J  A  R  S  ******2016*******");
        System.out.println("************************************\n\n");
    }

    public void displayMainOptionsAndGotoProperMethod() {
        System.out.println(" Proszę wybrać jedną opcję : ");
        System.out.println("**************************************");
        System.out.println(" 1 --> Identyfikowanie kategorii po serii pytań");
        System.out.println(" 2 --> Identyfikowanie produktu po serii pytań na temat potrzeb");
        if (selector(2) == 1) {identifyCategory();}
    }

    private int selector(int numberOfOptions) throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        int selectedValue = scanner.nextInt();
        if (selectedValue > numberOfOptions || selectedValue <= 0) {
            throw new IllegalArgumentException(" Niewlasciwy wybor. Proszę wybrać od 1 do "+numberOfOptions);
        } else return selectedValue;
    }

    private void identifyCategory(){
        AskQuestions askQuestions = new AskQuestions();
        askQuestions.startAsking();
    }
}
