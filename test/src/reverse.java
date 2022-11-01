import java.util.*;
import java.io.*;

class GFG {
    public static void main(String[] args)
    {

        // create a list
        List<Integer> Arlist = Arrays.asList(5, 4, 8, 2);

        System.out.println("Reversed :");

        // Printing in reverse
        for (int i = 1; i <= Arlist.size(); i++) {
            System.out.println(Arlist.get(-i));
        }
    }
}