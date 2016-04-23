package lib.request;


public class CreditPaymentRequest {

    private String bsmv;
    private String interest;
    private String kkdf;
    private String loanStartDate;
    private String loanUsingDate;
    private String loanAmount;
    private String expenseAmount;
    private String term;

    public String getBsmv() {
        return bsmv;
    }

    public void setBsmv(String bsmv) {
        this.bsmv = bsmv;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getKkdf() {
        return kkdf;
    }

    public void setKkdf(String kkdf) {
        this.kkdf = kkdf;
    }

    public String getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(String loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public String getLoanUsingDate() {
        return loanUsingDate;
    }

    public void setLoanUsingDate(String loanUsingDate) {
        this.loanUsingDate = loanUsingDate;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
