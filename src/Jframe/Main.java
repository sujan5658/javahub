
package Jframe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       /* Student st1 = new Student();
        Student st2 = new Student(1,"Sujan Koju","B+",70,76);
        Student st3 = new Student(st2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        st1.id = 2;
        st1.name = "Jack Parker";
        st1.grade = "C+";
        st1.mark1 = 40;
        st1.mark2 = 40;
        st1.total = 80;
        st1.average = 40;
        st1.result = "Passed";
        System.out.println(st1);
        //Printing some Properties value of object st3
        System.out.println(st3.getId()+" "+st3.getName()+" "+st3.getGrade()+" "+st3.getResult());
        st3.calculateTotal();
        st3.calculateAvg();;
        st3.calculateResult();
        System.out.println(st3);
               */
        int id,m1,m2;
        String name,grade;
        Student s1;
        
        System.out.print("Enter id : ");
        id = new Scanner(System.in).nextInt();
        System.out.print("Enter name : ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Enter grade : ");
        grade = new Scanner(System.in).nextLine();
        System.out.print("Enter marks1 : ");
        m1 = new Scanner(System.in).nextInt();
        System.out.print("Enter marks2 : ");
        m2 = new Scanner(System.in).nextInt();
        s1 = new Student(id,name,grade,m1,m2);
        s1.processResult();
        System.out.println(s1);
    }
}
