package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 50000;
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        boolean continuar =  true;

        System.out.println("Bienvenido al cajero automatico");

        while(continuar){
            System.out.println("Menú principal");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.print("4. Salir");
            System.out.println("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Consulta de tu saldo");
                    System.out.println("Su saldo actual es $");
                    break;
                case 2:
                    System.out.println("Ingresa tu dinero");
                    System.out.println("Ingrese la cantidad a depositar $");
                    double ingreso = teclado.nextDouble();
                    if (ingreso > 0){
                        saldo = saldo + ingreso;
                        System.out.println("El deposito ha sido exitoso. Su nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("El valor no es valido");
                    }
            }
        }

    }
}