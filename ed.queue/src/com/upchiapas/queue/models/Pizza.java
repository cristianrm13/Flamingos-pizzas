package com.upchiapas.queue.models;

public class Pizza {
    private short id;
    private String especialiadad;
    private float precio;

    public Pizza() {
    }

    public Pizza(short id, String especialiadad, float precio) {
        this.id = id;
        this.especialiadad = especialiadad;
        this.precio = precio;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getEspecialiadad() {
        return especialiadad;
    }

    public void setEspecialiadad(String especialiadad) {
        this.especialiadad = especialiadad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", especialiadad='" + especialiadad + '\'' +
                '}';
    }
}



