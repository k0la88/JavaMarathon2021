package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public String toString() {
        return "Изготовитель: " + getManufacturer() + ", год выпуска: " + getYear()
                + ", длина: " + getLength() + ", вес: " + getWeight() + ", количество топлива в баке: " + getFuel();
    }

    void info() {
        System.out.println("Изготовитель: " + getManufacturer() + ", год выпуска: " + getYear()
                + ", длина: " + getLength() + ", вес: " + getWeight() + ", количество топлива в баке: " + getFuel());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }
}
