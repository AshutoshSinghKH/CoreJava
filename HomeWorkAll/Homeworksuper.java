class Animal {
    private String name;// encapsulation hai

    // Parameterized constructor
    public Animal(String name) {
        this.name = name;
    }
     // method
        public void display() {
        System.out.println(name);
    }

    // Method 
        public void sound() {
        System.out.println("BHO BHO");
    }
}

class Dog extends Animal {
    private String colour;

        public Dog(String name, String colour) {
      
        super(name);//  superclass ka constructor hai 
        this.colour = colour;
    }

    
    @Override
    public void sound() {
        
        super.sound(); 
        System.out.println("Dog barks");
    }

        public void displayInfo() {
       
        super.display(); 
        System.out.println(colour);
    }
}

public class Homeworksuper {
    public static void main(String[] args) {
        Dog e1 = new Dog("Babbarsher", "White");// child class ka object hai
        
        
        e1.displayInfo(); 
        e1.sound();      
    }
}
