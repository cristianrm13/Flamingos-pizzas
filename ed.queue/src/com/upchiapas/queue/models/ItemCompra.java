package com.upchiapas.queue.models;

public class ItemCompra {
    private byte id;
    private static byte cantidad=2;
    private String producto;
    private float subtotal;

    public ItemCompra(byte id, String producto, float subtotal) {
        this.id = id;
        this.producto = producto;
      //  this.subtotal = subtotal;
        this.subtotal = (subtotal+79)*2;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getSubtotal() {

        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        int v=Integer.parseInt(String.valueOf(cantidad));
        int v1=Integer.parseInt(String.valueOf(producto));
        subtotal=v1*v;
        this.subtotal = subtotal;
    }

    @Override
public String toString() {
        return "OrdenCompra{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", producto='" + producto + '\'' +
                ", subtotal=" + subtotal +
                '}';
    }
}
