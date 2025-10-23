package main.java.org.example;

public class Smartphone implements GPS, Cellular {

    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    @Override
    public double[] getCoordinates() {
        // Імітація отримання координат
        return new double[]{48.3794, 31.1656}; // наприклад, координати України
    }

    @Override
    public void makeCall() {
        System.out.println(model + " робить дзвінок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + " отримує дзвінок...");
    }

    @Override
    public String toString() {
        return "Smartphone{" + "model='" + model + '\'' + '}';
    }
}

