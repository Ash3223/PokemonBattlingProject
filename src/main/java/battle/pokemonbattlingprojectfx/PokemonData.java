package battle.pokemonbattlingprojectfx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.*;

public class PokemonData {
    public static ArrayList<PokeInfo> getAllPokemon() throws FileNotFoundException {
        ArrayList<PokeInfo> pokemon = new ArrayList<>();

        PokeMove leafStorm = new PokeMove("Leaf Storm", "Grass", false, 8, 130, 0.9);
        PokeMove sludgeBomb = new PokeMove("Sludge Bomb", "Poison", false, 10, 90, 1);
        PokeMove headSmash = new PokeMove("Head Smash", "Rock", true, 5, 150, 0.8);
        PokeMove tailSlap = new PokeMove("Tail Slap", "Normal", true, 10, 125, 0.85);
        PokeMove hydroPump = new PokeMove("Hydro Pump", "Water", false, 5, 110, 0.8);
        PokeMove drainPunch = new PokeMove("Drain Punch", "Fighting", true, 10, 75, 1);
        PokeMove dazzlingGleam = new PokeMove("Dazzling Gleam", "Fairy", false, 10, 80, 1);
        PokeMove flashCannon = new PokeMove("Flash Cannon", "Steel", false, 10, 80, 1);
        PokeMove thunderbolt = new PokeMove("Thunderbolt", "Electric", false, 15, 90, 1);
        PokeMove psychic = new PokeMove("Psychic", "Psychic", false, 10, 90, 1);
        PokeMove pyroBall = new PokeMove("Pyro Ball", "Fire", true, 5, 120, 0.9);
        PokeMove acrobatics = new PokeMove("Acrobatics", "Flying", true, 15, 100, 1);
        PokeMove uTurn = new PokeMove("U-turn", "Bug", true, 20, 70, 1);
        PokeMove earthquake = new PokeMove("Earthquake", "Ground", true, 10, 100, 1);
        PokeMove icicleCrash = new PokeMove("Icicle Crash", "Ice", true, 10, 85, 0.9);
        PokeMove darkPulse = new PokeMove("Dark Pulse", "Dark", false, 15, 80, 1);
        PokeMove dracoMeteor = new PokeMove("Draco Meteor", "Dragon", false, 5, 130, 0.9);
        PokeMove shadowBall = new PokeMove("Shadow Ball", "Ghost", false, 15, 80, 1);

        Image vicBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Victreebel_Back.gif"));
        Image vicFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Victreebel_Front.gif"));
        Image sudBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Sudowoodo_Back.gif"));
        Image sudFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Sudowoodo_Front.gif"));
        Image cincBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Cincinno_Back.gif"));
        Image cincFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Cincinno_Front.gif"));
        Image simBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Simipour_Back.gif"));
        Image simFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Simipour_Front.gif"));
        Image hitBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Hitmonchan_Back.gif"));
        Image hitFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Hitmonchan_Front.gif"));
        Image klefBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Klefki_Back.gif"));
        Image klefFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Klefki_Front.gif"));
        Image zebBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Zebstrika_Back.gif"));
        Image zebFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Zebstrika_Front.gif"));
        Image mushBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Musharna_Back.gif"));
        Image mushFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Musharna_Front.gif"));
        Image cindBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Cinderace_Back.gif"));
        Image cindFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Cinderace_Front.gif"));
        Image ninBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Ninjack_Back.gif"));
        Image ninFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Ninjask_Front.gif"));
        Image hipBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Hippowdon_Back.gif"));
        Image hipFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Hippowdon_Front.gif"));
        Image bearBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Beartic_Back.gif"));
        Image bearFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Beartic_Front.gif"));
        Image hyBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Hydreigon_Back.gif"));
        Image hyFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Hydreigon_Front.gif"));
        Image misBack = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Mismagius_Back.gif"));
        Image misFront = new Image(new FileInputStream("C:\\Users\\ashar\\OneDrive\\Documents\\GitHub" +
                "\\PokemonBattlingProjectFX\\src\\main\\java\\battle\\pokemonbattlingprojectfx\\sprites\\Mismagius_Front.gif"));

        pokemon.add(new PokeInfo("Victreebel", new String[] {"Grass", "Poison"},
                new PokeMove[] {leafStorm, sludgeBomb}, 180, 105, 100, 65, 70, 70, vicBack, vicFront));
        pokemon.add(new PokeInfo("Sudowoodo", new String[] {"Rock"},
                new PokeMove[] {headSmash}, 170, 100, 30, 115, 65, 30, sudBack, sudFront));
        pokemon.add(new PokeInfo("Cinccino", new String[] {"Normal"},
                new PokeMove[] {tailSlap}, 175, 95, 65, 60, 60, 115, cincBack, cincFront));
        pokemon.add(new PokeInfo("Simipour", new String[] {"Water"},
                new PokeMove[] {hydroPump}, 175, 98, 98, 63, 63, 101, simBack, simFront));
        pokemon.add(new PokeInfo("Hitmonchan", new String[] {"Fighting"},
                new PokeMove[] {drainPunch}, 150, 105, 35, 79, 110, 76, hitBack, hitFront));
        pokemon.add(new PokeInfo("Klefki", new String[] {"Steel", "Fairy"},
                new PokeMove[] {dazzlingGleam, flashCannon}, 157, 80, 80, 91, 87, 75, klefBack, klefFront));
        pokemon.add(new PokeInfo("Zebstrika", new String[] {"Electric"},
                new PokeMove[] {thunderbolt}, 175, 100, 80, 63, 63, 116, zebBack, zebFront));
        pokemon.add(new PokeInfo("Musharna", new String[] {"Psychic"},
                new PokeMove[] {psychic}, 216, 55, 107, 85, 95, 29, mushBack, mushFront));
        pokemon.add(new PokeInfo("Cinderace", new String[] {"Fire"},
                new PokeMove[] {pyroBall}, 180, 116, 65, 75, 75, 119, cindBack, cindFront));
        pokemon.add(new PokeInfo("Ninjask", new String[] {"Bug", "Flying"},
                new PokeMove[] {acrobatics, uTurn}, 161, 90, 50, 45, 50, 160, ninBack, ninFront));
        pokemon.add(new PokeInfo("Hippowdon", new String[] {"Ground"},
                new PokeMove[] {earthquake}, 208, 112, 68, 118, 72, 47, hipBack, hipFront));
        pokemon.add(new PokeInfo("Beartic", new String[] {"Ice"},
                new PokeMove[] {icicleCrash}, 195, 130, 70, 80, 80, 50, bearBack, bearFront));
        pokemon.add(new PokeInfo("Hydreigon", new String[] {"Dragon", "Dark"},
                new PokeMove[] {darkPulse, dracoMeteor}, 192, 105, 125, 90, 90, 98, hyBack, hyFront));
        pokemon.add(new PokeInfo("Mismagius", new String[] {"Ghost"},
                new PokeMove[] {shadowBall}, 160, 60, 105, 60, 105, 105, misBack, misFront));

        return pokemon;
    }
}
