package com.example.demo;


import javafx.application.Application;

import javafx.css.converter.FontConverter;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.*;
import javafx.stage.Stage;
//...
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
//
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;



public class HelloApplication extends Application {


    @Override
    public void start(Stage primaryStage) {


        Rectangle rect=new Rectangle(); //instantiating Rectangle
        rect.setX(0); //setting the X coordinate of upper left //corner of rectangle
        rect.setY(0); //setting the Y coordinate of upper left //corner of rectangle
        rect.setWidth(1400); //setting the width of rectangle
        rect.setHeight(150); // setting the height of rectangle
        rect.setFill(Color.SADDLEBROWN);

        Circle cir = new Circle(80,75,60);
        cir.setStroke(Color.BLACK);
        cir.setStrokeWidth(4);
        cir.setFill(Color.WHITE);
        Image img = new Image("https://media.baamboozle.com/uploads/images/119974/1622419859_44032_url.jpeg");
        cir.setFill(new ImagePattern(img));
        //...
        Circle cir1 = new Circle(1000,300,60);
        cir1.setStroke(Color.BLACK);
        cir1.setStrokeWidth(6);
        cir1.setFill(Color.WHITE);
//        Blend blend = new Blend();
//        ColorInput color = new ColorInput(70, 20, 160, 150, Color.LIMEGREEN);
//        blend.setTopInput(color);
//        blend.setMode(BlendMode.ADD);


        Image img1 = new Image("https://png.pngtree.com/element_our/png/20181206/users-vector-icon-png_260862.jpg");
        cir1.setFill(new ImagePattern(img1));

        Label label = new Label("SCHOOL MANAGEMENT SYSTEM");
        label.setFont(new Font(35));
        label.setTextFill(Color.BLACK);
        label.setTranslateX(500);
        label.setTranslateY(70);

        Label label1 = new Label("Student ID");
        label1.setFont(new Font(20));
        label1.setTextFill(Color.BURLYWOOD);
        label1.setTranslateX(30);
        label1.setTranslateY(220);
        TextField tf1=new TextField();
        GridPane Box1=new GridPane();
        Box1.addRow(0, label1,tf1);
        Box1.setTranslateX(200);
        Box1.setTranslateY(155);

        Line line = new Line();
        line.setStroke(Color.WHITE);
        line.setStartX(30);
        line.setEndX(200);
        line.setStartY(285);
        line.setEndY(285);
        line.setTranslateX(1);
        line.setTranslateY(-35);
        //.......1

        Label label2 = new Label("Search Student");
        label2.setFont(new Font(20));
        label2.setTextFill(Color.BURLYWOOD);
        label2.setTranslateX(30);
        label2.setTranslateY(150);
        TextField tf2=new TextField();
        GridPane Box2=new GridPane();
        Box2.addRow(0, label2,tf2);
        Box2.setTranslateX(200);
        Box2.setTranslateY(220);

        Line line1 = new Line();
        line1.setStroke(Color.WHITE);
        line1.setStartX(30);
        line1.setEndX(200);
        line1.setStartY(285);
        line1.setEndY(285);
        line1.setTranslateX(1);
        line1.setTranslateY(-100);
        //2........
        Label label3 = new Label("FULL NAME");
        label3.setFont(new Font(20));
        label3.setTextFill(Color.BURLYWOOD);
        label3.setTranslateX(30);
        label3.setTranslateY(285);
        TextField tf3=new TextField();
        GridPane Box3=new GridPane();
        Box3.addRow(0, label3,tf3);
        Box3.setTranslateX(200);
        Box3.setTranslateY(285);

        Line line2 = new Line();
        line2.setStroke(Color.WHITE);
        line2.setStartX(30);
        line2.setEndX(200);
        line2.setStartY(285);
        line2.setEndY(285);
        line2.setTranslateX(1);
        line2.setTranslateY(30);
        //3..........
        Label label4 = new Label("GENDER");
        label4.setFont(new Font(20));
        label4.setTextFill(Color.BURLYWOOD);
        label4.setTranslateX(30);
        label4.setTranslateY(350);
        TextField tf4=new TextField();
        GridPane Box4=new GridPane();
        Box4.addRow(0, label4,tf4);
        Box4.setTranslateX(200);
        Box4.setTranslateY(350);

        Line line3 = new Line();
        line3.setStroke(Color.WHITE);
        line3.setStartX(30);
        line3.setEndX(200);
        line3.setStartY(285);
        line3.setEndY(285);
        line3.setTranslateX(1);
        line3.setTranslateY(95);
        //4..........
        Label label5 = new Label("Date of Birth");
        label5.setFont(new Font(20));
        label5.setTextFill(Color.BURLYWOOD);
        label5.setTranslateX(30);
        label5.setTranslateY(415);
        TextField tf5=new TextField();
        GridPane Box5=new GridPane();
        Box5.addRow(0, label5,tf5);
        Box5.setTranslateX(200);
        Box5.setTranslateY(415);

        Line line4 = new Line();
        line4.setStroke(Color.WHITE);
        line4.setStartX(30);
        line4.setEndX(200);
        line4.setStartY(285);
        line4.setEndY(285);
        line4.setTranslateX(1);
        line4.setTranslateY(160);
        //5...........
        Label label6 = new Label("Email");
        label6.setFont(new Font(20));
        label6.setTextFill(Color.BURLYWOOD);
        label6.setTranslateX(30);
        label6.setTranslateY(480);
        TextField tf6=new TextField();
        GridPane Box6=new GridPane();
        Box6.addRow(0, label6,tf6);
        Box6.setTranslateX(200);
        Box6.setTranslateY(480);

        Line line5 = new Line();
        line5.setStroke(Color.WHITE);
        line5.setStartX(30);
        line5.setEndX(200);
        line5.setStartY(285);
        line5.setEndY(285);
        line5.setTranslateX(1);
        line5.setTranslateY(225);
        //6............
        Label label7 = new Label("Phone Number");
        label7.setFont(new Font(20));
        label7.setTextFill(Color.BURLYWOOD);
        label7.setTranslateX(30);
        label7.setTranslateY(545);
        TextField tf7=new TextField();
        GridPane Box7=new GridPane();
        Box7.addRow(0, label7,tf7);
        Box7.setTranslateX(200);
        Box7.setTranslateY(545);

        Line line6 = new Line();
        line6.setStroke(Color.WHITE);
        line6.setStartX(30);
        line6.setEndX(200);
        line6.setStartY(285);
        line6.setEndY(285);
        line6.setTranslateX(1);
        line6.setTranslateY(290);
        //7........
        Label label8 = new Label("Faculty");
        label8.setFont(new Font(20));
        label8.setTextFill(Color.BURLYWOOD);
        label8.setTranslateX(430);
        label8.setTranslateY(220);
        TextField tf8=new TextField();
        GridPane Box8=new GridPane();
        Box8.addRow(0, label8,tf8);
        Box8.setTranslateX(590);
        Box8.setTranslateY(220);

        Line line7 = new Line();
        line7.setStroke(Color.WHITE);
        line7.setStartX(30);
        line7.setEndX(200);
        line7.setStartY(285);
        line7.setEndY(285);
        line7.setTranslateX(400);
        line7.setTranslateY(-35);
        //8............
        Label label9 = new Label("Department");
        label9.setFont(new Font(20));
        label9.setTextFill(Color.BURLYWOOD);
        label9.setTranslateX(430);
        label9.setTranslateY(285);
        TextField tf9=new TextField();
        GridPane Box9=new GridPane();
        Box9.addRow(0, label9,tf9);
        Box9.setTranslateX(590);
        Box9.setTranslateY(285);

        Line line8 = new Line();
        line8.setStroke(Color.WHITE);
        line8.setStartX(30);
        line8.setEndX(200);
        line8.setStartY(285);
        line8.setEndY(285);
        line8.setTranslateX(400);
        line8.setTranslateY(30);
        //9..........
        Label label10 = new Label("Scholarship Type");
        label10.setFont(new Font(20));
        label10.setTextFill(Color.BURLYWOOD);
        label10.setTranslateX(430);
        label10.setTranslateY(350);
        TextField tf10=new TextField();
        GridPane Box10=new GridPane();
        Box10.addRow(0, label10,tf10);
        Box10.setTranslateX(590);
        Box10.setTranslateY(350);

        Line line9 = new Line();
        line9.setStroke(Color.WHITE);
        line9.setStartX(30);
        line9.setEndX(200);
        line9.setStartY(285);
        line9.setEndY(285);
        line9.setTranslateX(400);
        line9.setTranslateY(95);
        //10...........
        Label label11 = new Label("Date of Entry");
        label11.setFont(new Font(20));
        label11.setTextFill(Color.BURLYWOOD);
        label11.setTranslateX(430);
        label11.setTranslateY(415);
        TextField tf11=new TextField();
        GridPane Box11=new GridPane();
        Box11.addRow(0, label11,tf11);
        Box11.setTranslateX(590);
        Box11.setTranslateY(415);

        Line line10 = new Line();
        line10.setStroke(Color.WHITE);
        line10.setStartX(430);
        line10.setEndX(200);
        line10.setStartY(285);
        line10.setEndY(285);
        line10.setTranslateX(230);
        line10.setTranslateY(160);
        //11
        Label label12 = new Label("Student Status");
        label12.setFont(new Font(20));
        label12.setTextFill(Color.BURLYWOOD);
        label12.setTranslateX(430);
        label12.setTranslateY(480);
        TextField tf12=new TextField();
        GridPane Box12=new GridPane();
        Box12.addRow(0, label12,tf12);
        Box12.setTranslateX(590);
        Box12.setTranslateY(480);

        Line line11 = new Line();
        line11.setStroke(Color.WHITE);
        line11.setStartX(430);
        line11.setEndX(200);
        line11.setStartY(285);
        line11.setEndY(285);
        line11.setTranslateX(230);
        line11.setTranslateY(225);
        //butoon....
        Button btn1 = new Button("Browse");
        HBox group1 = new HBox(btn1);
        group1.setSpacing(40);
        group1.setTranslateX(975);
        group1.setTranslateY(400);
        //....2 button
        FlowPane group2 = new FlowPane();
        group2.setVgap(6);
        group2.setHgap(5);
        group2.setPrefWrapLength(250);
        group2.getChildren().add(new Button("Add Record"));
        group2.getChildren().add(new Button("Update"));
        group2.getChildren().add(new Button("DELETE"));
        group2.getChildren().add(new Button("CLEAR"));
        group2.setTranslateX(900);
        group2.setTranslateY(600);



        Group root1 = new Group();

        root1.getChildren().addAll(rect,cir,line,line1,Box1,Box2,label1,label2,label,line2,label3,Box3,line3,label4,Box4,line4,label5,Box5,line5,label6,Box6,
                line6,label7,Box7,line7,label8,Box8,line8,label9,Box9,line9,label10,Box10,line10,label11,Box11,
                line11,label12,Box12,cir1,group1,group2
        );


        Scene scene = new Scene(root1, 1000, 600, Color.MEDIUMVIOLETRED);
        primaryStage.setTitle("SCHOOL MANAGEMENT SYSTEM");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}