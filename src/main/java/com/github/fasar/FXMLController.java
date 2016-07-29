package com.github.fasar;

import com.github.fasar.shape.modulo.ModuloConfig;
import com.github.fasar.shape.modulo.ModuloPrinter;
import com.github.fasar.shape.modulo.ModuloShape;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {

    @FXML
    private HBox hbox;

    @FXML
    private Accordion menuPane;

    @FXML
    private Button menuBtn;

    @FXML
    private Pane screenPane;


    @FXML
    void handleButtonMenu(ActionEvent event) {
        boolean isVisible = menuPane.isVisible();
        menuPane.setVisible(!isVisible);
        if(isVisible) {
            menuPane.setPrefWidth(0);
        } else {
            menuPane.setPrefWidth(menuPane.getMaxWidth());
        }
    }

    @FXML
    void onTest(ActionEvent event) {
        ModuloPrinter printer = new ModuloPrinter();
        ModuloConfig config = new ModuloConfig();
        ModuloShape shape = new ModuloShape();
        Canvas canvas = new Canvas(200,200);
        printer.printShape(canvas, shape, config);
        screenPane.getChildren().clear();
        screenPane.getChildren().add(canvas);

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
