package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create a new teacher object
        Teacher Molly = new Teacher(1, "Molly", 1000);
        Teacher Robert = new Teacher(2, "Robert", 2000);
        Teacher Julius = new Teacher(3, "Julius", 900);

        List<Teacher>teacherList = new ArrayList<>();
        teacherList.add(Molly);
        teacherList.add(Robert);
        teacherList.add(Julius);


        Student Larry = new Student(1, "Larry", 4);
        Student Momo = new Student(2, "Momo", 12);
        Student Rosey = new Student(3, "Rosey", 7);

        List<Student>studentList = new ArrayList<>();
        studentList.add(Larry);
        studentList.add(Momo);
        studentList.add(Rosey);

        School wisdom = new School(teacherList, studentList);

        Momo.payFees(3000);

        Rosey.payFees(10000);
        System.out.println("wisdom school has earned $"+ wisdom.getTotalMoneyEarned());
        System.out.println(" Making Wisdom school pay salary");
        Molly.recieveSalary(Molly.getSalary());
        System.out.println("Wisdom school has spent for salary to Molly:"+ Molly.getName() + " now has $" + wisdom.getTotalMoneyEarned());




    }
}
