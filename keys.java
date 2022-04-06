package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class keys extends Application implements EventHandler<ActionEvent>  {
	
	
	
	
	String[] guess1 = new String[4];
	String[] guess2 = new String[4];
	String[] guess3 = new String[4];
	String[] guess4 = new String[4];
	String[] guess5 = new String[4];
	
	public static void addTextLimiter(TextField textField, int maxLength) {
	    textField.textProperty().addListener(new ChangeListener<String>() {

	    	@Override
	    	public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
	            if (textField.getText().length() > maxLength) {
	                String string = textField.getText().substring(0, maxLength);
	                textField.setText(string);
	            }
	        }
	    	
	    });
	}
	
	public static void getLetter(TextField textField, int minLength) {
	    textField.textProperty().addListener(new ChangeListener<String>() {

	    	@Override
	    	public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
	           if(textField.getText().length() > minLength) {
	        	   String string = textField.getText().substring(0, minLength);
	        	   System.out.println(string);
	        }
	    	
	    }});
	}
	
	
	
	public static int getRandom() {
	    int rnd = new Random().nextInt(3129);
	    return rnd;
	}
	
	public static Character[] transferToArray ( String s) {
		   if ( s == null ) {
		     return null;
		   }

		   int length = s.length();
		   Character[] array = new Character[length];
		   for (int i = 0; i < length ; i++) {
		      
		      array[i] = s.charAt(i);
		   }

		   return array;
		}
	
public static void letterCheckRightLetters ( String answer, String guess ) {
		
		Character[] checkAnswer = transferToArray(answer);
		Character[] checkGuess = transferToArray(guess);
		
		for( int i = 0; i < answer.length(); i++) {
			
			if(checkGuess[i] == checkAnswer[0]) {
				if(i == 0) {
					System.out.println(checkGuess[0] + " is in the correct place");
				}
				else  {
					System.out.println(checkGuess[i] + " is in the word but in the wrong place");
				}
			}
			if(checkGuess[i] == checkAnswer[1]) {
				if(i == 1) {
					System.out.println(checkGuess[1] + " is in the correct place");
					}
				else {
					System.out.println(checkGuess[i] + " is in the word but in the wrong place");
				}
			}
			if(checkGuess[i] == checkAnswer[2]) {
				if(i == 2) {
					System.out.println(checkGuess[2] + " is in the correct place");
						}
				else {
					System.out.println(checkGuess[i] + " is in the word but in the wrong place");
					}
			}
			if(checkGuess[i] == checkAnswer[3]) {
				if(i == 3) {
					System.out.println(checkGuess[3] + " is in the correct place");
							}
				else {
					System.out.println(checkGuess[i] + " is in the word but in the wrong place");
						}
				
					}
			
				}	
							
			}


	
	public static void main(String[] args) throws FileNotFoundException {
	
		launch(args);
	}


	
	TextField text1a = new TextField();
	TextField text1b = new TextField();
	TextField text1c = new TextField();
	TextField text1d = new TextField();
	
	TextField text2a = new TextField();
	TextField text2b = new TextField();
	TextField text2c = new TextField();
	TextField text2d = new TextField();
	
	TextField text3a = new TextField();
	TextField text3b = new TextField();
	TextField text3c = new TextField();
	TextField text3d = new TextField();
	
	TextField text4a = new TextField();
	TextField text4b = new TextField();
	TextField text4c = new TextField();
	TextField text4d = new TextField();
	
	TextField text5a = new TextField();
	TextField text5b = new TextField();
	TextField text5c = new TextField();
	TextField text5d = new TextField();
	
	Button enter1 = new Button();
	Button enter2 = new Button();
	Button enter3 = new Button();
	Button enter4 = new Button();
	Button enter5 = new Button();
	
	@Override
	public void start(Stage window){
		
	window.setTitle("Wordle");
	GridPane root = new GridPane();
	
	root.setHgap(15);
	root.setVgap(15);
	
	root.add(text1a, 0, 1);
	text1a.setPrefWidth(75);
	text1a.setPrefHeight(75);
	text1a.setAlignment(Pos.CENTER);
	text1a.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text1a, 1);
	
	
	
	root.add(text1b, 1, 1);
	text1b.setPrefWidth(75);
	text1b.setPrefHeight(75);
	text1b.setAlignment(Pos.CENTER);
	text1b.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text1b, 1);
	

	
	root.add(text1c, 2, 1);
	text1c.setPrefWidth(75);
	text1c.setPrefHeight(75);
	text1c.setAlignment(Pos.CENTER);
	text1c.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text1c, 1);
	

	
	root.add(text1d, 3, 1);
	text1d.setPrefWidth(75);
	text1d.setPrefHeight(75);
	text1d.setAlignment(Pos.CENTER);
	text1d.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text1d, 1);
	
	
	
	root.add(enter1, 4, 1);
	enter1.setPrefWidth(50);
	enter1.setPrefHeight(25);
	enter1.setText("enter");
	enter1.setOnAction(this);
	
	
	
	root.add(text2a, 0, 2);
	text2a.setPrefWidth(75);
	text2a.setPrefHeight(75);
	text2a.setAlignment(Pos.CENTER);
	text2a.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text2a, 1);
	
	root.add(text2b, 1, 2);
	text2b.setPrefWidth(75);
	text2b.setPrefHeight(75);
	text2b.setAlignment(Pos.CENTER);
	text2b.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text2b, 1);
	
	root.add(text2c, 2, 2);
	text2c.setPrefWidth(75);
	text2c.setPrefHeight(75);
	text2c.setAlignment(Pos.CENTER);
	text2c.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text2c, 1);
	
	root.add(text2d, 3, 2);
	text2d.setPrefWidth(75);
	text2d.setPrefHeight(75);
	text2d.setAlignment(Pos.CENTER);
	text2d.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text2d, 1);
	
	root.add(enter2, 4, 2);
	enter2.setPrefWidth(50);
	enter2.setPrefHeight(25);
	enter2.setText("enter");
	
	
	
	
	root.add(text3a, 0, 3);
	text3a.setPrefWidth(75);
	text3a.setPrefHeight(75);
	text3a.setAlignment(Pos.CENTER);
	text3a.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text3a, 1);
	
	root.add(text3b, 1, 3);
	text3b.setPrefWidth(75);
	text3b.setPrefHeight(75);
	text3b.setAlignment(Pos.CENTER);
	text3b.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text3b, 1);
	
	root.add(text3c, 2, 3);
	text3c.setPrefWidth(75);
	text3c.setPrefHeight(75);
	text3c.setAlignment(Pos.CENTER);
	text3c.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text3c, 1);
	
	root.add(text3d, 3, 3);
	text3d.setPrefWidth(75);
	text3d.setPrefHeight(75);
	text3d.setAlignment(Pos.CENTER);
	text3d.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text3d, 1);
	
	root.add(enter3, 4, 3);
	enter3.setPrefWidth(50);
	enter3.setPrefHeight(25);
	enter3.setText("enter");
	
	
	
	
	root.add(text4a, 0, 4);
	text4a.setPrefWidth(75);
	text4a.setPrefHeight(75);
	text4a.setAlignment(Pos.CENTER);
	text4a.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text4a, 1);
	
	root.add(text4b, 1, 4);
	text4b.setPrefWidth(75);
	text4b.setPrefHeight(75);
	text4b.setAlignment(Pos.CENTER);
	text4b.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text4b, 1);
	
	root.add(text4c, 2, 4);
	text4c.setPrefWidth(75);
	text4c.setPrefHeight(75);
	text4c.setAlignment(Pos.CENTER);
	text4c.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text4c, 1);
	
	root.add(text4d, 3, 4);
	text4d.setPrefWidth(75);
	text4d.setPrefHeight(75);
	text4d.setAlignment(Pos.CENTER);
	text4d.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text4d, 1);
	
	root.add(enter4, 4, 4);
	enter4.setPrefWidth(50);
	enter4.setPrefHeight(25);
	enter4.setText("enter");
	
	
	
	
	root.add(text5a, 0, 5);
	text5a.setPrefWidth(75);
	text5a.setPrefHeight(75);
	text5a.setAlignment(Pos.CENTER);
	text5a.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text5a, 1);
	
	root.add(text5b, 1, 5);
	text5b.setPrefWidth(75);
	text5b.setPrefHeight(75);
	text5b.setAlignment(Pos.CENTER);
	text5b.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text5b, 1);
	
	root.add(text5c, 2, 5);
	text5c.setPrefWidth(75);
	text5c.setPrefHeight(75);
	text5c.setAlignment(Pos.CENTER);
	text5c.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text5c, 1);
	
	root.add(text5d, 3, 5);
	text5d.setPrefWidth(75);
	text5d.setPrefHeight(75);
	text5d.setAlignment(Pos.CENTER);
	text5d.setFont(Font.font ("Verdana", 35));
	addTextLimiter(text5d, 1);
	
	root.add(enter5, 4, 5);
	enter5.setPrefWidth(50);
	enter5.setPrefHeight(25);
	enter5.setText("enter");
	
	
	
	Scene scene = new Scene(root, 400, 400);
	scene.setOnKeyPressed(event -> text1a.setText(event.getCode().toString()));

	
	window.setScene(scene);
	window.show();
		
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String num1 = text1a.getText();
		String num2 = text1a.getText();
		String num3 = text1a.getText();
		String num4 = text1a.getText();
		String [] guess1 = new String [4];
			guess1 [0] = num1;
			guess1 [1] = num2;
			guess1 [2] = num3;
			guess1 [3] = num4;
			
			String guessString = guess1.toString();
			
		System.out.printf(guessString);
	}

}

