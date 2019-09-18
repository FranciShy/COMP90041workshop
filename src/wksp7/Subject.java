package wksp7;

public class Subject {
    private String code;
    private String title;
    private String coordinator;
    private Student[] students;
    private int count;

    public Subject() {
        this("COMP90041", "Java", "Thomas");
    }

    public Subject(String code, String title, String coodinator) {
        this.code = code;
        this.title = title;
        this.coordinator = coodinator;
        this.students = new Student[200];
        this.count = 0;
    }

    public void registerStudent(Student student) {
        if (count == students.length) {
            this.extendsStudents();
        }
        this.students[count++] = student;
    }

    public void dropStudent(Student student) {
        boolean find = false;
        int index = 0;
        while (index < count) {
            // how to modify this comparison and why?
            if (students[index] == student) {
                find = true;
                break;
            }
            index++;
        }
        if (!find) {
            System.out.println("The student didn't enroll " + this.code);
            return;
        }
        this.count -= 1;
        this.students[index] = students[count];
        this.students[count] = null;
    }

    public Student[] extendsStudents() {
        Student[] temp = this.students;
        this.students = new Student[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            this.students[i] = temp[i];
        }
        return this.students;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(code).append(": ").append(title).append("\n");
        s.append("coodinator: ").append(coordinator).append("\n");
        s.append("student: ").append(students.length).append("\n");
        for (int i = 0; i < count; i++) {
            s.append(students[i].getName()).append(": ");
            s.append(students[i].getId()).append("\n");
        }
        return s.toString();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoodinator() {
        return coordinator;
    }

    public void setCoodinator(String coodinator) {
        this.coordinator = coodinator;
    }
}
