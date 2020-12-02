package entities;

public class Individual extends TaxPayer {
    
    private Double healthExpenditures;


    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return this.healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        
        if (super.getAnuallncome() < 20000.00) {
            return (super.getAnuallncome() * 0.15 - healthExpenditures * 0.50);
        }
        else return (super.getAnuallncome() * 0.25 - healthExpenditures * 0.50);
    }

}
