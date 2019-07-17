
package JavaGui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Day19_1 implements ActionListener{
    JFrame frame;
    JLabel lbl_1;
    JLabel lbl_2,lbl_3;
    JTextField txt_1,txt_2,txt_3;
    JButton btn_add,btn_close;
    public Day19_1(){
        frame = new  JFrame();
        frame.setSize(350,350);
        frame.setTitle("Square Box");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbl_1 = new JLabel();
        lbl_2 = new JLabel();
        lbl_3 = new  JLabel();
        lbl_1.setText("First No : ");
        lbl_2.setText("Second NO :");
        lbl_3.setText("Sum :");
        
        txt_1 = new JTextField();
        txt_1.setColumns(20);
        txt_2 = new JTextField();
        txt_2.setColumns(20);
        txt_3 = new JTextField();
        txt_3.setColumns(8);
        
        btn_add = new JButton();
        btn_add.setText("Add");
        btn_add.addActionListener(this);
        
        btn_close = new JButton();
        btn_close.setText("Close");
        btn_close.addActionListener(this);
        
        frame.setLayout(new FlowLayout());  //Rquire to display anything on jframe.
        frame.add(lbl_1);
        frame.add(txt_1);
        frame.add(lbl_2);
        frame.add(txt_2);
        frame.add(btn_add);
        frame.add(btn_close);
        frame.add(lbl_3);
        frame.add(txt_3);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_add)){
            System.out.println("You clicked on add button");
            double num1,num2,num3;
            num1 = Double.parseDouble(txt_1.getText());
            num2 = Double.parseDouble(txt_2.getText());
            num3 = num1+num2;
            txt_3.setText(Double.toString(num3));
            System.out.println("Result : "+num3);
        }
        if(ae.getSource().equals(btn_close)){
            System.out.println("You clicked on close button");
            System.exit(0);
        }
    }
}
