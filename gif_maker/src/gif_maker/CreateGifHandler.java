package gif_maker;
import java.io.File;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CreateGifHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent arg0) {
		//ext to add to end of folder name if default gif folder name exists
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000) + 1;
		File newbie =new File("gif");
		boolean made=newbie.mkdir();
		if (!made) {
			 newbie =new File("gif"+Integer.toString(randomInt));
			 newbie.mkdir();
			
		}
	

	}

}
