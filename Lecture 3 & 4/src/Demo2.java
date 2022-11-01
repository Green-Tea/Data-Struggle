public class Demo2 {
    public static void main(String[] args) {
        SLList myList = new SLList(); // make an empty list
        //myList.addFirst(60);
        //System.out.println(myList.toString());
        //myList.addFirst(100);
        //System.out.println(myList.toString());
        //myList.addLast(50);
        //System.out.println(myList.getFirst()); // 100
        //System.out.println(myList.getLast()); // 50
        //System.out.println(myList.size()); // 3
        //System.out.println(myList.toString()); // 100, 60, 50
        //myList.removeFirst();
        myList.insert(30, 1);
        System.out.println(myList.toString());

//        SLList myEmptyList = new SLList();
//        System.out.println(myEmptyList.getFirst());

    }
}
