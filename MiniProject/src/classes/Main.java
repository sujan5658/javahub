
package classes;
import lib.Global;
import lib.IO;
public class Main {
    public static void main(String[] args){
        int id = 0;
        String fullName;
        String grade;
        char section;
        double m1,m2,m3,m4;
        double total,average;
        String result;
        String division;
        String remarks;
        
        IO io = new IO();
        io.printMessage("Enter Student id ");
        id = io.readInteger();
        io.printMessage("Enter Student FullName ");
        fullName = io.readString();
        io.printMessage("Enter the grade  ");
        grade = io.readString();
        io.printMessage("Enter section  ");
        section = io.readCharacter();
        io.printMessage("Enter mark m1  ");
        m1 = io.readDouble();
        io.printMessage("Enter mark m2  ");
        m2 = io.readDouble();
        io.printMessage("Enter mark m3  ");
        m3 = io.readDouble();
        io.printMessage("Enter mark m4  ");
        id = io.readInteger();
        io.printMessage("Enter Student FullName ");
        fullName = io.readString();
        io.printMessage("Enter the grade  ");
        grade = io.readString();
        io.printMessage("Enter section  ");
        section = io.readCharacter();
        io.printMessage("Enter mark m1  ");
        m1 = io.readDouble();
        io.printMessage("Enter mark m2  ");
        m2 = io.readDouble();
        io.printMessage("Enter mark m3  ");
        m3 = io.readDouble();
        io.printMessage("Enter mark m4  ");
        m4 = io.readDouble();
        
        Student std = new Student(id,fullName,grade,section,m1,m2,m3,m4);
        std.totalResult();
        io.printMessage(std.toString());
        io.newLine();
        
        Student []stds = new Student[Global.MAX_STUDENTS];
        for(int i=0;i<Global.MAX_STUDENTS;i++){
            System.out.println("Student "+(i+1)+" Details");
            //input values
            //print message for id
            io.printMessage("Enter Student id : ");
            id = io.readInteger();
            io.printMessage("Enter Student FullName ");
            fullName = io.readString();
            io.printMessage("Enter the grade  ");
            grade = io.readString();
            io.printMessage("Enter section  ");
            section = io.readCharacter();
            io.printMessage("Enter mark m1  ");
            m1 = io.readDouble();
            io.printMessage("Enter mark m2  ");
            m2 = io.readDouble();
            io.printMessage("Enter mark m3  ");
            m3 = io.readDouble();
            io.printMessage("Enter mark m4  ");
            m4 = io.readDouble();
            Student s = new Student(id,fullName,grade,section,m1,m2,m3,m4);
            stds[i] = s;
        }
        //process
        for(int i=0;i<Global.MAX_STUDENTS;i++){
            Student s = stds[i];
            s.totalResult();
            stds[i]=s;
        }
        //print
        for(int i=0;i<Global.MAX_STUDENTS;i++){
            System.out.println(stds[i]);
            System.out.println("");
        }
    }
}
