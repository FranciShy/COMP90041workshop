// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp2;

import java.util.Scanner;

public class W2D3 {
    public static void main(String[] args) {
        System.out.println("Input some text:");
        Scanner cmd = new Scanner(System.in);
        String line = cmd.nextLine();

        // StringObject.split()
        System.out.println("\nThen do split().");
        // !String[] lineWords = line.split("");
        String[] lineWords = line.split(" ");
        // Why i++?
        // What is equivalent to i++?
        for(int i = 0; i < lineWords.length; i++) {
            System.out.println(lineWords[i]);
        }
        System.out.println();
    }
}
