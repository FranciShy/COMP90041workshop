package wksp9.democlass;

import wksp9.demointerface.CanPlay;

public class Musician extends Person implements CanPlay {
    public Musician(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(this + " sings: La la la ~");
        System.out.println("Do Re Mi Fa So La Si Do");
    }

    @Override
    public String toString() {
        return "musician " + name;
    }

    @Override
    public void play() {
        this.sing();
    }
}
