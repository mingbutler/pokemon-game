public class Charmander extends Pokemon {

    public Charmander(int pokeLevel) {
        super(pokeLevel, .2);
    }

    @Override
    public String toString() {
        return "A level "+getLevel()+" Charmander";
    }
}
