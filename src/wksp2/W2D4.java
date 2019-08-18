// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp2;

import java.util.Scanner;

public class W2D4 {
    public static void main(String[] args) {
        System.out.println("Input some text:");
        Scanner cmd = new Scanner(System.in);
        String line = cmd.nextLine();

        // Practice: print the first quoted word of input
        // Use split() method
        System.out.println("\nTry to use split() method to get quoted part.");
        String[] lineWords = line.split(" ");
        for(int i = 0; i < lineWords.length; i++) {
            if(lineWords[i].startsWith("\"") && lineWords[i].endsWith("\"")) {
                System.out.println(lineWords[i]);
                break;
            }
        }
        System.out.println();
    }
}
