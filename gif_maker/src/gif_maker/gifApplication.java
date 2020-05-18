package gif_maker;
import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
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
		Menu save = new Menu("Save");
		Menu about = new Menu("About");
		menuBar.getMenus().addAll(save,about);
		VBox topMenu = new VBox();
		topMenu.getChildren().add(menuBar);
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


