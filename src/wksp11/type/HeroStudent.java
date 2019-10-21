package wksp11.type;

import wksp7.Student;

public class HeroStudent extends Student {
    public HeroStudent() {
        super();
    }

    public HeroStudent(String name, String username) {
        super(name, username);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == HeroStudent.class) {
            HeroStudent hero = (HeroStudent) obj;
            return this.getId() == hero.getId();
        } else {
            return false;
        }
    }
}
