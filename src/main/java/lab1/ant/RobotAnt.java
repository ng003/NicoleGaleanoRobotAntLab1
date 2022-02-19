/**
 * 
 */
package lab1.ant;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;
//import edu.fiu.jit.SelfCheckUtils;

/**
 * @author nicole
 *
 */
public class RobotAnt implements GenericComponent {

	private String brand = "FREENOVE";
	private double price;
	private int itemModelNum;
	private String color;
	private String material;
	private String headType;
	
	private RaspberryPi myRaspberryPi;
	private IRRemote myIRRemote;
	private Client myClient;
	private Battery myBattery;
	private ControlBoard myControlBoard;

	
	public static void main(String[] args)  {
		System.out.println("Testing");
		System.out.println("12345");
		
	}
	
	public RobotAnt() {
		myRaspberryPi = new RaspberryPi();
		myIRRemote = new IRRemote();
		myClient = new Client();
		myBattery = new Battery();
		myControlBoard = new ControlBoard();
	}
	
	public void crawlForward() {	
		
	}
	
	public void crawlBackward() {		
		
	}
	
	public void turnLeft() {
		
	}
	
	public void turnRight() {	
		
	}
	
	public void spotTurnLeft() {
		
	}
	
	public void spotTurnRight() {	
		
	}
	
	public void highSpeed() {
		
	}
	
	public void mediumSpeed() {	
		
	}
	
	public void lowSpeed() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return brand + " Robot Ant";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myRaspberryPi, myIRRemote, myClient, myBattery, myControlBoard); 
		// add all your sub components
		return internalComponents;
	}



}
