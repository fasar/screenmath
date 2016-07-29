package com.github.fasar.shape.modulo;

import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 * Created by SARTOR on 29.07.2016.
 */
public class ModuloPrinter {

    double x;
    double y;
    boolean isClick = false;

    private EventHandler<? super MouseEvent> onClick = (event -> {
        isClick = true;
        x = event.getX();
        y = event.getY();
    });
    private Object onClick2;

    public ModuloShape nextShape(ModuloShape moduleShape) {
        return null;
    }

    public void printShape(Canvas canvas, ModuloShape shape, ModuloConfig config) {
        final double height = canvas.getHeight();
        final double width = canvas.getWidth();
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double radius = Math.min(height, width);

        gc.setFill(Color.rgb(0, 0, 255, 0.5));
        gc.setLineWidth(config.getCircleLineSize());
        gc.setStroke(Color.rgb(255, 0, 0, 1));
        gc.strokeArc(10, 10, radius-20, radius-20, 0.0, 360.0, ArcType.OPEN);



        canvas.setOnDragDetected(event -> {
            canvas.setLayoutX(canvas.getLayoutX() + 5);
            canvas.setLayoutY(canvas.getLayoutY() + 5);
        });
    }

}
