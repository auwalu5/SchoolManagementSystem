package hu.uni.miskolc.iit;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Mohammed Dauda Yahaya on 01/06/2018.
 */
public class Create {
    public static void main(String[] args) {

        Teacher Mohammed = new Teacher(1,"Mohammed",500);
        Teacher Jerry = new Teacher(2,"Jerry",700);
        Teacher Victor = new Teacher(3,"Victor",600);
        Teacher Salim = new Teacher(5,"Salim",800);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Mohammed);
        teacherList.add(Jerry);
        teacherList.add(Victor);


        Student Gabor = new Student(1,"Gabor",4);
        Student Peter= new Student(2,"Peter Johnson",12);
        Student Salma = new Student(3,"Salma",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Gabor);
        studentList.add(Salma);
        studentList.add(Peter);




        School Model = new School(teacherList,studentList);

        Teacher Morgan = new Teacher(6,"Morgan", 900);

        Model.addTeacher(Morgan);


        Gabor.payFees(5000);
        Peter.payFees(6000);

        System.out.println("Model has earned $"+ Model.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Mohammed.receiveSalary(Mohammed.getSalary());
        System.out.println("Model has spent for salary to " + Mohammed.getName()
                +" and now has $" + Model.getTotalMoneyEarned());

        Victor.receiveSalary(Victor.getSalary());
        System.out.println("Model has spent for salary to " + Victor.getName()
                +" and now has $" + Model.getTotalMoneyEarned());


        System.out.println(Peter);

        Jerry.receiveSalary(Jerry.getSalary());

        System.out.println(Jerry);


    }
}