public class Pokemon {

    private int level;
    private double baseCatchRate;
    public Pokemon(int newLevel, double newBaseCatchRate) {
        level = newLevel;
        baseCatchRate = newBaseCatchRate;
    }

    public int getLevel() {
        return level;
    }

    public double getBaseCatchRate() {
        return baseCatchRate;
    }


}
