
package oop;
public class FinalStudent extends NewStudent {
    //properties
    private String grade;
    private String section;
    public FinalStudent(){
        super(); //Super class constructor
        grade = "";
        section = "";
    }
    public FinalStudent(int id,String name,String grade,String section){
        super(id,name);
        this.grade = grade;
        this.section = section;
    }
    public FinalStudent(FinalStudent std){
        super.setId(std.getId());
        super.setName(std.getName());
        this.grade = std.grade;
        this.section = std.section;
    }
    @Override
    public void setId(int id){
        super.setId(id);
    }
    public void setName(String name){
        super.setName(name);
    }
    public int getId(){
        return super.getId();
    }
    public String getName(){
        return super.getName();
    }
    public String toString(){
        return (super.toString()+" "+this.grade+" "+this.section);
    }
    //Getters
    public String getGrade() {
        return grade;
    }

    public String getSection() {
        return section;
    }
    //Setters
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
