package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] productos = {"Cheetos", "Coca-cola", "Galletas", "Chocolatina", "Agua"};
        int[] precios = {2000, 3000, 2500, 3500, 1500 };

        Scanner scanner = new Scanner(System.in);
        int totalCompra = 0;
        int dineroIngresado = 0;
        boolean sesionActiva = true;
        int opcion = 0;

        while (sesionActiva){
            System.out.println("MAQUINA EXPENDEDORA");
            System.out.println("1. Ver productos disponibles");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Seleccionar productos");
            System.out.println("4. Terminar compra");
            System.out.println("5.Salir. ");
            System.out.println("Escoja un producto: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    opcion = scanner.nextInt();
                    System.out.println("PRODUCTOS DISPONIBLES");
                    for (int i = 0; i < productos.length; i++){
                        System.out.println((i+1) + ". " + productos[i] + ": $" + precios[i]);
                    }
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad de dinero: $ ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    if (cantidad > 0){
                        dineroIngresado += cantidad;
                        System.out.println("Dinero total ingresado: $ " + dineroIngresado);
                    } else {
                        System.out.println("Ingrese una cantidad valida");
                    }
                    break;
                case 3:
                    if (dineroIngresado <= 0){
                        System.out.println("Primero debe ingresar dinero. ");
                        break;
                    }
                    System.out.println("Seleccione minimo 5 productos");
                    int productosseleccionados = 0;

                    while (productosseleccionados >= 5){
                        System.out.println("Productos disponibles: ");
                        for(int i = 0; i < productos.length; i++){
                            System.out.println((i+1) + ". " + productos[i] + "$ " + precios[i]);
                        }

                    }


            }


        }




    }
}