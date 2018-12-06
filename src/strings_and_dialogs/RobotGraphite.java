package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraphite {
	public static void main(String[] args) {
		Robot R2D2 = new Robot();
		R2D2.setX(150);
		R2D2.setY(500);
		R2D2.penDown();
		R2D2.setSpeed(150);
		R2D2.move(400);
		R2D2.setX(150);
		R2D2.setY(300);
		R2D2.turn(45);
		R2D2.move(260);
		R2D2.setX(150);
		R2D2.setY(300);
		R2D2.turn(90);
		R2D2.move(260);
		
	}
}
