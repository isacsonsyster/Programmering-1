package enums;

public enum SolidTable {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	DIAMOND(3, 0.51, 3600, 17000),
	SILICON(2.3, 0.71, 1410, 165),
	NAPHTHALENE(1.15, 1.3, 80, 150),
	;

	public double density;
	public double heatCapacity;
	public double meltPoint;
	public double meltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}

	
}