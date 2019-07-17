
package oop;
//Access specifier
public class Class1 {
    int a;  //default   //can be accessed inside of current package 
    public int b;  //public   //can be accessed by classes inside or outside package
    protected int c; //protected  //can be accessed in sub classes
    private int d; //private //can be accessed by only current class.
    public void f1(String str){
        System.out.println(str);
    }
    public void f1(int n1){
        System.out.println(n1);
    }
    public void f1(double n1){
        System.out.println(n1);
    }
}
