package gif_maker;
import java.io.File;

import ca.utoronto.utm.util.Observable;
import ca.utoronto.utm.util.Observer;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class mainCenter extends HBox {
	
	
	public mainCenter() {
		this.setPrefSize(400, 400);
		//side panel of main center
		VBox side = new VBox();
		VBox v= new VBox();//made new vbox so can add spacing between button and fps text 
		
		//button formatted-> added graphic to button 
		Button load_pics= new Button();
		load_pics.setMaxSize(100, 80);
		Image loopM = new Image((new File("assets" + File.separator + "GO.png")).toURI().toString());
		ImageView loopView=new ImageView(loopM);
		loopView.setFitHeight(80);
		loopView.setFitWidth(100);
		load_pics.setGraphic(loopView);
		load_pics.setStyle("-fx-background-color: transparent");
		load_pics.setPadding(new Insets(0,10,0,0));
		
		
		
		
		
		//fps text field formatting and spacing 
		TextField FPS= new TextField("FPS: 0");
		FPS.setEditable(true);
		FPS.setMaxSize(100, 20);
		
		//setting the spacing between text field and the button 
		v.setPrefSize(100, 125);
		v.setPadding(new Insets(10,30,0,0));
		side.setPrefSize(150,400);
		
		//adding the button and fps text panel to the side panel of main center 
		v.getChildren().add(FPS);
		side.getChildren().add(load_pics);
		side.getChildren().add(v);
		
		this.getChildren().add(side);
		
		//viewing panel ->default logo set up 
		Pane viewer = new HBox();
		viewer.setMaxSize(400, 400);//default size 
		Image slow =   new Image((new File("assets" + File.separator + "soo.png")).toURI().toString());
		  ImageView sDown=new ImageView(slow);
		  viewer.getChildren().addAll(sDown);
		  this.getChildren().add(viewer);
	}
	}


