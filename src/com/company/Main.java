package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Car dodge = new Car(Car.CarColor.RED, "Dodge");
        Car vag = new Car();
        Swimable boat = new Swimable() {
            @Override
            public void swim(float deepness) throws IllegalStateException {

            }
        };

        List<Swimable> participants = new ArrayList<>();
        participants.add(dodge);
        participants.add(vag);
        participants.add(boat);
        Iterator<Swimable> iterator = participants.iterator();
        while (iterator.hasNext()) {
            final Swimable participant = iterator.next();
            if (participant instanceof Car && ((Car) participant).brand.equalsIgnoreCase("dodge")) {
                iterator.remove();
            }
        }
        System.out.println(participants.size());
    }
}
