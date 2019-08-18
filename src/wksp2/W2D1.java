// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class W2D1 {
    public static void main(String[] arg) {
        // Scanner
        // Why System.in? (Explained in future)
        System.out.println("Input some text:");
        Scanner cmd = new Scanner(System.in);
        String line = cmd.nextLine();
        System.out.println("\n Result:");
        System.out.println(line);
        System.out.println();
    }
}