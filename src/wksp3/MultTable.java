// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp3;

public class MultTable {
    public static void main(String[] args) {
        // an input number is essential here
        MultTable.printTable(Integer.parseInt(args[0]));
    }

    // create a method to print a multiplying matrix
    public static void printTable(int num) {
        System.out.println("Print " + num + " multiplying table:");
        int row = num + 1;
        for(int i = 0; i < row; i++) {
            printLine(i, num);
        }
    }

    // create a method to print a single line
    public static void printLine(int lineNum, int num) {
        if(lineNum == 0) {
            System.out.print("  *  ");
        } else {
            System.out.print("-----");
            for(int i = 0; i < num; i++) {
                System.out.print("+-----");
            }
            System.out.print("\n" + numFormat(lineNum));
        }
        for(int i = 0; i < num; i++) {
            // what does (condition) ? (value1) : (value2) means?
            int time = (lineNum == 0) ? 1 : lineNum;
            System.out.print("|" + numFormat((i + 1) * time));
        }
        System.out.println();
    }

    // print number with the proper format
    public static String numFormat(int num) {
        if(num < 10) {
            return "   " + num + " ";
        } else if(num < 100) {
            return "  " + num + " ";
        } else {
            // assume num is not larger than 999
            return " " + num + " ";
        }
    }
}
