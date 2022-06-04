package labs_examples.static_nonstatic;

public class FrogsExer {

    public static void main(String[] args) {
        // create at least 3 distinct frogs below
        Frog frog1 = new Frog("Joe", "Forest");
        Frog frog2 = new Frog("Daniel", "Desert");
        Frog frog3 = new Frog("George", "Mountain");

        // once all are created, call the toString() on each

        System.out.println(frog1.toString());
        System.out.println(frog2.toString());
        System.out.println(frog3.toString());

        // what printed for numFrogs? why?
        // 3

    }
}
class Frog {
    String name;
    String habitat;
    static int numFrogs;

    public Frog(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
        numFrogs++;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", numFrogs= " + numFrogs + '\'' +
                '}';
    }
}

