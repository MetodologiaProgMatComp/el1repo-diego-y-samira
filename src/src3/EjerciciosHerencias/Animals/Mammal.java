package EjerciciosHerencias.Animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Mammal[").append(super.toString()).append("]").toString();
    }
}
