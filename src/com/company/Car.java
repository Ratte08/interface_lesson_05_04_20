package com.company;

public class Car implements Swimable {

    CarColor color;
    final String brand;

    public Car() {
        color = CarColor.BLACK;
        brand = "VolksWagen";
    }

    public Car(CarColor color) {
        this.color = color;
        brand = "VolksWagen";
    }

    public Car(CarColor color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand is " + brand + "\nColor like " + color.toString() + ".";
    }

    @Override
    public void swim(float deepness) {
        if (deepness <= 1f) {
            System.out.println("Offroad, bitch");
        } else throw new IllegalStateException("Nooo");
    }

    enum CarColor {
        RED,
        GREEN,
        BLUE,
        WHITE,
        BLACK;


        @Override
        public String toString() {
            switch (this) {
                case RED:
                    return "Goes fasta";
                case GREEN:
                    return "Trava u doma";
                case BLUE:
                    return "Blue moon";
                case BLACK:
                    return "Deep dark fantasies";
                case WHITE:
                    return "Power";
                default:
                    return "unknown color";
            }

        }
    }

}
