public class SimpleOrderDemo {

    static class A {
        int y;
        // Constructor without any argument is called default constructor
        A() {
            System.out.println("A()");
        }

        A(int y) {
            this.y = y;
            System.out.println("A(y)");
        }

    }


    static class B extends A {
        B() {
            // Java will call default constructor of its superclass here
            System.out.println("B()");
        }

        B(int y) {
            // calls default constructor of A here
            // or, we need to explicitly call super constructor
            super(y);
            System.out.println("B(y)");
        }
    }

    public static void main(String[] args) {
        B b = new B(5);
    }

}
