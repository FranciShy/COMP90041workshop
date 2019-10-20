package wksp9.democlass;

import wksp9.demointerface.CanEat;
import wksp9.demointerface.CanSleep;

public abstract class Creature implements CanSleep, CanEat {
    public Creature() {
        super();
    }

    @Override
    public void sleep() {
        System.out.println("Zzzz~");
    }

    // public abstract void eat();
}
