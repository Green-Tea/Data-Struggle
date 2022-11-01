import java.math.BigInteger;

public class Lect3 {

    static int staticVarA = 10;
    static int staticVarB = 20;

    // Instance variables
    int varA;
    int varB;

    // Regular method
    public int computeSomething(int x){
        // has access to "this" -- this is like self in python
        return this.varA + this.varB + x;
    }

    // Static method. This is independent from instance variables
    // Static method cannot access instance variables without using 'this'
    public static void saySomething(String someText){
        System.out.println(someText);
    }

    public static void update(Lect3 lect3, int x){ // takes in 2 arguments. A Lect3 object and an integer x
        lect3.varA = lect3.varA + x;
        x = x + 10;
    }

    public static void main(String[] args) {
        Lect3.staticVarA = 30;
        System.out.println(Lect3.staticVarA);
        System.out.println(Lect3.staticVarB);
        // Only static variables can be accessed using class name
        Lect3.saySomething("Hi"); // or saySomething("Hello"); if you are inside the same class

        Lect3 myObj = new Lect3(); // Creates an object. you need to use new to create the object
        myObj.varA = 11;
        myObj.varB = 22;
        System.out.println(myObj.computeSomething(500));

        Lect3 myObj2 = new Lect3(); // Creates an object. you need to use new to create the object
        myObj2.varA = 44;
        myObj2.varB = 55;
        System.out.println(myObj.computeSomething(500));

        /*
        Lect3 myObj3 = myObj;
        myObj.varA = 10; (changes varA in myObj to 10, therefore varA of myObj3 is also 10)
        System.out.println(myObj3.varA + " " + myObj.varA);
        */

        Lect3 myObj3 = new Lect3();
        myObj3.varA = 11;
        myObj3.varB = 22;
        System.out.println(myObj3.varA + " " + myObj.varA);
        System.out.println(myObj3 == myObj); // this returns false because myObj3.varA and myObj.varA are not pointing to the same object

        BigInteger a = BigInteger.valueOf(1111);
        BigInteger b = BigInteger.valueOf(1111);
        System.out.println(a == b); // is false because it compares the address (memory location), not the content
        System.out.println(a.equals(b)); // this is true because now the contents are compared

        /*
        use == to check for content equality of primitive data only
        for non-primitive types, == compares the address of the objects
        so it is safer to use .equals() to compare values
         */

        int x = 30;
        update(myObj, x); // use Lect3.update() if calling outside Lect3 class
        System.out.println("myObj.varA = " + myObj.varA);
        System.out.println("x = "+x); // it does not change because the x in update() is local and cannnot change anything outside of the function
    }
}
