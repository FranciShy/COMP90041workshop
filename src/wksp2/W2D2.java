// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp2;

import java.util.Scanner;

public class W2D2 {
    public static void main(String[] args) {
        System.out.println("Input some text:");
        Scanner cmd = new Scanner(System.in);
        String line = cmd.nextLine();

        // nextLine() issue
        // What will the third line print?
        String word = cmd.next();
        // cmd.nextLine();
        String thirdLine = cmd.nextLine();
        System.out.println("\nResult:");
        System.out.println(line);
        System.out.println(word);
        System.out.println(thirdLine);
        System.out.println();
    }
}
