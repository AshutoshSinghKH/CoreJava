interface Bird{

public void sound();
public void colour();
}

class Parrot implements Bird{
public void sound(){
System.out.println("Mithu");
}


public void colour(){
System.out.println("green");
}
}

class Pigeon implements Bird{
public void sound(){
System.out.println("guturgu");
}


public void colour(){
System.out.println("white");
}
}
class Bird12{
public static void main(String[] args) {
 
Parrot e1 = new Parrot();
e1.sound();
e1.colour();

Pigeon e2 = new Pigeon();
e2.sound();
e2.colour();
}
}