package entities;

public abstract class TaxPayer {
    
    private String name;
    private Double anualIncome;


    public TaxPayer() {
    }

    public TaxPayer(String name, Double anuallncome) {
        this.name = name;
        this.anualIncome = anuallncome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnuallncome() {
        return this.anualIncome;
    }

    public void setAnuallncome(Double anuallncome) {
        this.anualIncome = anuallncome;
    }

    public abstract Double tax();
}
