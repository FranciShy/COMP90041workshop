package wksp9.democlass;

import wksp9.demointerface.CanSing;
import wksp9.demointerface.CanSleep;
import wksp9.demointerface.Eatable;

public class Bird extends Creature implements CanSing {
    public Bird() {
        super();
    }

    @Override
    public void eat(Eatable food) {
        System.out.println("The bird is eating " + food);
        food.react();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void sing() {
        System.out.println("The bird is singing ~~~~~~~~");
    }
}
