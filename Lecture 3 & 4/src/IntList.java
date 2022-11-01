public class IntList {

    int head;
    IntList rest;

    // Constructor: __init__ from Python
    public IntList(int head, IntList rest){
        this.head = head; // referring to instance variable head beacuse we use this.
        this.rest = rest;
    }

    // Another constructor with just head argument
    public IntList(int head){
//        this.head = head;
//        this.rest = null;
        this(head, null);
    }

    // Another constructor with no arguments
    public IntList(){
//        this.head = 0;
//        this.rest = null;
        this(0, null);
    }

    // This is similar to __str__ in python
    public String toString() {
        if (this.rest == null){
            // base case
            return "" + this.head;
        }else{
            // recursive case
            return "" + this.head + ", " + this.rest.toString();
        }
    }

    public String iterativeToString(){
        IntList current = this;
        String str = "";

        while (current != null){
            str = "" + this.head + ", " + this.rest;
            current = current.rest;
        }

        return str;
    }

    // Recursive solution
    public int size(){
        if (this.rest == null){
            return 1;
        }else{
            return 1 + this.rest.size();
        }
    }

    // Solution using loop
    public int iterativeSize(){
        IntList current = this;
        int totalSize = 0;

        while(current != null){
            totalSize++;
            current = current.rest;
        }
        return totalSize;
    }

    public IntList incrList(int delta) {
        if (this.rest == null)
            return new IntList(this.head + delta, null);
        else
            return new IntList(this.head + delta, this.rest.incrList(delta));
    }

    /**
     * Returns a copy of the current list
     * @return
     */
    public IntList copy(){
        if(this.rest == null) {
            // base case
            return new IntList(this.head, null);
        } else {
            // recursive case
            IntList copyOfRest = this.rest.copy();
            return new IntList(this.head, copyOfRest);
        }
    }

    public static void main(String[] args) {

//        IntList list = null;
//        list = new IntList(10, list);
//        list = new IntList(9, list);
//        list = new IntList(7, list);
//
//        System.out.println(list.toString());
//        System.out.println(list.iterativeToString());
//        System.out.println("List size is: " + list.size());
//        System.out.println("List size is: " + list.iterativeSize());
//        System.out.println(list.incrList(3));
    }
}
