// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class W2D5 {
    public static void main(String[] args) {
        System.out.println("Input some text:");
        Scanner cmd = new Scanner(System.in);
        String line = cmd.nextLine();

        // StringTokenizer practice
        // So why StringTokenizer?
        System.out.println("\nUse StringTokenizer to deal with this.");
        StringTokenizer tokenizer = new StringTokenizer(line, " ,;.!?");
        // while loop?
        // What does tokenizer.hasMoreTokens() return?
        while(tokenizer.hasMoreTokens()) {
            String mark = tokenizer.nextToken();
            if(mark.startsWith("\"") && mark.endsWith("\"")) {
                System.out.println(mark.toUpperCase());
                // What does this break mean?
                break;
            }
        }
        System.out.println();

        // printf vs print
        System.out.printf("%s, %d, %-5.2f\n", "This is a string", 1, (float)2);
        System.out.println("haha" + (new Integer(1)).toString() + 2);
    }
}
