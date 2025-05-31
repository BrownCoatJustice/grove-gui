package me.habism.grove.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

/**
 * @author Habis Muhammed
 */
public class App extends Application {

    public final String appName = "grove";
    public static final Logger logger = Logger.getLogger(App.class.getName());

    @Override
    public void start(Stage primaryStg) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStg.setTitle(appName);
        primaryStg.setScene(new Scene(root));
        primaryStg.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
