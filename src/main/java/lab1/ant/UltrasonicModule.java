/**
 * 
 */
package lab1.ant;

/**
 * @author nicole
 *
 */
public class UltrasonicModule extends Component {
	
	private int voltage; //the working voltage
	
	private int minDistance; //minimum measured distance in cm
	
	private int maxDistance; //maximum measured distance in cm
	
	private int current; //the working current in milliampere (mA)
	
	
	public void obstacleAvoidanceOn() {
		//turns on the ultrasonic waves function for obstacle avoidance
	}
	public void obstacleAvoidanceOff() {
		//no obstacle avoidance -- turns off the ultrasonic waves function
	}
}
