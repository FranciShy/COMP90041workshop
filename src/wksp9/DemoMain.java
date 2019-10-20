package wksp9;

import wksp9.democlass.*;
import wksp9.demointerface.CanPlay;
import wksp9.demointerface.CanSing;

public class DemoMain {
    public static void main(String[] args) {
        System.out.println("---- eat & sleep ----");
        Creature[] creatures = {new Musician("Thomas"),
                new Actor("Robert Downey"),
                new Bird(),
                new Bug()};
        for (Creature c: creatures) {
            c.eat(new Fruit("apple"));
            c.eat(new Bug());
            c.sleep();
            System.out.println();
        }
        System.out.println();

        System.out.println("---- sing() ----");
        for (int i = 0; i < 3; i++) {
            ((CanSing) creatures[i]).sing();
        }
        System.out.println();

        System.out.println("---- play() ----");
        for (Creature c: creatures) {
            if (c instanceof CanPlay) {
                ((CanPlay) c).play();
            }
        }
        System.out.println();

        System.out.println("---- talk & reply ----");
        ((Person) creatures[0]).talkWith((Person) creatures[1]);
        System.out.println();

        System.out.println("---- actor ----");
        ((Actor) creatures[1]).play("Tony Stark");
    }
}
