package Welcome;
public class Loan {
    private double annualInterestRate;
    private double amount;
    private int numberofYears;
    private java.util.Date loanDate=new java.util.Date();
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate=annualInterestRate;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount=amount;
    }
    public int getNumberofYears() {
        return numberofYears;
    }
    public void setNumberofYears(int numberofYears) {
        this.numberofYears=numberofYears;
    }
    public java.util.Date getLoanDate() {
        return loanDate;
    }
    public double getMonthlyPayment() {
        double monthlyInterestRate=annualInterestRate/1200;
        double monthlyPayment=amount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberofYears*12)));
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberofYears * 12;
        return totalPayment;
    }
}
