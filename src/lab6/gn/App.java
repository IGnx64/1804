package lab6.gn;

import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        String study =
                "Создание алгоритмов" +
                        "подавление внеполосного излучения";
        Student student = new Aspirant(study);
        student.setAverageMark(3.0);

        Student[] students = new Student[4];
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = (random.nextBoolean()) ?
                    new Student() : new Aspirant("Study_" + i);
            students[i].setAverageMark(((int) (Math.random() * 5))*1.25);
        }

        for (Student stud : students) {
            System.out.printf(
                    "Scholarship for student/aspirant " +
                            "with average mark = %.2f is %.0f\n",
                    stud.getAverageMark(), stud.getScholarship());
        }
    }
}