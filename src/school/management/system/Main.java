package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy Peak", 800, "Math");
        Teacher ron = new Teacher(2, "Ron McDonald", 700, "Englisch");
        Teacher vanessa = new Teacher(3, "Vanessa Kua", 600, "Biology");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(ron);
        teacherList.add(vanessa);

        Student tamara = new Student(1, "Tamara Todevska", 2);
        Student thomas = new Student(2, "Thomas Donut", 2);
        Student miley = new Student(3, "Miley Cyrus", 1);
        Student ozzy = new Student(4, "Ozzy Osbourne", 3);
        Student patricia = new Student(5, "Patricia Rush", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(thomas);
        studentList.add(miley);
        studentList.add(ozzy);
        studentList.add(patricia);

        School ghs = new School(teacherList, studentList);

        tamara.payFees(5000);
        ozzy.payFees(1000);
        System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned()+ "$");

        System.out.println("----------SCHOOL SALARY----------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + ": " + lizzy.getSalary() + "$ and now has: " + ghs.getTotalMoneyEarned()+ "$");
        ron.receiveSalary(ron.getSalary());
        System.out.println("GHS has spent for salary to " + ron.getName() + ": " + ron.getSalary() + "$ and now has: " + ghs.getTotalMoneyEarned()+ "$");

        System.out.println(miley);
        System.out.println(vanessa);
        System.out.println(lizzy);



    }
}
