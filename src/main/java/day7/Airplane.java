package day7;

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    void info() {
        System.out.println("Изготовитель: " + getManufacturer() + ", год выпуска: " + getYear() +
                ", длина: " + getLength() + ", вес: " + getWeight() + ", количество топлива в баке: " + getFuel());
    }

    public static  void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength() != airplane2.getLength()) {
            System.out.println((airplane1.getLength() > airplane2.getLength())
                    ? airplane1.getManufacturer() + " длиннее чем " + airplane2.getManufacturer()
                    : airplane2.getManufacturer() + " длиннее чем " + airplane1.getManufacturer());
        } else System.out.println("Оба самолета одинаковой длинны.");
    }
}
