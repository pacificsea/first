package com.javafx01;

import javafx.application.Application;
import javafx.stage.Stage;

public class first extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("第一个项目");
        stage.setWidth(300);
        stage.setHeight(200);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
