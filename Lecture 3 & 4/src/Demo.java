import java.math.BigInteger;

public class Demo {

    // java distinguishes between methods by their signature.
    // a signature consists of the argument type.
    // signature: saySomething(int)
    public static void saySomething(int x) {
        System.out.println("Integer: " + x);

    }

    // signature saySomething(float)
    public static void saySomething(float f){
        System.out.println("Float: " + f);
    }

    public static void main(String[] args) {
        IntList list = null;
        list = new IntList(10, list);
        list = new IntList(9, list);
        list = new IntList(7, list);
        System.out.println(list); // this calls .toString() of the object by default

        // Uninitialized variables
        int a;
        int b;
        String s;
        BigInteger bigNum;

        saySomething(10);
        saySomething(1.5f); // f clarifies that it is a float

    }
}
