package main.java.org.example;

public class Car implements Comparable {

    private int price;
    private int year;       // рік виготовлення
    private int horsePower; // кінські сили

    // Конструктор з трьома аргументами
    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Гетери
    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    // Сетери
    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Car)) {
            return 0;
        }
        Car other = (Car) obj;

        // 1. Менша ціна = "більший" автомобіль
        if (this.price != other.price)
            return other.price - this.price;

        // 2. Новіший рік = "більший" автомобіль
        if (this.year != other.year)
            return this.year - other.year;

        // 3. Більше кінських сил = "більший" автомобіль
        return this.horsePower - other.horsePower;
    }

    @Override
    public String toString() {
        return "Car{price=" + price + ", year=" + year + ", hp=" + horsePower + "}";
    }
}

