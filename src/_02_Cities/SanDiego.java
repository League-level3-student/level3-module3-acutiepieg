package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes;
		taxes = (population * growthRate) + 1000000;
		return taxes;
	}
}
