// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp3;

public class W3D1 {
    // what is the String[] input?
    public static void main(String[] args) {
        int max = -1;
        if(args.length != 0) {
            // class Integer provides a method to parse string into int
            // warning: throws out a runtime exception
            // then this string cannot be parsed into int
            max = Integer.parseInt(args[0]);
        }
        int i = 0; // printing time counter
        int x = 0;
        int y = 1;
        do {
            System.out.print(y + " ");
            i++;
            int temp = x; // temperate int value recording x
            x = y;
            y += temp;
        } while(i < max);
        System.out.println("\nFibonacci counting is done.");
    }
}
