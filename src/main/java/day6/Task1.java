package day6;

/*
В классах Автомобиль и Мотоцикл реализуйте два метода:
void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
и возвращает разницу между переданным годом и годом выпуска транспортного средства
(возвращаться должно всегда положительное число).
Пример: inputYear передан как 2020, поле класса year инициализировано числом 2010 или наоборот,
должно быть возвращено одно и тоже положительное число 10.
Такого понятия как “некорректный ввод” или любое другое сигнализирующее об ошибке, здесь быть не может.
 */
public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2015, "Урал", "Синий");
        motorbike.info();
        System.out.println("Мотоциклу " + motorbike.yearDifference(2022) + " лет.");
        Car myCar = new Car();
        myCar.setYear(2010);
        myCar.info();
        System.out.println("Автомобилю " + myCar.yearDifference(2020) + " лет.");
    }
}
