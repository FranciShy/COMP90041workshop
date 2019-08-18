// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp3;

public class W3D2 {
    public static void main(String[] args) {
        // still fibonacci
        int x = 0;
        int y = 1;
        // how to build a infinite loop?
        for( ; true; ) {
            switch(y) {
                case 34:
                    System.out.println("Get 34");
                    break;
                // what if not 144 but 145 instead?
                case 144:
                    System.out.println("Get 144");
                    return;
                default:
                     System.out.println(y);
            }
            int temp = x;
            x = y;
            y += temp;
            // in case of infinite loop error
            if (y > 200) {
                System.out.println("Force break!!");
                break;
            }
        }
        System.out.println("Fibonacci is done");
    }
}
