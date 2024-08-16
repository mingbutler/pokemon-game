import java.util.ArrayList;

public class Pokedex {

    private ArrayList<Pokemon>myPokedex = new ArrayList<>();

    public void addToDex(Pokemon newPokemon) {
        myPokedex.add(newPokemon);
    }

    @Override
    public String toString() {
        String string = "";
        for (Pokemon myPoke : myPokedex) {
             string += myPoke.toString()+"\n";
        }
        return string;
    }
}
