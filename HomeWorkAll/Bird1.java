abstract class Bird{

abstract void sound();
abstract void colour();

}

class Parrot extends Bird{
void sound(){
System.out.println("Mithu");
}


void colour(){
System.out.println("green");
}
}

class Pigeon extends Bird{
void sound(){
System.out.println("guturgu");
}


void colour(){
System.out.println("white");
}
}
class Bird1{
public static void main(String[] args) {
 
Parrot e1 = new Parrot();
e1.sound();
e1.colour();

Pigeon e2 = new Pigeon();
e2.sound();
e2.colour();
}
}