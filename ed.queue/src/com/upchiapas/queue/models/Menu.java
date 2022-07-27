package com.upchiapas.queue.models;

import java.util.Scanner;

public class Menu {
    public void menuFlamingos() {
        Scanner teclado = new Scanner(System.in);
        Clientes menu = new Clientes();
        OrdenCompra orde = new OrdenCompra();
        CatalogoPizza Cat = new CatalogoPizza();

        Cat.Catalogo();
        int opcion;
        do {
            System.out.println("1. Ordenar pizza");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Reporte de ventas");
            System.out.println("4. Salir");
            System.out.println("seleccione una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    orde.orden();
                    break;
                case 2:
                    menu.burbuja();
                    break;
                case 3:
                    System.out.println("::::::::Falta corregir:::::::::");
                    orde.orden();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (opcion != 4);
    }
}
