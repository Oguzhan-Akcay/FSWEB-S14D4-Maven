package org.example.model;

public class Chocolate extends ProductForSale{

    private String name;
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }
    public Chocolate(String type, int price, String description, String name) {
        super(type, price, description);
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this.toString());
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + name + '\'' +
                '}';
    }
}
