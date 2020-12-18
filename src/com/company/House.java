package com.company;

public class House {
    private String owner;
    private double squareMeter;

    public House(String owner, double squareMeter) {
        this.owner = owner;
        this.squareMeter = squareMeter;
    }

    public String getOwner() {
        return owner;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

   public void print(){
       System.out.println(" owner "+ owner + " sguareMater " + squareMeter);
   }
}
