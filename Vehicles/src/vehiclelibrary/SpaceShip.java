/**
 * 
 */
package vehiclelibrary;

/**
 * This class represents a SpaceShip
 * 
 * @author Patrick Neubauer
 *
 */
public class SpaceShip extends Vehicle {

	// public (!) fields
	public String name;
	public int currentWarpSpeed;
	public int maxWarpSpeed;
	public boolean shieldActivation;

	public ComplexEngine engine;

	public SpaceShip() {
		setWheels(0);
		setName("NoName");
		setMaxWarpSpeed(3);
		setCurrentWarpSpeed(0);
		deactivateShield();
		
		this.engine = new ComplexEngine();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ComplexEngine getEngine() {
		return engine;
	}
	
	public void setEngine(ComplexEngine engine) {
		this.engine = engine;
	}
	
	public int getMaxWarpSpeed() {
		return maxWarpSpeed;
	}
	
	public void setMaxWarpSpeed(int maxWarpSpeed) {
		this.maxWarpSpeed = maxWarpSpeed;
	}
	
	public void setNameMaxWarpSpeed(String name, int maxWarpSpeed) {
		this.name = name;
		this.maxWarpSpeed = maxWarpSpeed;
	}
	
	public void setNameMaxWarpSpeedFuel(String name, int maxWarpSpeed, Fuel fuel) {
		this.name = name;
		this.maxWarpSpeed = maxWarpSpeed;
		this.engine.setFuel(fuel);
	}
	
	/**
	 * Sets the current warp speed (needs to be less or equal the maximum warp speed)
	 * 
	 * @param currentWarpSpeed the current warp speed
	 * @return true if current warp speed has been successfully set, false otherwise
	 */
	public boolean setCurrentWarpSpeed(int currentWarpSpeed) {
		if (currentWarpSpeed <= this.maxWarpSpeed) {
			this.currentWarpSpeed = currentWarpSpeed;
			return true;
		} else {
			return false;
		}
	}
	
	public void activateShield() {
		this.shieldActivation = true;
	}
	
	public void deactivateShield() {
		this.shieldActivation = false;
	}
	
}// SpaceShip