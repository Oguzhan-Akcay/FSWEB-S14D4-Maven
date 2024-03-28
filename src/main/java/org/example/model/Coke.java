package org.example.model;

public class Coke extends ProductForSale{
    private String name;
    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, String name) {
        super(type, price, description);
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this.toString());
    }

    @Override
    public String toString() {
        return "Coke{" +
                "name='" + name + '\'' +
                '}';
    }
}
