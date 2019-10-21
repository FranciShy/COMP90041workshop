package wksp11.type;

import wksp7.Student;

public class Demo2 {
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Demo2.class) {
            Demo2 d = (Demo2) obj;
            // customize the comparison details here
            d.sayHello();
            return true;
        } else {
            return false;
        }
    }

    public void sayHello() {
        System.out.println("hello");;
    }

    public static void main(String[] args) {
        Student tony = new HeroStudent("Tony Stark", "tony.stark@gmail.com");
        System.out.println(tony);
        try {
            Student newStudent = tony.getClass().newInstance();
            System.out.println(newStudent.getClass());
            System.out.println(newStudent.getUsername());
            System.out.println(newStudent);
            System.out.println(newStudent.getClass().newInstance());
            System.out.println("HeroStudent.equals(): " + tony.equals(newStudent));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        Demo2 d1 = new Demo2();
//        Demo2 d2 = new Demo2();
//        Demo1 d3 = new Demo1();
//
//        System.out.println("d1.equals(d2): " + (d1.equals(d2)));
//        System.out.println("d1.equals(d3): " + (d1.equals(d3)));
    }
}
