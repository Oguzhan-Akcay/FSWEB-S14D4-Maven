package org.example.model;

public class Bread extends ProductForSale{
    private String name;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this.toString());
    }

    public Bread(String type, int price, String description, String name) {
        super(type, price, description);
        this.name = name;
    }



    @Override
    public String toString() {
        return "Bread{" +
                "name='" + name + '\'' +
                '}';
    }
}
