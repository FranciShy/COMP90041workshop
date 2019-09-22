// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp7;

public class ArrayDemo {
    public static void main(String[] args) {
        // the two-dimension array with two arguments
        System.out.println("******* Group Table *******");
        Student[][] groupTable = new Student[10][4];
        generateGroups(groupTable);
        printStudentGroups(groupTable);
        System.out.println();


        // what is the difference of the next array constructor?
        // why this constructor only takes one argument?
        System.out.println("******* Dynamic Groups *******");
        Student[][] groups = new Student[10][];

        // the array constructor can be iteratively called
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new Student[randomSize(4)];
        }
        generateGroups(groups);
        printStudentGroups(groups);
    }

    // a basic factory method to generate Student[][] array
    // this method takes an Student[][] reference
    public static void generateGroups(Student[][] groups) {
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                groups[i][j] = new Student();
            }
        }
    }


    // print a Student[][] array iteratively
    public static void printStudentGroups(Student[][] groups) {
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                System.out.print(groups[i][j] + ",\t");
            }
            System.out.println();
        }
    }

    // a random method provide int size
    public static int randomSize(int size) {
        return (int) (Math.random() * 4) + 1;
    }
}
