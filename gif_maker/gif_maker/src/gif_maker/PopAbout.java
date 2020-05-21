package gif_maker;

import java.io.File;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PopAbout {
	private Stage stage;
	PopAbout(){
		this.stage=new Stage();//new stage
		VBox songL= new VBox();
		songL.setPrefSize(310, 500);
		//Scene scene = new Scene(songL,250,250, Color.IVORY); 
		
		//make a scroll box 
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setContent(songL);
		Scene scene = new Scene(scrollPane,310, 150);
		scrollPane.pannableProperty().set(true);
		scrollPane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
		scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.ALWAYS);
		scrollPane.fitToWidthProperty().set(true);
		scrollPane.fitToHeightProperty().set(true);
		
		//make the about label
		Label aN= new Label();
		 //aN.setEditable(false);
		 aN.setMinHeight(200);
		 aN.setMinWidth(300);
		 aN.setText("The GIF MAKER 9000 is a application used to create \n your own GIFS!  You can set the frame rate, choose \n pictures,  save your unfinished GIF, and much more! \n \n");
		//songL.getChildren().add(aN);
		
		
		//add icon and set the scene
		Image a = new Image((new File("assets" + File.separator + "GIFMAKERLOGO.png")).toURI().toString());
		ImageView v= new ImageView(a);
		v.setFitHeight(250);
		v.setFitWidth(250);
		v.setPreserveRatio(true);
		songL.getChildren().add(aN);
		//songL.getChildren().add(v);
		stage.setScene(scene);
		stage.setTitle("ABOUT");
		stage.getIcons().add(a);
		stage.setResizable(false);
	}

	public void show() {
		stage.show();
	}
	public void close() {
		stage.close();
	
	}
}
