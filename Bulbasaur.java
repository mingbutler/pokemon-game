public class Bulbasaur extends Pokemon {

    public Bulbasaur(int pokeLevel) {
        super(pokeLevel, .2);
    }

    @Override
    public String toString() {
        return "A level "+getLevel()+" Bulbasaur";
    }
}
