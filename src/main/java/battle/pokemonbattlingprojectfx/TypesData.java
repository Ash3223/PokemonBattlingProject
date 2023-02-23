package battle.pokemonbattlingprojectfx;

import java.util.ArrayList;

public class TypesData {
    public static ArrayList<PokeType> getAllTypes() {
        ArrayList<PokeType> types = new ArrayList<>();

        types.add(new PokeType("Normal", new String[] {""}, new String[] {"Rock", "Steel"}, new String[] {"Ghost"}));
        types.add(new PokeType("Fire", new String[] {"Grass", "Ice", "Bug", "Steel"},
                new String[] {"Fire", "Water", "Rock", "Dragon"}, new String[] {""}));
        types.add(new PokeType("Water", new String[] {"Fire", "Ground", "Rock"},
                new String[] {"Water", "Grass", "Dragon"}, new String[] {""}));
        types.add(new PokeType("Electric", new String[] {"Water", "Flying"},
                new String[] {"Electric", "Grass", "Dragon"}, new String[] {"Ground"}));
        types.add(new PokeType("Grass", new String[] {"Water", "Ground", "Rock"},
                new String[] {"Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel"}, new String[] {""}));
        types.add(new PokeType("Ice", new String[] {"Grass", "Ground", "Flying", "Dragon"},
                new String[] {"Fire", "Water", "Ice", "Steel"}, new String[] {""}));
        types.add(new PokeType("Fighting", new String[] {"Normal", "Ice", "Rock", "Dark", "Steel"},
                new String[] {"Poison", "Flying", "Psychic", "Bug", "Fairy"}, new String[] {"Ghost"}));
        types.add(new PokeType("Poison", new String[] {"Grass", "Fairy"},
                new String[] {"Poison", "Ground", "Rock", "Ghost"}, new String[] {"Steel"}));
        types.add(new PokeType("Ground", new String[] {"Fire", "Electric", "Poison", "Rock", "Steel"},
                new String[] {"Grass", "Bug"}, new String[] {"Flying"}));
        types.add(new PokeType("Flying", new String[] {"Grass", "Fighting", "Bug"},
                new String[] {"Electric", "Rock", "Steel"}, new String[] {""}));
        types.add(new PokeType("Psychic", new String[] {"Fighting", "Poison"}, new String[] {"Psychic", "Steel"},
                new String[] {"Dark"}));
        types.add(new PokeType("Bug", new String[] {"Grass", "Psychic", "Dark"},
                new String[] {"Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel", "Fairy"}, new String[] {""}));
        types.add(new PokeType("Rock", new String[] {"Fire", "Ice", "Flying", "Bug"},
                new String[] {"Fighting", "Ground", "Steel"}, new String[] {""}));
        types.add(new PokeType("Ghost", new String[] {"Psychic", "Ghost"}, new String[] {"Dark"},
                new String[] {"Normal"}));
        types.add(new PokeType("Dragon", new String[] {"Dragon"}, new String[] {"Steel"}, new String[] {"Fairy"}));
        types.add(new PokeType("Dark", new String[] {"Psychic", "Ghost"}, new String[] {"Fighting", "Dark", "Fairy"},
                new String[] {""}));
        types.add(new PokeType("Steel", new String[] {"Ice", "Rock", "Fairy"},
                new String[] {"Fire", "Water", "Electric", "Steel"}, new String[] {""}));
        types.add(new PokeType("Fairy", new String[] {"Fighting", "Dragon", "Dark"},
                new String[] {"Fire", "Poison", "Steel"}, new String[] {""}));

        return types;
    }
}
