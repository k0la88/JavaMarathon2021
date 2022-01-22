package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuel = 0;

    public Airplane(String manufacturer, int year, double length, double weight, double fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }
    void info(){
        System.out.print("Изготовитель: " + manufacturer);
        System.out.print(", год выпуска: "+ year);
        System.out.print(", длина: "+ length);
        System.out.print(", вес: "+ weight);
        System.out.println(", количество топлива в баке: "+ fuel);

    }
    public void fillUp(int n){
        this.fuel += n;
    }
}
