package day6;

public class Car {
    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void info() {
        System.out.println("Это автомобиль.");
    }

    int yearDifference(int inputYear) {
        int result = inputYear - year;
        if (result > 0) return result;
        else return result * -1;
    }
}
