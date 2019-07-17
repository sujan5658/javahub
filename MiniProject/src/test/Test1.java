
package test;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import lib.Global;
public class Test1 implements ActionListener {
    JFrame frame;
    JLabel lbl_1,lbl_2,lbl_3,lbl_4,lbl_5,lbl_6,lbl_7,lbl_8,lbl_9,lbl_10,lbl_11,lbl_12,lbl_13;
    JTextField txt_1,txt_2,txt_3,txt_4,txt_5,txt_6,txt_7,txt_8,txt_9,txt_10,txt_11,txt_12,txt_13;
    JButton btn_calc,btn_save,btn_close;
    
    private int id;
    private String name;
    private String grade,section;
    private float mark1,mark2,mark3,mark4;
    private float total,avg;
    private String result,division,remarks;
    public Test1(){
        frame = new JFrame();
        frame.setTitle("Student Result Processing");
        frame.setSize(350,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbl_1 = new JLabel();
        lbl_2 = new JLabel();
        lbl_3 = new JLabel();
        lbl_4 = new JLabel();
        lbl_5 = new JLabel();
        lbl_6 = new JLabel();
        lbl_7 = new JLabel();
        lbl_8 = new JLabel();
        lbl_9 = new JLabel();
        lbl_10 = new JLabel();
        lbl_11 = new JLabel();
        lbl_12 = new JLabel();
        lbl_13 = new JLabel();
        
        txt_1 =new JTextField();
        txt_2 =new JTextField();
        txt_3 =new JTextField();
        txt_4 =new JTextField();
        txt_5 =new JTextField();
        txt_6 =new JTextField();
        txt_7 =new JTextField();
        txt_8 =new JTextField();
        txt_9 =new JTextField();
        txt_10 =new JTextField();
        txt_11 =new JTextField();
        txt_12 =new JTextField();
        txt_13 =new JTextField();
        
        btn_calc = new JButton();
        btn_save = new JButton();
        btn_close = new JButton();
        
        lbl_1.setText("ID : ");
        lbl_2.setText("Full Name : ");
        lbl_3.setText("Grade : ");
        lbl_4.setText("Section : ");
        lbl_5.setText("Mark 1 : ");
        lbl_6.setText("Mark 2 : ");
        lbl_7.setText("Mark 3 : ");
        lbl_8.setText("Mark 4 : ");
        lbl_9.setText("Total : ");
        lbl_10.setText("Average : ");
        lbl_11.setText("Result : ");
        lbl_12.setText("Division : ");
        lbl_13.setText("Remarks : ");
        
        txt_1.setColumns(22);
        txt_2.setColumns(18);
        txt_3.setColumns(20);
        txt_4.setColumns(20);
        txt_5.setColumns(22);
        txt_6.setColumns(22);
        txt_7.setColumns(22);
        txt_8.setColumns(22);
        txt_9.setColumns(22);
        txt_10.setColumns(22);
        txt_11.setColumns(22);
        txt_12.setColumns(22);
        txt_13.setColumns(22);
     
        btn_calc.setText("                         Calculate                        ");
        btn_calc.addActionListener(this);
        btn_save.setText(" Save ");
        btn_save.addActionListener(this);
        btn_close.setText(" Close ");
        btn_close.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.add(lbl_1);
        frame.add(txt_1);
        frame.add(lbl_2);
        frame.add(txt_2);
        frame.add(lbl_3);
        frame.add(txt_3);
        frame.add(lbl_4);
        frame.add(txt_4);
        frame.add(lbl_5);
        frame.add(txt_5);
        frame.add(lbl_6);
        frame.add(txt_6);
        frame.add(lbl_7);
        frame.add(txt_7);
        frame.add(lbl_8);
        frame.add(txt_8);
        frame.add(btn_calc);
        frame.add(lbl_9);
        frame.add(txt_9);
        frame.add(lbl_10);
        frame.add(txt_10);
        frame.add(lbl_11);
        frame.add(txt_11);
        frame.add(lbl_12);
        frame.add(txt_12);
        frame.add(lbl_13);
        frame.add(txt_13);
        frame.add(btn_save);
        frame.add(btn_close);
        frame.setVisible(true);
    }
    private void calculateTotal(){
        this.total = this.mark1+this.mark2+this.mark3+this.mark4;
    }
    private void calculateAverage(){
        this.avg = this.total/4;
    }
    private void calculateResult(){
        if(this.mark1>=Global.PM && this.mark2>=Global.PM && this.mark3>=Global.PM && this.mark4>=Global.PM)
            this.result = "Pass";
        else
            this.result = "Failed";
    }
    private void calculateDivision(){
        if(this.result.equals("Pass")){
            if(this.avg>=Global.DIST)
                this.division = "Distinction";
            else if(this.avg>=Global.FIRST && this.avg<Global.DIST)
                this.division = "First";
            else if(this.avg>=Global.SECOND && this.avg<Global.FIRST)
                this.division = "Second";
            else
                this.division = "Third";
        }
        else
            this.division = "******";
    }
    private void calculateRemarks(){
        if(this.division.equals("Distinction"))
            this.remarks = "Very Good";
        else if(this.division.equals("First"))
            this.remarks = "Good";
        else if(this.division.equals("Second"))
            this.remarks = "Satisfactory";
        else if(this.division.equals("Third"))
            this.remarks = "worst";
        else
            this.remarks = "Sorry you have failed.!!!";
    }
    private void processResult(){
        this.calculateTotal();
        this.calculateAverage();
        this.calculateResult();
        this.calculateDivision();
        this.calculateRemarks();
    }
    private boolean checkValidity(){
        if(this.id==0){
            JOptionPane.showMessageDialog(null,"ID == null","ID cannot be empty..!!",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            if(this.name.equals("")){
                JOptionPane.showMessageDialog(null,"Name == ????","Name Field is empty..!!!",JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else{
                if(this.grade.equals("")){
                    JOptionPane.showMessageDialog(null,"Grade == ????","Grade Field is empty.!!",JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                else{
                    if(this.section.equals("")){
                        JOptionPane.showMessageDialog(null,"Section == ????","Section Field is empty.!!",JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                    else{
                        if(this.mark1==0.0){
                            JOptionPane.showMessageDialog(null,"Mark1 == ????","Section Field is empty.!!",JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                    }
                }
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(btn_calc)){
            this.id = Integer.parseInt(txt_1.getText());
            this.name = txt_2.getText();
            this.grade = txt_3.getText();
            this.section = txt_4.getText();
            this.mark1 = Float.parseFloat(txt_5.getText());
            this.mark2 = Float.parseFloat(txt_6.getText());
            this.mark3 = Float.parseFloat(txt_7.getText());
            this.mark4 = Float.parseFloat(txt_8.getText());
            
            this.processResult();
            txt_9.setText(Float.toString(this.total));
            txt_10.setText(Float.toString(this.avg));
            txt_11.setText(this.result);
            txt_12.setText(this.division);
            txt_13.setText(this.remarks);
        }
        if(ae.getSource().equals(btn_save)){
            
        }
        if(ae.getSource().equals(btn_close)){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new Test1();
    }    
}
