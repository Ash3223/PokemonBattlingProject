module battle.pokemonbattlingprojectfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens battle.pokemonbattlingprojectfx to javafx.fxml;
    exports battle.pokemonbattlingprojectfx;
}