class Bird{
void Display(){
System.out.println("Parent class");
}
}
class Parrot extends Bird{
void childDisplay(){
System.out.println("Child class");
}
}
class Babyparrot extends Parrot{
void babyDisplay(){
System.out.println("baby Child class");
}
}

class Inheritence{
 public static void main(String[] args){

Babyparrot e1 = new Babyparrot();
e1.babyDisplay();
e1.childDisplay();
e1.Display();

}
}