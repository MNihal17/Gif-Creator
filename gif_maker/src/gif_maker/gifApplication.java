package gif_maker;
import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class gifApplication extends Application {
	public void start(Stage stage) throws Exception {
		mainCenter centerPart;
		
		
		//creating main layout
		stage.setTitle("Gif Maker 9000");
		BorderPane gm= new BorderPane();
		
		//create the icon
		Image a = new Image((new File("assets" + File.separator + "GIFMAKERLOGO.png")).toURI().toString());
		ImageView v= new ImageView(a);
		v.setFitHeight(250);
		v.setFitWidth(250);
		v.setPreserveRatio(true);
		
		//creating the above menu 
		MenuBar menuBar = new MenuBar();
		
		
		Menu menu = new Menu("Options");
		MenuItem menuItem1 = new MenuItem("Save GIF");
		MenuItem menuItem3 = new MenuItem("Create NEW GIF");
		MenuItem menuItem2 = new MenuItem("About");
		SeparatorMenuItem separator = new SeparatorMenuItem();
		SeparatorMenuItem separator1 = new SeparatorMenuItem();


		menu.getItems().add(menuItem3);
		menu.getItems().add(separator);
		menu.getItems().add(menuItem1);
		menu.getItems().add(separator1);
		menu.getItems().add(menuItem2);

		menuBar.getMenus().add(menu);
		menuItem2.setOnAction(new AboutHandler(new PopAbout()));//opens up a about me pop up 
		menuItem3.setOnAction(new CreateGifHandler());
		gm.setTop(menuBar);
		
		//create the center 
		centerPart=new mainCenter();
		centerPart.setPadding(new Insets(20,0,0,20));
		gm.setCenter(centerPart);
		
		//add the bottom panel for the view scroll thing 
	    HBox bottomBar = new HBox();
	    gm.setBottom(bottomBar);
		
		
		
		
		
		
		//creating the main gif maker scene
		Scene scene = new Scene(gm,650,600, Color.IVORY); 
	
		stage.setScene(scene);
		
		
		
		
		
		// make GUI show & add the icon
		stage.getIcons().add(a);
		stage.setResizable(false);
		stage.show();
	}
	public static void main(String[] args) {
		//musicApplication view = new musicApplication();
		launch(args);
		
	}
}


