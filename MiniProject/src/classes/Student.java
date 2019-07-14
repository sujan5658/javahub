
package classes;
import lib.Util;
import lib.Global;
public class Student extends Person{
    String grade;
    char section;
    double m1,m2,m3,m4;
    double total,average;
    double percent;
    String result;
    String division;
    String remarks;
    //constructors getters setters and toString and test it.
    public Student(){
        super();
        this.grade = "";
        this.section = ' ';
        this.m1 = 0;
        this.m2 = 0;
        this.m3 = 0;
        this.m4 = 0;
    }
    public Student(int id,String fullName,String grade, char section, double m1, double m2, double m3, double m4) {
        super(id,fullName);
        this.grade = grade;
        this.section = section;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }
    public Student(Student std){
        super.id = std.id;
        super.fullName = std.fullName;
        this.grade = std.grade;
        this.section = std.section;
        this.m1 = std.m1;
        this.m2 = std.m2;
        this.m3 = std.m3;
        this.m4 = std.m4;
    }
    //getters
    @Override
    public void setId(int id){
        this.id = super.id;
    }
    @Override
    public String getFullName() {
        return super.getFullName();
    }
    @Override
    public int getId() {
        return super.id;
    }
    @Override
    public void setFullName(String fullName) {
        super.fullName = fullName;
    }
    public String getGrade() {
        return grade;
    }

    public char getSection() {
        return section;
    }

    public double getM1() {
        return m1;
    }

    public double getM2() {
        return m2;
    }

    public double getM3() {
        return m3;
    }

    public double getM4() {
        return m4;
    }

    public double getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public String getResult() {
        return result;
    }

    public String getDivision() {
        return division;
    }

    public String getRemarks() {
        return remarks;
    }
    //setters

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public void setM3(double m3) {
        this.m3 = m3;
    }

    public void setM4(double m4) {
        this.m4 = m4;
    }
    private void totalMarks(){
        this.total = this.m1+this.m2+this.m3+this.m4;
    }
    private void averageMarks(){
        this.average = this.total/Global.MAX_SUBJECTS;
        this.average = Util.round(this.average);
    }
    private void calcDivision(){
        this.percent = this.average;
        if(this.result.equals("Passed")){
            if(this.percent>=80){
                this.division = "Distinction";
                this.remarks = "Excellent";
            }
            else if(this.percent>=60 && this.percent<80){
                this.division  = "First Division";
                this.remarks = "Good";
            }
            else if(this.percent>=50 && this.percent<60){
                this.division = "Second division";
                this.remarks = "Average";
            }
            else{
                this.division = "Third division";
                this.remarks = "Not bad";
            }
        }
        else{
            this.division = "***";
            this.remarks = "Sorry you have failed";
        }
    }
    private void calcResult(){
        if(this.m1>Global.PM && this.m2>Global.PM && this.m3>Global.PM && this.m4>Global.PM){
            this.result = "Passed";
        }
        else{
            this.result = "Failed";
        }
    }
    public void totalResult(){
        this.totalMarks();
        this.averageMarks();
        this.calcResult();
        this.calcDivision();
    }
    @Override
    public String toString(){
        return(super.toString()+" "+this.grade+" "+this.section+" "+this.m1+" "+this.m2+" "+this.m3+" "+this.m4+" "+this.total+" "+this.average+" "+this.division+" "+this.result+" "+this.remarks);
    }
}
