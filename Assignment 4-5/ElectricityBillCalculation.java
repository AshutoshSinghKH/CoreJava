import java.util.InputMismatchException;
import java.util.Scanner;


class ElectricityBill{

String name;
double units;
double billAmount;

ElectricityBill(String name, double units){
this.name=name;
this.units=units;
if(units<0){
throw new IllegalArgumentException("Units can not be in negative");
}
}

void calculateBillAmount(){
if(units < 100){
billAmount=units * 5;// first hai 100 unit ka
} else if(units < 300){
billAmount= (100*5)+ ((units-100) * 7);
} else {
billAmount= (100*5) + (200*7) +((units-300) *10);
}
}

void display(){
System.out.println("name"+name);
System.out.println("units"+units);
System.out.println("bill amount"+billAmount);

}
}

class ElectricityBillCalculation {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

try{
System.out.println("Enter ur name");
String name = sc.nextLine();
System.out.println("Enter ur units");
double units = sc.nextInt();

ElectricityBill e = new ElectricityBill(name,units);
e.calculateBillAmount();
e.display();
}
catch(InputMismatchException a){
System.out.println("user enters non-numeric data for units");
}
catch(IllegalArgumentException b){
System.out.println(" negative value is entered for units");
} finally{
System.out.println("code is wrong or not i will execute the code anyhow");
}












}

}