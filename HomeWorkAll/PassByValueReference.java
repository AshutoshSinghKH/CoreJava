//HW pass by value and pass b reference

class Employee {
     int id; 
         Employee(int id) 
       {
        this.id = id;
     }

        Employee(Employee object) //this constructor will take an object 
{
        this.id = object.id ;
    }

     void display() {
        System.out.println("id " + id);
    }
}

 class PassByValueReference {
    public static void main(String[] args) {
       Employee obj1 = new Employee(1111);

        obj1.display(); 
        

      Employee obj2 = new Employee(obj1); // this is pointing the reference of obj1
        obj2.display(); 

        
        obj1 = new Employee(22225); 

        obj1.display(); 
        obj2.display();
}
}
