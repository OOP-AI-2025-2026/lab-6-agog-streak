package org.example;

import main.java.org.example.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Mittens");

        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());

        Smartphone phone = new Smartphone("Samsung Galaxy");

        phone.makeCall();
        phone.receiveCall();

        double[] coords = phone.getCoordinates();
        System.out.println("Координати: " + coords[0] + ", " + coords[1]);

        Point p = new Point(2, 3);
        System.out.println("Початкова точка: " + p);

        p.moveTo(5, 7);
        System.out.println("Після переміщення: " + p);

        Car c1 = new Car(20000, 2020, 150);
        Car c2 = new Car(15000, 2021, 130);
        Car c3 = new Car(15000, 2021, 160);

        System.out.println("Порівняння c1 і c2: " + c1.compareTo(c2));
        System.out.println("Порівняння c2 і c3: " + c2.compareTo(c3));
        System.out.println("Порівняння c1 і c3: " + c1.compareTo(c3));
    }
}

