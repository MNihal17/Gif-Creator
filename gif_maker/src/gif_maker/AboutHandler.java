package gif_maker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
public class AboutHandler implements EventHandler<ActionEvent>{
	private PopAbout pu;

	public AboutHandler(PopAbout popAbout) {
		this.pu=popAbout;
	}

	@Override
	public void handle(ActionEvent arg0) {
		pu.show();
		
	}

}
