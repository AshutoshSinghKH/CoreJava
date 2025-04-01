
interface Parent1 {
    void fun1(); 
}

interface Parent2 {
    void fun2(); 
}

class Test implements Parent1, Parent2 {
       public void fun1() {
        System.out.println("From Parent1");
    }

       public void fun2() {
        System.out.println("From Parent2");
    }
}

public class MainDiamond {
    public static void main(String[] args) {
        Test t = new Test();
        t.fun1(); 
        t.fun2(); 
    }
}
