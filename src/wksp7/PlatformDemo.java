package wksp7;

public class PlatformDemo {
    public static void main(String[] args) {
        Subject java = new Subject();
        Subject algo = new Subject("COMP90049", "Algorithm", "Micheal");

        Student[] marks = new Student[247];
        for (int i = 0; i < 247; i++) {
            marks[i] = new Student();
            marks[i].enrollSubject(java);
            if (i < 10) {
                marks[i].enrollSubject(algo);
            }
        }

        for (int i = 0; i < 200; i++) {
            marks[i].withdrawSubject(java);
        }

        System.out.println(java);
        System.out.println();
        System.out.println(algo);
    }
}
