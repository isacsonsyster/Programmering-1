
public class Metoder {
	public static void main(String [] args) {
		
		System.out.println(kelvinToCelcius(0));
		
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
	public static double kelvinToCelcius(double kelvin) {
		double kelvinToCelcius = kelvin - 273.15;
		return kelvinToCelcius;
	}
	
		
}


