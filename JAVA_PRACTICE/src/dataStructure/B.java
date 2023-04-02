package dataStructure;

public class B extends A {
    public void print() {
        System.out.println("child");
    }

}

class main {
    public static void main(String args[]) {
        A a = new B();
        a.print();
    }
}
