package entities;

public class Company extends TaxPayer {
    
    private Integer numberOfEmployees;


    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees <= 10) {
            return (super.getAnuallncome() * 0.16);
        }
        else return (super.getAnuallncome() * 0.14);
    }

}