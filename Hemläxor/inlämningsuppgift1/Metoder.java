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
	 * the method calculate the pressure for a Fluid in FluidTable on a certain deep
	 * @param fluid is a fluid from FluidTable
	 * @param deep is the deep for the pressure
	 * @return the value for the pressure on a certain deep
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density*9.82*deep;
		return fluidPressure;
	}
		
}


