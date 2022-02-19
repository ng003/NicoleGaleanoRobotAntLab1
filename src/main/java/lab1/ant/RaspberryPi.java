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
public class RaspberryPi implements SelfCheckCapable{
	
	private String currentSoftware;
	
	public void installNewSoftware() {
		//new software is installed into the RaspberryPi
	}
	
	public void checkUpgradeCompatibility() {
		
	}
	
	public void checkIntegrity() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Raspberry Pi";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.2);
	}

}
