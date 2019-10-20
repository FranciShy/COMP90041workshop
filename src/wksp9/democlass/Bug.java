package wksp9.democlass;

import wksp9.demointerface.Eatable;

public class Bug extends Creature implements Eatable {
    public Bug() {
        super();
    }

    @Override
    public void eat(Eatable food) {
        System.out.println("The bug is eating: " + food);
        food.react();
    }

    @Override
    public void react() {
        System.out.println("The little bug is yelling");
    }

    @Override
    public String toString() {
        return "a little bug";
    }
}
