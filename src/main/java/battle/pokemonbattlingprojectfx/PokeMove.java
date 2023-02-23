package battle.pokemonbattlingprojectfx;

public class PokeMove {
    private String name;
    private String type;
    private boolean isPhysical;
    private int pp;
    private int power;
    private double accuracy;

    public PokeMove(String name, String type, boolean isPhysical, int pp, int power, double accuracy) {
        this.name = name;
        this.type = type;
        this.isPhysical = isPhysical;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isPhysical() {
        return isPhysical;
    }

    public void setPhysical(boolean physical) {
        isPhysical = physical;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
}
