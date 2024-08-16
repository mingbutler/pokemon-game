
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Pokemon spawn() {
        Random rn = new Random();
        int level;
        int rand = rn.nextInt(21);
        int rand2 = rn.nextInt(4);
        level = rand;
        Pokemon pokemon;
        if (rand2 == 1) {
            pokemon= new Bulbasaur(level);
            System.out.println("You encounter a level "+pokemon.getLevel()+" Bulbasaur");

        } else if (rand2 == 2) {
            pokemon = new Charmander(level);
            System.out.println("You encounter a level "+pokemon.getLevel()+" Charmander");
        } else {
            pokemon = new Caterpie(level);
            System.out.println("You encounter a level "+pokemon.getLevel()+" Caterpie");

        }
        return pokemon;
    }

    public static float throwBall() {
        Scanner sc = new Scanner(System.in);
        float ballMultiplier = 0, berryMultiplier, curveMultiplier;
        String ball, berry;
        String curveBall;

        System.out.println("What type of ball do you wish to use? (Poke, Great, Ultra)");
        ball = sc.next();
        if (ball.equals("Poke")) {
            ballMultiplier = 1f;
        } else if (ball.equals("Great")) {
            ballMultiplier = 1.5f;
        } else if (ball.equals("Ultra")) {
            ballMultiplier = 2f;
        }
        System.out.println("What berry do you wish to use? (None, Razz, SilverPinap, GoldenRazz)");
        berry = sc.next();
        if (berry.equals("Razz")) {
            berryMultiplier = 1.5f;
        } else if (berry.equals("SilverPinap")) {
            berryMultiplier = 1.8f;
        } else if (berry.equals("GoldenRazz")) {
            berryMultiplier = 2.5f;
        } else {
            berryMultiplier = 1f;
        }
        System.out.println("Is this a curveball? (Yes or No)");
        curveBall = sc.next();
        if (curveBall.equals("Yes")) {
            curveMultiplier = 1.7f;
        } else {
            curveMultiplier = 1f;
        }
        return ballMultiplier * berryMultiplier * curveMultiplier;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pokedex myDex = new Pokedex();
        String cont;
        do {
            Pokemon pokemon = spawn();
            boolean caught = false;
            while (!caught) {
                float cpm = .49985844f;
                float throwBallValue = throwBall();
                double catchProb = 1 - (1 - Math.pow(pokemon.getBaseCatchRate() / (2 * cpm), throwBallValue));

                Random rn = new Random();
                int rand = rn.nextInt(2);
                if (rand < catchProb) {
                    caught = true;
                    System.out.println(pokemon + " Caught!");
                    myDex.addToDex(pokemon);
                } else {
                    System.out.println("Oops " + pokemon + " jumped out, try again!");
                }
            }
            System.out.println("Continue Catching Pokemon? (Y or N)");
            cont = scan.next();
        } while(cont.equals("Y"));
        System.out.println("You have the following Pokemon");
        System.out.println(myDex);
    }
}