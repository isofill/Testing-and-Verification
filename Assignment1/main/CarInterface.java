package main;

import newErrorHandling.StreetLengthException;


/**
 * Interface of the Car.
 * @author Group1: Aseel Naji, Filip Isakovski, Antonino Sauleo, Maria-Bianca Cindroi
 */

public interface CarInterface {
	
   /**
     * The car moves forward with one meter, by querying the ultrasound sensors
     * through the isEmpty method.
     * @return Position(data structure)
     * @throws StreetLengthException 
     */
    public Position moveForward(UltrasoundSensor ultrasoundOne, UltrasoundSensor ultrasoundTwo) 
    		throws StreetLengthException;

    /**
     * Query the two ultrasound sensors and filter
     * the noise in their result .
     * @return distanceToObject (to the nearest object in the right hand sight)
     * @throws StreetLengthException 
     */
    public int isEmpty(UltrasoundSensor ultrasoundOne, UltrasoundSensor ultrasoundTwo)
    		throws IllegalArgumentException, StreetLengthException;

    /**
     * The car moves backward with one meter, by querying the ultrasound sensors
     * through the isEmpty method.
     * @return Position (of the car)
     * @throws StreetLengthException 
     */    
    public Position moveBackward(UltrasoundSensor ultrasoundOne, UltrasoundSensor ultrasoundTwo) 
    		throws StreetLengthException;
	
    /**
     *The car moves to the beginning of the current 5 meter free stretch of parking place, or until
     *the end of the street until an empty parking spot is detected. 
     */
    public void park();
   
    /**
     *The car moves forward (and to left) to front of the parking place.
     */
    public void unpark();
    
    /**
     * @return Position (of the car)
     */
    public Position whereIs();
}
