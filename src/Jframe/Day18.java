
package Jframe;
import  javax.swing.JFrame;

public class Day18 {
    JFrame frame;
    public Day18(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Exit the box while closing
        frame.setSize(250,350);
        frame.setResizable(false);
        frame.setTitle("First Jframe");
        frame.setVisible(true);
        System.out.println(frame.getTitle());
    }
    public static void main(String[] args){
        new Day18();
    }
}
