package com.company;

public class Room extends House{
    private String color;
    private Furniture furniture;
    private House house;

    public Room(String owner,double square,String color, Furniture furniture) {
        super(owner,square);
        this.furniture = furniture;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public House getHouse() {
        return house;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" color"+ color + " furniture" + furniture);
    }
    public final void technic(int year, String name){
        System.out.println(" year"+ year+ " name"+ name);

    }
    public void technic(int year){
        System.out.println(" year"+ year);

    }
}
