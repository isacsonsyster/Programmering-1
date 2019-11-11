import enums.FluidTable;

public class Metoder {
	public static void main(String [] args) {
		
		
	System.out.println(fluidPressure(FluidTable.WATER, 10));
	
	}
	/**
	 * metoden räknar ut celcius från fahrenheit
	 * @param fahrenheit värdet i fahrenheit
	 * @return värdet i celcius
	 */
	public static double fahrenheitToCelcius(double fahrenheit) {
		double fahrenheitToCelcius = (fahrenheit-32) * 5/(9); 
		return fahrenheitToCelcius;
	}
	/**	
	 * metoden räknar ut celcius från Kelvin 
	 * @param kelvin värdet i kelvin
	 * @return värdet i celcius 
	 */
	public static double kelvinToCelcius(double kelvin) {
		double kelvinToCelcius = kelvin - 273.15;
		return kelvinToCelcius;
	}
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density*9.82*deep;
		return fluidPressure;
	}
		
}


