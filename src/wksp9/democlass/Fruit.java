package wksp9.democlass;

import wksp9.demointerface.Eatable;

public class Fruit implements Eatable {
    private String typeName;

    public Fruit(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }

    @Override
    public void react() {
        System.out.println("The " + typeName + " is eaten.");;
    }
}
