package com.upchiapas.queue.models;

import java.util.Scanner;

public class Clientes {
    public void burbuja(){
        Scanner teclado = new Scanner(System.in);
        String nombreCliente[];
        nombreCliente = new String[5];

        for(int i=0;i<5;i++){
            System.out.println("ingrese el nombre: ");
            nombreCliente[i]= teclado.next();
        }

        String aux;
        for(int i=0;i < 5-1;i++){
            for(int j=0;j<5-1;j++){
                if(nombreCliente[j].compareTo(nombreCliente[j+1])>0){
                    aux=nombreCliente[j];
                    nombreCliente[j]=nombreCliente[j+1];
                    nombreCliente[j+1]=aux;
                }
            }
        }
        System.out.println("lista de clientes: ");
        for (int i=0;i<5;i++){
            System.out.println(nombreCliente[i]+" ");
        }
    }
}
