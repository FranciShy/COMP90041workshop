// @author: Francis Zhong
// Unimelb 2019 COMP90041 SM2 workshop

package wksp7;

public class Student {
    private static int idStandard = 10000;

    private String name;
    private String username;
    private final int id;
    private Subject[] subjects = new Subject[4];
    private int subjectCount = 0;

    public Student() {
        this("Tony Stark", "IronMan");
    }

    public Student(String name, String username) {
        this.name = name;
        this.username = username;
        this.id = ++idStandard;
    }

    public void enrollSubject(Subject subject) {
        if (subjectCount == 4) {
            System.out.println("Error! Already enroll four subjects.");
            return;
        }
        this.subjects[subjectCount++] = subject;
        subject.registerStudent(this);
    }

    public void withdrawSubject(Subject subject) {
        boolean find = false;
        int index = 0;
        while (index < subjectCount) {
            // this comparison should be modified
            if (subjects[index] == subject) {
                find = true;
                break;
            }
            index++;
        }
        if (!find) {
            System.out.println(this.name + " hasn't enroll " + subject.getCode());
            return;
        }
        this.subjects[index] = subjects[--subjectCount];
        this.subjects[subjectCount] = null;
        subject.dropStudent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }
}
