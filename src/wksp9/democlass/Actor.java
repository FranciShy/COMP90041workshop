package wksp9.democlass;

import wksp9.demointerface.CanPlay;

public class Actor extends Person implements CanPlay {
    public Actor(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(this + " sings: Emmmmm...");
    }

    @Override
    public String toString() {
        return "actor " + name;
    }

    public void play(String character) {
        System.out.println(name + " is playing as " + character);
    }

    @Override
    public void play() {
        this.play("move character");
    }
}
