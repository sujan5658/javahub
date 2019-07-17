
package Jframe;
public class Student {
    int id;
    String name;
    String grade;
    int mark1;
    int mark2;
    int total;
    int average;
    String result;
    public Student(){
        this.id = 0;
        this.name = "";
        this.grade = "";
        this.mark1 = 0;
        this.mark2 = 0;
        this.total = 0;
        this.average = 0;
        this.result = "";
              
    }
    public Student(int id,String name,String grade,int mark1,int mark2){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public Student(Student st){
        this.id = st.id;
        this.name = st.name;
        this.grade = st.grade;
        this.mark1 = st.mark1;
        this.mark2 = st.mark2;
        this.total = st.total;
        this.average = st.average;
        this.result = st.result;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setMark1(int mark1){
        this.mark1 = mark1;
    }
    public void setMark2(int mark2){
        this.mark2 = mark2;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public void setAverage(int avg){
        this.average = avg;
    }
    public void setResult(String result){
        this.result = result;
    }
    public int getId(){
        return (this.id);
    }
    public String getName(){
        return (this.name);
    }
    public String getGrade(){
        return (this.grade);
    }
    public int getMark1(){
        return (this.mark1);
    }
    public int getMark2(){
        return (this.mark2);
    }
    public int getTotal(){
        return (this.total);
    }
    public int getAverage(){
        return (this.average);
    }
    public String getResult(){
        return (this.result);
    }
    @Override
    public String toString(){
        return (this.id+" "+this.name+" "+this.grade+" "+this.mark1+" "+this.mark2+" "+this.total+" "+this.average+" "+this.result );
    }
    public void calculateTotal(){
        this.total = this.mark1+this.mark2;
    }
    public void calculateAvg(){
        this.average = this.total/2;
    }
    public void calculateResult(){
        if(this.mark1>=40 && this.mark2>=40){
            this.result = "Passed";
        }
        else{
            this.result = "Failed";
        }
    }
    public void processResult(){
        this.calculateTotal();
        this.calculateAvg();
        this.calculateResult();
    }
}
