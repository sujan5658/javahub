
package lib;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;
public class IO {
    /**read string from user */
    public String readString(){
        String str_tmp = "";
        str_tmp = new Scanner(System.in).nextLine();
        return str_tmp;
    }
    public String readString(String msg) throws Exception{
        /** read string from user */
        String str_tmp = "";
        System.out.print(msg);
        InputStreamReader isr = new InputStreamReader(System.in);  //make the path between java program and the keyboard
        BufferedReader br = new BufferedReader(isr);
        str_tmp = br.readLine();
        return str_tmp;
    }
    public char readCharacter(){
        String str_tmp = readString();
        char ch = str_tmp.charAt(0);
        return (ch);
    }
    public boolean readBoolean(){
        String str_tmp = readString();
        boolean b = Boolean.parseBoolean(str_tmp);
        return (b);
    }
    public byte readByte(){
        String str_tmp = readString();
        byte bt = Byte.parseByte(str_tmp);
        return (bt);
    }
    public short readShort(){
        String str_tmp = readString();
        short sh = Short.parseShort(str_tmp);
        return (sh);
    }
    public int readInteger(){
        String str_tmp = readString();
        int in = Integer.parseInt(str_tmp);
        return (in);
    }
    public long readLong(){
        String str_tmp = readString();
        long lg = Long.parseLong(str_tmp);
        return (lg);
    }
    public double readDouble(){
        String str_tmp = readString();
        double db = Double.parseDouble(str_tmp);
        return (db);
    }
    public void printMessage(String msg){
        System.out.print(msg+ " : ");
    }
    public void printMessage(String label,String value){
        System.out.print(label+" : "+value);
    }
    public void printMessage(String label,boolean value){
        System.out.print(label+" : "+value);
    }
    public void printMessage(String label,char value){
        System.out.print(label+" : "+value);
    }
    public void printMessage(String label,byte value){
        System.out.print(label+" : "+value);
    }
    public void printMessage(String label,short value){
        System.out.print(label+" : "+value);
    }
    public void printMessage(String label,int value){
        System.out.print(label+" : "+value);
    }
    public void printMessage(String label,long value){
        System.out.print(label+" : "+value);
    }
    public void printMessage(String label,double value){
        System.out.print(label+" : "+value);
    }
    public void newLine(){
        System.out.println("");
    }
}
