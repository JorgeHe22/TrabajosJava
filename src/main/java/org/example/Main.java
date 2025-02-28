package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int victoriasBot1 = 0;
        int victoriasBot2 = 0;
        int ronda = 1;
        Random random = new Random();

        System.out.println("1. piedra\n2.Papel \n3.Tijera ");
        while (victoriasBot1 < 2 && victoriasBot2 < 2) {
            System.out.println("Ronda " + ronda + "---");
            int op1 = random.nextInt(3) + 1;
            int op2 = random.nextInt(3) + 1;

            System.out.println("Bot1 elige: " + convertiraOpcion(op1));
            System.out.println("Bot2 elige: " + convertiraOpcion(op2));

            if (op1 == op2) {
                System.out.println("Ronda empatada");
            } else if ((op1 == 1 && op2 == 2) || (op1 == 2 && op2 == 1) || (op1 == 3 && op2 == 2)) {
                System.out.println("Bot1 gana esta ronda");
                victoriasBot1++;
            } else {
                System.out.println("Bot2 gana esta ronda");
                victoriasBot2++;
            }
            ronda++;
        }
        System.out.println("Resultado final");
        if (victoriasBot1 > victoriasBot2) {
            System.out.println("El bot1 gana el juego");
        } else {
            System.out.println("El bot2 gana el juego");
        }
    }
    public static String convertiraOpcion(int numero){
        if (numero == 1) {
            return "Piedra";
        } else if (numero == 2) {
            return"Papel";
        } else {
            return "Tijera";
        }
    }
}