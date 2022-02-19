/**
 * 
 */
package lab1.ant;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author nicole
 *
 */
public class ControlBoard implements SelfCheckCapable{
	
	private boolean powerState;
	//to show if power is running or not
	
	
	public void reset() {
		//reset the system
		
	}
	
	public void powerOn() {
		//turn power on
	}
	
	public void powerOff() {
		//turn power off
	}
	
	public void receiveMessage() {
		/** receives messages from controller to delegate to the
		 * corresponding modules **/
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Control Board";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}


	

}
