package wksp11.type;

import wksp7.Student;

public class Demo2 {
    // customize the comparison details here
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Demo2.class) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Student tony = new Student("Tony", "tony.stark@gmail.com");
        System.out.println(tony);
        try {
            System.out.println(tony.getClass().newInstance());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2();
        Demo1 d3 = new Demo1();

        System.out.println("d1.equals(d2): " + (d1.equals(d2)));
        System.out.println("d1.equals(d3): " + (d1.equals(d3)));
    }
}
