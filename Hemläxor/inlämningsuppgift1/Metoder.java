import enums.FluidTable;

public class Metoder {
	
	static double g_swe = 9.82;
	static double c = Math.pow(10, 2)* 2.99792458;
	static double G = Math.pow(10, -11) * 6.674;
	static double p_0 = 1000;
	static double R = 8.3145;
	
	public static void main(String [] args) {
		System.out.println(delta(5,1));
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
	public static double delta (double first, double last) {
		double delta = last-first;
		return delta; 
	}
		
}


