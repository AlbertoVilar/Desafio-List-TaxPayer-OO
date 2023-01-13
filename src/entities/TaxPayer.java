package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double serviceIncome;
	private Double capitalIncome;
	private Double healthSpanding;
	private Double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpanding,
			Double educationSpending) {

		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpanding = healthSpanding;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public Double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(Double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpanding() {
		return healthSpanding;
	}

	public void setHealthSpanding(Double healthSpanding) {
		this.healthSpanding = healthSpanding;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	

	// Metotos
	public Double salaryTax() {
		Double taxSalary = 0.0;
		Double salary = 0.0;
		
		salary = salaryIncome / 12;
		
		taxSalary *= 12;
		if (salary < 3000.0) {
			taxSalary = 0.0;

		} else if (salary < 5000) {
			taxSalary = 10.0;

		} else {

			taxSalary = 20.0;
		}
		return salaryIncome / 100 * taxSalary;
		
		

	}

	public Double serviceTax() {
	
		return  serviceIncome / 100 * 15;
		

	}

	public Double capitalTax() {
	
		return capitalIncome / 100 * 20;

	}

	public Double grossTax() {
		Double grossTaxt = salaryTax() + serviceTax() + capitalTax();
		return grossTaxt;

	}

	public Double taxRebate() {
		Double rebate = healthSpanding + educationSpending;
		Double taxRebate = 30.0 / 100.0 * grossTax();
		if (rebate < taxRebate) {
			return rebate;

		} else {
			return taxRebate;
		}

	}

	public Double netTax() {
		return grossTax() - taxRebate();

	}

	
	public String toString() {
		return "Imposto bruto total: R$ " 
				+ String.format("%.2f%n", grossTax())
				+ "Abatimento: R$ " + String.format("%.2f5%n", taxRebate()) 
				+ "Imposto devido: R$ " + String.format("%.2f%n", netTax());
	}
	
	

}
