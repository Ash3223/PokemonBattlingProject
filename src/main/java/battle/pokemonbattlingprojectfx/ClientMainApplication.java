package battle.pokemonbattlingprojectfx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * The client application that will ask clients for their username and then allow them to start messaging.
 */
public class ClientMainApplication extends Application {
    private ArrayList<Thread> threadList;
    /**
     * Abstract method from abstract Application class that helps set up JavaFX application.
     * @param stage The main stage.
     */
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        threadList = new ArrayList<>();

        TextField usernameField = new TextField();
        ArrayList<PokeInfo> pokemonList = new ArrayList<>();
        Button submitButton = new Button();
        submitButton.setText("Submit");
        Label currentPokemonMessage = new Label();

        ArrayList<Button> buttons = new ArrayList<>();
        for (int i = 0; i < PokemonData.getAllPokemon().size(); i++) {
            buttons.add(new Button());
            buttons.get(i).setText(PokemonData.getAllPokemon().get(i).getName());
            int finalI = i;
            buttons.get(i).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    if (pokemonList.size() != 3) {
                        try {
                            pokemonList.add(PokemonData.getAllPokemon().get(finalI));
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        currentPokemonMessage.setText("You have selected " + pokemonList.size() + " Pokemon");
                    }
                    else {
                        currentPokemonMessage.setText("You cannot select more Pokemon.");
                    }
                    submitButton.setVisible(pokemonList.size() == 3);
                }
            });
        }

        Label selectPokemonLabel = new Label();
        selectPokemonLabel.setText("Please select 3 Pokemon and enter your name to start playing.");
        selectPokemonLabel.setStyle("-fx-font-weight: bold");
        Label usernameLabel = new Label();
        usernameLabel.setText("Name:");

        submitButton.setVisible(pokemonList.size() == 3);

        submitButton.setOnAction(new EventHandler<>() {
            /**
             * Method that controls what happens once the client has entered their username and clicked the 'Submit'
             * button.
             *
             * @param Event Event of client clicking the button.
             */
            @Override
            public void handle(ActionEvent Event) {
                Client client;
                try {
                    client = new Client(usernameField.getText(), pokemonList);
                    Thread clientThread = new Thread(client);
                    clientThread.setDaemon(true);
                    clientThread.start();
                    threadList.add(clientThread);

                    stage.close();  // start new stage afterwards with new scene

                    stage.setTitle(usernameField.getText() + " - Messenger");
                    stage.setScene(messagingUIContent(client));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        GridPane gridpane = new GridPane();
        gridpane.setVgap(15);

        gridpane.add(selectPokemonLabel, 0, 0);
        gridpane.add(currentPokemonMessage, 0, 1);
        int c = 0;
        int r = 2;
        for (Button b : buttons) {
            if ((c % 2 == 0) && (c != 0)) {
                r += 1;
                c = 0;
            }
            gridpane.add(b, c, r);
            c += 1;
        }
        gridpane.add(usernameLabel, 0, buttons.size());
        gridpane.add(usernameField, 1, buttons.size());
        gridpane.add(submitButton, 0, buttons.size() + 2);
        gridpane.setAlignment(Pos.CENTER);

        stage.setTitle("Choose Your Username");
        Scene scene = new Scene(gridpane, 600, 600);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * This method builds the contents of the messaging system for each client.
     * @param client The current client.
     * @return The completed messaging system scene.
     */
    public Scene messagingUIContent(Client client) throws FileNotFoundException {
        PokeInfo currentPokemon = client.pokemonList.get(0);
        ImageView imageView = new ImageView(currentPokemon.getBack());
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);

        ArrayList<Button> moveButtons = new ArrayList<>();
        Label moveLabel = new Label();
        moveLabel.setText("Select a move:");
        moveLabel.setStyle("-fx-font-weight: bold");
        ArrayList<Button> switchButtons = new ArrayList<>();
        Label switchLabel = new Label();
        switchLabel.setText("Select a Pokemon:");
        switchLabel.setStyle("-fx-font-weight: bold");

        for (int i = 0; i < currentPokemon.getMoves().length; i++) {
            moveButtons.add(new Button());
            moveButtons.get(i).setText(currentPokemon.getMoves()[i].getName());
        }

        for (int i = 0; i < client.pokemonList.size(); i++) {
            if (!(client.pokemonList.get(i).getName().equals(currentPokemon.getName()))) {
                switchButtons.add(new Button());
                switchButtons.get(switchButtons.size() - 1).setText(client.pokemonList.get(i).getName());
            }
        }

        ListView<String> messagingLogList = new ListView<>();
        messagingLogList.setItems(client.messages);

        TextField messageField = new TextField();
        messageField.setPromptText("Enter message here...");
        messageField.setOnAction(new EventHandler<>() {
            /**
             * Method that controls what happens when the client hits enter on their keyboard to send the message.
             * @param event Event of client hitting enter on their keyboard.
             */
            @Override
            public void handle(ActionEvent event) {
                // enter message into messages box when client hits enter on keyboard
                client.writeMessageToServer(" " + messageField.getText());
                messageField.clear();
            }
        });

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(15));
        gridpane.setHgap(2);
        gridpane.setVgap(15);

        gridpane.add(imageView, 10, 25);
        gridpane.add(messagingLogList, 60, 25);
        gridpane.add(messageField, 60, 35);
        gridpane.add(moveLabel, 9, 30);
        gridpane.add(switchLabel, 9, 35);

        int c = 10;
        int r = 30;
        for (Button b : moveButtons) {
            gridpane.add(b, c, r);
            c += 1;
        }

        c = 10;
        r = 35;
        for (Button b : switchButtons) {
            gridpane.add(b, c, r);
            c += 1;
        }

        return new Scene(gridpane, 800, 800);
    }

    /**
     * Method that controls what happens when a client exits the server.
     * @throws Exception Handles any errors that occur in the process of interrupting the appropriate thread.
     */
    @Override
    public void stop() throws Exception {
        super.stop();   // stop() function from Application abstract class
        for (Thread thread: threadList){
            thread.interrupt();
        }
    }

    /**
     * Main method that helps launch the JavaFX application (the client side).
     * @param args Any command-line arguments.
     */
    public static void main(String[] args){
        launch();
    }
}
