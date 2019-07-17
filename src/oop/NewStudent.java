
package oop;
public class NewStudent {
    //properties
    private int id;
    private String name;
    public NewStudent(){
        this.id=0;
        this.name = "";
    }
    public NewStudent(int id,String name){
        this.id=id;
        this.name=name;
    }
    public NewStudent(NewStudent std){
        this.id = std.id;
        this.name = std.name;
    }
    //Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return(this.id+" "+this.name);
    }
}
