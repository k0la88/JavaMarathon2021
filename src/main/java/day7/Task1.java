package day7;
/*
Скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет реализовать статический метод compareAirplanes,
который в качестве аргументов принимает два объекта класса Airplane (два самолета)
и выводит сообщение в консоль о том, какой из самолетов длиннее
 */
public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Боинг", 2010, 35, 5000, 500);
        Airplane airplane2 = new Airplane("ТУ-160", 1985, 38, 5800, 800);
        Airplane.compareAirplanes(airplane1, airplane2);


    }
}