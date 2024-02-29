package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class autoclicker {

	public static void main(String[] args) throws AWTException{
		
		for(int i=0;i<=5;i++) {
			mouseclick();
			wait(2500);
		}
		

	}

	public static void wait(int x) {
		try {
			Thread.sleep(x);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void mouseclick() throws AWTException{
		Robot bot=new Robot();
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
	}
}
