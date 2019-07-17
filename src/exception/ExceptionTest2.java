
package exception;
import java.util.Scanner;
public class ExceptionTest2 {
   public static void main(String[] args){
       int age = 0; 
       try{
            System.out.print("Enter age [ 20 - 30 ]: ");
            age = new Scanner(System.in).nextInt();
            if(age<20 || age>30){
                throw new AgeException("Please Enter age 20-30"); //throw is required to make user define exception to catch block
                //Used for data validation
            }
            System.out.println("AGE : "+age);
       }
       catch(Exception er){
           System.out.println(er);
       }
   } 
}
