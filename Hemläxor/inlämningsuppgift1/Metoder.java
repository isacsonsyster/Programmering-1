import enums.FluidTable;

public class Metoder {
	public static void main(String [] args) {
		
		
	System.out.println(fluidPressure(FluidTable.WATER, 10));
	
	}
	/**
	 * metoden r�knar ut celcius fr�n fahrenheit
	 * @param fahrenheit v�rdet i fahrenheit
	 * @return v�rdet i celcius
	 */
	public static double fahrenheitToCelcius(double fahrenheit) {
		double fahrenheitToCelcius = (fahrenheit-32) * 5/(9); 
		return fahrenheitToCelcius;
	}
	/**	
	 * metoden r�knar ut celcius fr�n Kelvin 
	 * @param kelvin v�rdet i kelvin
	 * @return v�rdet i celcius 
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


