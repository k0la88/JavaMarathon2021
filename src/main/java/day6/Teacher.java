package day6;

import java.util.Random;

public class Teacher {
    Random x = new Random();
    private String nameTeacher;
    private String course;
    public Teacher(String nameTeacher, String course) {
        this.nameTeacher = nameTeacher;
        this.course = course;
    }
    public void evaluate(Student student) {

        String result;
        int num = x.nextInt(4) + 2;
        switch (num) {
            case 5:
                result = "отлично";
                break;
            case 4:
                result = "хорошо";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            default:
                result = "неудовлетворительно";
        }
        System.out.println("Преподователь " + nameTeacher + " оценил студента с именем " + student.getNameStudent() +
                " по предмету " + course + " на оценку " + result + ".");
    }
}






