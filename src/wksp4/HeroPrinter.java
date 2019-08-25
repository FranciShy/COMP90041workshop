package wksp4;

public class HeroPrinter {
    private String[] heros;

    // field initialization is earlier than constructor
    // usually they have the same use
//    private String[] heros = {
//            "Tony Stark",
//            "Peter Parker"
//    };

    // how about Constructor overloading?
    public HeroPrinter() {
        heros = new String[] {
                "Thor", "Tony Stark", "Peter Park", "Hulk", "Rocket"
        };
    }

    public void printHeroes() {
        // for each item in array heros
        // transfer object reference to hero
        for (String hero: heros) {
            System.out.println(hero);
        }
    }

    // overload printHeroes()
    public void printHeroes(int num) {
        for (int i = 0; i < heros.length && i < num; i++) {
            System.out.println(heros[i]);
        }
    }

    // is this method overloading?
    public boolean printHeroes(String name) {
        for (String hero: heros) {
            if (hero.equals(name)) {
                System.out.println(hero);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HeroPrinter marvel = new HeroPrinter();

        System.out.println("\nprintHeroes():");
        marvel.printHeroes();

        System.out.println("\nprintHeroes(int num):");
        marvel.printHeroes(3);

        System.out.println("\nprintHeroes(String name = \"Peter Park\")");
        System.out.println(marvel.printHeroes("Peter Park"));
    }
}
