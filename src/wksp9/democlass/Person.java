package wksp9.democlass;

import wksp9.demointerface.CanSing;
import wksp9.demointerface.Eatable;

public abstract class Person extends Creature implements CanSing {
    protected String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public void talkWith(Person person) {
        System.out.println(name + ": Hello, " + person.getName() + "! How have you been?");
        person.replyTo(this);
    }

    public void replyTo(Person person) {
        System.out.println(name + ": Hi! " + person.getName() + ".");
    }

    // override eat method to implement CanEat interface
    @Override
    public void eat(Eatable food) {
        System.out.println(this.toString() + ": Yummy");
        food.react();
    }

    @Override
    public void sleep() {
        System.out.println(this.toString() + " Zzzz~");
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
