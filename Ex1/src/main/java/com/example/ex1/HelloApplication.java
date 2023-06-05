package com.example.ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication{
    public static void main(String[] args) {
        Coordinates coordinates = new Coordinates(10,20,"A");
        System.out.println(coordinates.toString());

        coordinates.setX(30);
        coordinates.setY(40);
        coordinates.setName("B");
        System.out.println(coordinates.toString());
    }
}