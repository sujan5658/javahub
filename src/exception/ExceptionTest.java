
package exception;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
public class ExceptionTest {
    public static void main(String[] args){
        /*int num1,num2,num3;
        num1 = 10;
        num2 = 0;
        num3 = num1/num2;
        System.out.println(num3);
                */
//        int nums[] = new  int[5];
//        nums[0] = 2;
//        nums[5] = 3;
        
        /*String str = "Kathmandu";
        System.out.println(str.charAt(20));*/
        //File f = new File("home/koju/Desktop/Exception.txt");
//        System.out.println("Enter your age : ");
//        int age = new Scanner(System.in).nextInt();
//        if(age>=20 && age<=30)
//            System.out.println("Valid age");
//        else
//            System.out.println("Invalid age");
        
        
        //Declare
        int n1,n2,n3;
        JFrame frame=null;
        try{
            //Input, Process, output
            frame = new JFrame();
            n1=9;
            n2=2;
            n3 = n1/n2;
            System.out.println(n3);
            frame.setTitle("Exception Handeling");
        }
        catch(ArithmeticException ex){
            //Print error message if any problems during any input,process, output
            System.out.println(ex);
        }
        catch(NullPointerException ex){
            System.out.println(ex);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally{  //destory the allocated memory eg. Database connection
            System.out.println("Hello");
        }
    }
}
