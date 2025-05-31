/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.habism.grove.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

/**
 *
 * @author habism
 */
public class MainController {

    @FXML
    private ToggleButton toggleSessionButton;

    public void startStop(ActionEvent toggle) {
        if (toggleSessionButton.isSelected()) {
            App.logger.finest("Started session.");
            // toggleSessionButton.setText("XX:YY");
        } else {
            App.logger.finest("Stopped session.");
            // toggleSessionButton.setText("lol, sesh over.");
        }
    }
}
