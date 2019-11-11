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
	 * metoden r�knar ut trycket f�r en v�tska i FluidTable p� ett visst djup
	 * @param fluid �r en v�tska ur FluidTable
	 * @param deep �r djupet trycket �r p�
	 * @return v�rdet f�r tryck p� ett visst djup
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density*9.82*deep;
		return fluidPressure;
	}
		
}


