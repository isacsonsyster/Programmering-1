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
		/**
		System.out.println (volumeToMass(SolidTable.IRON, 60000));
		System.out.println(svtDistance(2.7, 3000));
		System.out.println(heat(FluidTable.WATER, 4, 78));
		System.out.println(pressureUnderWater(75));
		System.out.println(velocityToHeight(16.67));
		double work = (kineticEnergy(735, 27.78));
		System.out.println(power (work, 4.8));
		System.out.println(); */
		System.out.println (accelerationToDistance(1,10,5));
		
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
	 * @return the value for the pressure on a certain deep in measured in Pascal ((N/m^2) ((kg*m^2)/(m^2*s))
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = fluid.density*g_swe*deep;
		return fluidPressure;
	}
	
	/**
	 * the method calculate the pressure for Water on a certain deep. 
	 * @param deep is the deep for the pressure under water measured in meter
	 * @return the value for the water pressure on a certain deep measured in Pascal ((N/m^2) ((kg*m^2)/(m^2*s)))
	 */
	public static double pressureUnderWater(double deep) {
		double pressureUnderWater = FluidTable.WATER.density*g_swe*deep;
		return pressureUnderWater;	
	}
	
	/**
	 * the method calculate the kinetic energy for a object with mass and velocity
	 * @param mass is the mass for the object measured in kilogram
	 * @param velocity is the velocity for the object measured in meter per second (m/s) 
	 * @return the value for the kinetic energy for a object measured in Joule (((kg*m^2)/s^2) ((Newtonmeter)))
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = (mass* Math.pow(velocity, 2))/2;
		return kineticEnergy;
	}
	
	/**
	 * the method calculate the potential energy for a object with mass and height
	 * @param mass is the mass for the object measured in kilogram
	 * @param height is the height for the object measured in meter
	 * @return the value for the potential energy for a object measured in Joule (((kg*m^2)/s^2) ((Newtonmeter)))
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass*g_swe*height;
		return potentialEnergy;
	}
	
	/**
	 * the method calculate the velocity the object has if you drop it from a certain height
	 * @param height is the height the object is dropped from measured in meter
	 * @return the value of the velocity the object has, measured in meter per seconds (m/s)
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
	 * @param volume is the volume of the fluid we calculate with, measured in cubic centimeter (cm^3) 
	 * @return the mass of the fluid measured in gram
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumeToMass = fluid.density*volume;
		return volumeToMass;
	}
	
	/**
	 * the method calculate the mass of a gas from the gastable
	 * @param gas is the gas from the gastable we calculate the mass on
	 * @param volume is the volume of the gas we calculate with, measured in cubic centimeter (cm^3) 
	 * @return the mass of the gas measured in gram
	 */
	public static double volumeToMass(GasTable gas, double volume){
		double volumeToMass = gas.density*volume;
		return volumeToMass;	
	}
	
	/**
	 * the method calculate the mass of a solid from the solidtable
	 * @param solid is a solid from the solidtable we calculate the mass on
	 * @param volume is the volume o the solid we calculate with, measuerd in cubic centimeter (cm^3) 
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
	 * @return the average speed, measured in meter per seconds (m/s)
	 */
	public static double svtVelocity(double distance, double time) {
		double svtVelocity = distance/time;
		return svtVelocity;
	}
	
	/**
	 * the method calculate the distance with velocity and time 
	 * @param velocity is the how fast it went, measured in meter per seconds (m/s)
	 * @param time is how long it has went, measured in seconds
	 * @return the distance, measured in meter
	 */
	public static double svtDistance(double velocity, double time) {
		double svtDistance = velocity*time;
		return svtDistance;
	}
	
	/**
	 * the method calculate the time with distance and velocity
	 * @param distance is how far it went, measured in meter
	 * @param velocity is how fast it went, measured in meter per seconds (m/s)
	 * @return the time it has went, measured in seconds
	 */
	public static double svtTime(double distance, double velocity){
		double svtTime = distance/velocity;
		return svtTime;
	}
	
	/**
	 * the method calculate work with distance and force
	 * @param force is the force we use measured in Newton (kg*m^2)
	 * @param distance is how far we go, measured in meter
	 * @return the value of work, measured in Newtonmeter or Joule (same thing) ((kg*m^2)/s^2)
	 */
	public static double work(double force, double distance){
		double work = force*distance;
		return work;	
	}
	
	/**
	 * the method calculate the power with work and time
	 * @param work is work we use, measured in Newtonmeter or Joule (same thing) ((kg*m^2)/s^2)
	 * @param time is how long it takes, measured in seconds
	 * @return the value of power, measured in Watt or Joule per second (same thing) ((kg*m^2)/s^3)
	 */
	public static double power(double work, double time){
		double power = work/time;
		return power;
	}
	
	/**
	 * the method calculate the energy it takes to heat a solid from the solidtable with mass and temperature change
	 * @param solid is a randomly chosen solid from the solidtable 
	 * @param mass is the mass of the solid, measured in kilogram
	 * @param deltaT is the temperature change, measured in Kelvin
	 * @return the value of the amount of energy, measured in Joule (((kg*m^2)/s^2) ((Newtonmeter)))
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double heat = solid.heatCapacity*mass*deltaT;
		return heat;
	}
	
	/**
	 * the method calculate the energy it takes to heat a fluid from the fluidtable with mass and temperature change
	 * @param fluid is a randomly chosen fluid from the fluidtable 
	 * @param mass is the mass of the fluid, measured in kilogram
	 * @param deltaT is the temperature change, measured in Kelvin
	 * @return the value of the amount of energy, measured in Joule (((kg*m^2)/s^2) ((Newtonmeter)))
	 */
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		double heat = fluid.heatCapacity*mass*deltaT;
		return heat;	
	}
	
	/**
	 * the method calculate the energy it takes to heat a gas from the gastable with mass and temperature change
	 * @param gas is a randomly chosen gas from the gastable
	 * @param mass is the mass of the fluid, measured in kilogram
	 * @param deltaT is the temperature change, measured in Kelvin
	 * @return the value of the amount of energy, measured in Joule (((kg*m^2)/s^2) ((Newtonmeter)))
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		double heat = gas.heatCapacity*mass*deltaT;
		return heat;	
	}
	
	/**
	 * the method calculate how high something comes when it is thrown straight up (90 grades)
	 * @param velocity is the velocity we throw it with, measured in meter per seconds (m/s)
	 * @return the value of how high it came, measured in meter
	 */
	public static double velocityToHeight(double velocity) {
		double velocityToHeight = Math.pow(velocity, 2)/(2*g_swe);
		return velocityToHeight;
	}
	
	/**
	 * the method calculate how fast something goes with acceleration and time, aside from the initial speed. (initial speed=0)
	 * @param velocity
	 * @param acceleration is how much it accelerates, measured in meter per cubic seconds (m/s^2)
	 * @param time is how long it is, measured in seconds. 
	 * @return the velocity of how fast something has went, measured in meter per seconds (m/s)
	 */
	public static double accelerationToVelocity(double acceleration, double time) {
		double accelerationToVelocity = acceleration*time;
		return accelerationToVelocity;
	}
	
	/**
	 * the method calculate how much something accelerates with time and velocity, aside from initial speed. (initial speed=0)
	 * @param velocity is how fast it goes, measured in meter per seconds
	 * @param time is how long it takes, measured in seconds
	 * @return the value in acceleration, measured in meter per cubic seconds. 
	 */
	public static double velocityToAcceleration(double velocity, double time) {
		double velocityToAcceleration = velocity/time;
		return velocityToAcceleration;
	}
	
	/**
	 * the method calculate the friction with the friction coefficient and normal force, measured in Newton  ((kg.m)/s^2)
	 * @param frictionCoefficient is how much friction it is, has no unit 
	 * @param normalForce is the force that eliminate the gravity force, measured in Newton  ((kg.m)/s^2)
	 * @return the value in friction, measured in Newton  ((kg.m)/s^2)
	 */
	public static double friction(double frictionCoefficient, double normalForce) {
		double friction = frictionCoefficient*normalForce;
		return friction;
	}
	
	/**
	 * the method calculates how much friction something has
	 * @param friction is how much resistance to the friction there is, measured in Newton  ((kg.m)/s^2)
	 * @param normalForce is the force that eliminate the gravity force, measured in Newton ((kg.m)/s^2)
	 * @return how much friction there is, has no unit 
	 */
	public static double frictionCoefficient(double friction, double normalForce) {
		double frictionCoefficient = friction/normalForce;
		return frictionCoefficient;
	}
	
	/**
	 * the method calculates how much acceleration something has with distance and time, aside from initial speed (initial speed=0)
	 * @param distance is how long it has went, measured in meter
	 * @param time, is how long time it has went, measured in seconds
	 * @return the value in acceleration, measured in meter per cubic seconds (m/s*2)
	 */
	public static double distanceToAcceleration(double distance, double time) {
		double distanceToAcceleration = 2*distance/Math.pow(time, 2);
		return distanceToAcceleration;
	}
	
	/**
	 * the method calculates how long something has vent with velocity, acceleration and time
	 * @param velocity is how fast it went, measured in meter per seconds
	 * @param acceleration is how much it has accelerates, measured in meter per cubic seconds (m/s^2)
	 * @param time is how long time it took, measured in seconds
	 * @return the value in distance, measured in meter
	 */
	public static double accelerationToDistance(double velocity, double acceleration, double time) {
		double accelerationToDistance = velocity*time + ((acceleration*Math.pow(time, 2))/2);
		return accelerationToDistance;
	}
	
	/**
	 * the method calculates Hookes law, which is the force it takes to extend and/or compress a spring. 
	 * @param springCoefficient is the coefficient. This is how "hard" it is to extend it. measured in 	Newton per meter ((N/m) ((kg*m)/(m*s))
	 * @param springExtension is the distance it is extend, measured in meter
	 * @return the value in force, measured in Newton ((kg*m)/s)
	 */
	public static double hookesLaw(double springCoefficient, double springExtension) {
		double hookesLaw = springCoefficient*springExtension;
		return hookesLaw;	
	}
	
	/**
	 * the method calculates Hookes law, but with force and the spring coefficient. 
	 * @param force is the amount of force you need to extend the spring, measured in Newton ((kg*m/s)
	 * @param springCoefficient is how hard it is to extend the spring, measured in Newton per meter ((N/m) or (kg*m)/(m*s))
	 * @return
	 */
	public static double forceToSpringExtension(double force, double springCoefficient) {
		double forceToSpringExtension = force/springCoefficient;
		return forceToSpringExtension;
	}

	/**
	 * the method calculates Newtons gravitation law with mass, radius and G
	 * @param mass1 is the mass of the first object (body), measured in kilogram
	 * @param mass2 is the mass of the second object (body), measured in kilogram
	 * @param radius is the distance between the two objects (bodies) centers, measured in meter
	 * @return the value in Force, measured in Newton ((kg*m)/s)
	 */
	public static double gravitationLaw(double mass1, double mass2, double radius) {
		double gravitationLaw = G*((mass1*mass2)/Math.pow(radius, 2));
		return gravitationLaw;
	}
	
	/**
	 * 	the method calculate Newtons gravitation law, but he distance between the two objects. So with force, mass and G
	 * @param mass1 is the mass of the first object (body), measured in kilogram
	 * @param mass2 is the mass of the second object (body) measured in kilogram
	 * @param force is the amount of force there is between the two objects (bodies), measured in Newton ((kg*m)/s)
	 * @return the value in radius (distance between the two objects (bodies) center, measured in meter
	 */
	public static double distanceBetweenBodies (double mass1, double mass2, double force) {
		double distanceBetweenBodies = Math.sqrt((mass1*mass2/(force*G)));
		return distanceBetweenBodies;
	}
}


