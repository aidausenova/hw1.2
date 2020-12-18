package com.company;

public final class Kitchen extends Room{

    private String dish;
    private Balcony balcony;

    public Kitchen(String owner, double square, String color, Furniture furniture, String dish, Balcony balcony) {
        super(owner, square, color, furniture);
        this.dish = dish;
        this.balcony = balcony;
    }

    public String getDish() {
        return dish;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" dish"+ dish + " balcony"+ balcony.getRemont());
    }

    @Override
    public void technic(int year) {
        System.out.println("year 7"+ year );
    }
}
