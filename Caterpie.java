public class Caterpie extends Pokemon {

    public Caterpie(int pokeLevel) {
        super(pokeLevel, .5);
    }

    @Override
    public String toString() {
        return "A level "+getLevel()+" Caterpie";
    }
}
