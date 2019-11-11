import enums.FluidTable;

public class Metoder {
	public static void main(String [] args) {
		
		
	
	
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
	 * metoden räknar ut trycket för en vätska i FluidTable på ett visst djup
	 * @param fluid är en vätska ur FluidTable
	 * @param deep är djupet trycket är på
	 * @return värdet för tryck på ett visst djup
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density*9.82*deep;
		return fluidPressure;
	}
		
}


