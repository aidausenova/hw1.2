package com.company;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(" Maik ", 96.92, " brown ", Furniture.SOFA);
        room.print();
        room.technic(2020, " notebook ");

        Kitchen kitchen = new Kitchen(" Alim ", 96.92, " brown ", Furniture.SOFA, " plate ",new Balcony(" remont "));
        kitchen.technic(2020,"notebook");
        kitchen.print();

        Kitchen kitchen1= new Kitchen(" Aida", 105.80, " black ", Furniture.SOFA, " spoon ", new Balcony(" remont "));
        kitchen1.technic(2020," freez  ");
        kitchen1.print();

    }
}
