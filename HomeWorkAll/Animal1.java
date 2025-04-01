//HW
abstract class Animal{

abstract void sound();
}

class Pig extends Animal{
void sound(){
System.out.println("weewee");
}


void sleep(){
System.out.println("zzz");
}
}
class Animal1{
public static void main(String[] args) {
 
Pig e1 = new Pig();
e1.sound();
e1.sleep();
}
}