package com.upchiapas.queue.models;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class OrdenCompra {
    public void orden() {

            String [] orden = {" Mexicana "," Hawaiana "," Cuatro Quesos ", " Peperoni "};
            Random random = new Random(System.nanoTime());
            Queue<ItemCompra> compra = new LinkedList<>();

            for (int i=0; i<5;i++)
                compra.add(new ItemCompra((byte)(i+1),
                        orden[random.nextInt(orden.length)],
                        random.nextFloat()
                ));
            while (!compra.isEmpty())
                System.out.println(compra.poll());

    }
}