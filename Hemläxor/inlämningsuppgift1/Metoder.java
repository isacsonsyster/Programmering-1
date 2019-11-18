import enums.FluidTable;
import enums.GasTable;
import enums.SolidTable;

public class Metoder {
	
	static double g_swe = 9.82;
	static double c = Math.pow(10, 2)* 2.99792458;
	static double G = Math.pow(10, -11) * 6.674;
	static double p_0 = 1000;
	static double R = 8.3145;
	
	public static void main(String [] args) {
		System.out.println (svtVelocity(10,5));
		
	}
	/**
	 * the method calculate Fahrenheit to celcius 
	 * @param fahrenheit the value in fahrenheit
	 * @return the value in celcius
	 */
	public static double fahrenheitToCelcius(double fahrenheit) {
		double fahrenheitToCelcius = (fahrenheit-32) * 5/(9); 
		return fahrenheitToCelcius;
	}
	
	/**	
	 * the method calculate celcius from Kelvin 
	 * @param kelvin the value in kelvin
	 * @return the value in celcius 
	 */
	public static double kelvinToCelcius(double kelvin) {
		double kelvinToCelcius = kelvin - 273.15;
		return kelvinToCelcius;
	}
	
	/**
	 * the method calculate the pressure for a Fluid in FluidTable on a certain deep
	 * @param fluid is a fluid from FluidTable
	 * @param deep is the deep for the pressure measured in meter
	 * @return the value for the pressure on a certain deep in measured in Pascal
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density*g_swe*deep;
		return fluidPressure;
	}
	
	/**
	 * the method calculate the pressure for Water on a certain deep. 
	 * @param deep is the deep for the pressure under water measured in meter
	 * @return the value for the water pressure on a certain deep measured in Pascal
	 */
	public static double pressureUnderWater(double deep) {
		double pressureUnderWater = FluidTable.WATER.density*g_swe*deep;
		return pressureUnderWater;	
	}
	
	/**
	 * the method calculate the kinetic energy for a object with mass and velocity
	 * @param mass is the mass for the object measured in kilogram
	 * @param velocity is the velocity for the object measured in meter per second 
	 * @return the value for the kinetic energy for a object measured in Joule
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = (mass* Math.pow(velocity, 2))/2;
		return kineticEnergy;
	}
	
	/**
	 * the method calculate the potential energy for a object with mass and height
	 * @param mass is the mass for the object measured in kilogram
	 * @param height is the height for the object measured in meter
	 * @return the value for the potential energy for a object measured in Joule
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass*g_swe*height;
		return potentialEnergy;
	}
	
	/**
	 * the method calculate the velocity the object has if you drop it from a certain height
	 * @param height is the height the object is dropped from measured in meter
	 * @return the value of the velocity the object has, measured in m/s
	 */
	public static double fallSpeed(double height) {
		double fallSpeed = Math.sqrt((2*height) / g_swe) * g_swe;
		return fallSpeed;
	}
	
	/**
	 * the method calculate the delta (difference) between two numbers
	 * @param first is the first number
	 * @param last is the last number 
	 * @return the delta (difference) between the two numbers
	 */
	public static double delta (double first, double last) {
		double delta = last-first;
		return delta; 
	}
	
	/**
	 * the method calculate the mass of a fluid from the Fluidtable
	 * @param fluid is a fluid from the fluidtable we calculate the mass of
	 * @param volume is the volume of the fluid we calculate with, measured in cm^3
	 * @return the mass of the fluid measured in gram
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumeToMass = fluid.density*volume;
		return volumeToMass;
	}
	
	/**
	 * the method calculate the mass of a gas from the gastable
	 * @param gas is the gas from the gastable we calculate the mass on
	 * @param volume is the volume of the gas we calculate with, measured in cm^3
	 * @return the mass of the gas measured in gram
	 */
	public static double volumeToMass(GasTable gas, double volume){
		double volumeToMass = gas.density*volume;
		return volumeToMass;	
	}
	
	/**
	 * the method calculate the mass of a solid from the solidtable
	 * @param solid is a solid from the solidtable we calculate the mass on
	 * @param volume is the volume o the solid we calculate with, measuerd in cm^3 
	 * @return the mass of the solid, measured in gram
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumeToMass = solid.density*volume;
		return volumeToMass;	
	}
	
	/**
	 * the method calculate the average velocity with distance and time
	 * @param distance is how long it went measured in meter
	 * @param time is how long it has went, measured in seconds
	 * @return the average speed, measured in meter per seconds
	 */
	public static double svtVelocity(double distance, double time) {
		double svtVelocity = distance/time;
		return svtVelocity;
	}
	
	/**
	 * the method calculate the distance with velocity and time 
	 * @param velocity is the how fast it went, measured in meter per seconds
	 * @param time is how long it has went, measured in seconds
	 * @return the distance, measured in meter
	 */
	public static double svtDistance(double velocity, double time) {
		double svtDistance = velocity*time;
		return svtDistance;
	}



	
		
}


