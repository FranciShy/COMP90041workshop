// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp3;

public class DirectDegree {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("No input to main().");
            return;
        }
        switch(args[0]) {
            case "N":
                System.out.println("0");
                break;
            case "E":
                System.out.println("90");
                break;
            case "S":
                System.out.println("180");
                // What happens if there is no break in S case
                // break;
            case "W":
                System.out.println("270");
                break;
            default:
                System.out.println("Unvalid input.");
                // return;
                System.exit(1);
        }
    }
}
