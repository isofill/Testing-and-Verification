package main;

/**
 * Object that defines the position of the car on the X/Y axes, the situation of the parking
 * spaces detected.
 * 
 * * @author Group1: Aseel Naji, Filip Isakovski, Antonino Sauleo, Maria-Bianca Cindroi
 */
public class Position {


	/**
	 * The car moves on the X-axis.
	 * The Y-axis can be false or true, which represent parked or not parked. 
	 * Available represents if the car finds a place to park or not. 
	 */
	private int x;
	private boolean y;
	private boolean available;
	
	/**
	 * Method that constructs the position.
	 * */
	public Position(int x, boolean y, boolean available){
		setPosition(x);
		setParked(y);
	}
	
	/**
	 * Method that sets the position.
	 * */
	public void setPosition(int x){
		if (x >= 0 && x <= 500){
			this.x = x;
		}
	}
	
	/**
	 * Method that gets the position on the X-axis.
	 */
	public int getPositionOnStreet(){
		return x;
	}
	
	/**
	 * Method that returns the parking status.
	 */
	public boolean getParkingStatus(){
		return y;
		
	}
	
	/**
	 * Method that sets the parking status.
	 */
	public boolean setParked(boolean parked){
		
		return this.y;
	}
	
	/**
	 * Method that returns the status of available parking spots.
	 * */
	public boolean getParkingSpots(){
		return this.available;
	}

}
