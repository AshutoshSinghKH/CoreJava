//Encapsulation
class Employee{

private int id;
private String name;

public int getid(){
return id;
}
public String getName(){
return name;
}

public void setid(int id){
 this.id=id;
}

public void setName(String name){
 this.name=name;
}

}
class Encapsulation{
 public static void main(String[] args) {

Employee e = new Employee();

e.setid(122);
e.setName("Vicky");
System.out.println("id is " + e.getid());

System.out.println("Name is " + e.getName());



}

}