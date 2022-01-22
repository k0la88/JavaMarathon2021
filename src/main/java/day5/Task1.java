package day5;
/*
Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */

public class Task1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setYear(2015);
        myCar.setColor("красный");
        myCar.setModel("седан");

        System.out.print("Мой автомобиль: " + myCar.getColor() + " " + myCar.getModel() + " " + myCar.getYear() + " год выпуска.");

    }
}
