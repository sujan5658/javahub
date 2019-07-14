
package classes;

public class Person {
    protected int id;
    protected String fullName;
    public Person(){
        this.id=0;
        this.fullName = "";
    }
    public Person(int id,String name){
        this.id = id;
        this.fullName = name;
    }
    public Person(Person p){
        this.id = p.id;
        this.fullName = p.fullName;
    }
    //getters
    public int getId() {
        return id;
    }
    //setters
    public String getFullName() {
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @Override
    public String toString(){
        return (this.id+" "+this.fullName);
    }
}
