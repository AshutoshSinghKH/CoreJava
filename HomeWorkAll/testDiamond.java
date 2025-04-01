// Diamond Problem

class Parent1 { 
    void fun() { System.out.println("Parent1"); } 
} 
  

class Parent2 { 
    void fun() { System.out.println("Parent2"); } 
} 
  

class testDiamond extends Parent1, Parent2 { 
     
    public static void main(String[] args) 
    { 
        testDiamond t = testDiamond test(); 
        t.fun(); 
    } 
}