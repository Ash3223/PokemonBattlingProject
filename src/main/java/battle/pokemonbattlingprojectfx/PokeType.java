package battle.pokemonbattlingprojectfx;

public class PokeType {
    private String name;
    private String[] superEffective;
    private String[] notVeryEffective;
    private String[] immuneTo;

    public PokeType(String name, String[] strengths, String[] weaknesses, String[] immunities) {
        this.name = name;
        this.superEffective = strengths;
        this.notVeryEffective = weaknesses;
        this.immuneTo = immunities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSuperEffective() {
        return superEffective;
    }

    public void setSuperEffective(String[] superEffective) {
        this.superEffective = superEffective;
    }

    public String[] getNotVeryEffective() {
        return notVeryEffective;
    }

    public void setNotVeryEffective(String[] notVeryEffective) {
        this.notVeryEffective = notVeryEffective;
    }

    public String[] getImmuneTo() {
        return immuneTo;
    }

    public void setImmuneTo(String[] immuneTo) {
        this.immuneTo = immuneTo;
    }
}
