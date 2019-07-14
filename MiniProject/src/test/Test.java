
package test;
import lib.IO;
import classes.Person;
public class Test {
    public static void main(String[] args){
       /* IO obj = new IO();
        boolean b;
        char c;
        byte b1;
        short s1;
        int i1;
        long l1;
        double d1;
        String str1;
        //read and display
        System.out.print("Enter any string : ");
        str1 = obj.readString();
        //System.out.println(str1);
        System.out.print("Enter boolean string : ");
        b = obj.readBoolean();
        //System.out.println(b);
        System.out.print("Enter character  : ");
        c = obj.readCharacter();
        //System.out.println(c);
        System.out.print("Enter byte  : ");
        b1 = obj.readByte();
        //System.out.println(b1);
        System.out.print("Enter short : ");
        s1 = obj.readShort();
        //System.out.println(s1);
        System.out.print("Enter integer  : ");
        i1 = obj.readInteger();
        //System.out.println(i1);
        System.out.print("Enter long : ");
        l1 = obj.readLong();
        //System.out.println(l1);
        System.out.print("Enter double : ");
        d1 = obj.readDouble();
        //System.out.println(d1);
        obj.printMessage("Boolean",b1);
        obj.newLine();
        obj.printMessage("Character",c);
        obj.newLine();
        obj.printMessage("Byte",b);
        obj.newLine();
        obj.printMessage("Short",s1);
        obj.newLine();
        obj.printMessage("Integer",i1);
        obj.newLine();
        obj.printMessage("Long",l1);
        obj.newLine();
        obj.printMessage("Double",d1);
        obj.newLine();
        obj.printMessage("String",str1);
               */
        
        //Person test
        Person p = new Person();
        IO io = new IO();
        io.printMessage("Enter Id : ");
        p.setId(io.readInteger());
        io.printMessage("Enter Full Name : ");
        p.setFullName(io.readString());
        io.printMessage(p.toString());
    }
}
