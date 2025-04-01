class Parent{
int x=10;
}
class Child extends Parent{
int y=20;
}

class Upcasting{
public static void main(String[] args){

Parent e1 = new Parent();
System.out.println(e1.x);//10
/*System.out.println(e1.y);// error  error: cannot find symbol
//System.out.println(e1.y);// error symbol:   variable y location: variable e1 of type Parent
*/
Child e2 = new Child();
System.out.println(e2.x);//10
System.out.println(e2.y);//20

Parent e3 = new Child();// Upcasting

System.out.println(e3.x);
System.out.println(e3.y);


}
}