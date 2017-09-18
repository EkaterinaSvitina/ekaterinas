package com.company;
import java.util.*;

class Student {
    String name;
    String lastName;
}

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        students[3] = new Student();
        students[4] = new Student();

        students[0].name = "Anna";
        students[0].lastName = "Ivanova";

        students[1].name = "Olga";
        students[1].lastName = "Pi";

        students[2].name = "Ivan";
        students[2].lastName = "Sidorov";

        students[3].name = "Oleg";
        students[3].lastName = "Petrov";

        students[4].name = "Irina";
        students[4].lastName = "Si";

        int [] results = {1,2,3,4,5};
        int [] marks = new int [5];
        double sum = 0;
        double average = 0;

       for (int x = 0; x < results.length; x++)
       {
            System.out.print(students[x].name + " ");
            System.out.print(students[x].lastName + " ");
            int randomIndex = new Random().nextInt(results.length);
            System.out.println(results[randomIndex]);
            marks[x] =  results[randomIndex];
        }

        for (int i = 0; i < marks.length; i++)
        {
            sum = sum + marks[i];
            average = sum/marks.length;
        }

        System.out.println ("\nСредняя оценка по группе: " + average );

    }
}
