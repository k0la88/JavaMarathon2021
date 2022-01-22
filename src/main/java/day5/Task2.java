package day5;
/*
Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
Вывести в консоль значение каждого из полей, используя get методы.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2015, "Урал", "Синий");
        System.out.println("Мой мотоцикл: " + " " + motorbike.getColor() + " " + motorbike.getModel() + " " + motorbike.getYear() + " год выпуска.");
    }
}
