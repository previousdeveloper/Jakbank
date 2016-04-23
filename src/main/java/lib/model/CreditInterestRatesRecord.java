package lib.model;


import java.util.List;

public class CreditInterestRatesRecord {

    private String applicationStartDate;
    private String applicationEndDate;
    private String minTerm;
    private String maxTerm;
    private String minAmount;
    private String maxAmount;
    private String taxRate;
    private String fundRate;
    private String expenseAmount;
    private String interestTerm;
    private String interestCount;
    private String creditAmount;
    private List<InterestRecord> interestArrayList;


    public String getApplicationStartDate() {
        return applicationStartDate;
    }

    public void setApplicationStartDate(String applicationStartDate) {
        this.applicationStartDate = applicationStartDate;
    }

    public String getApplicationEndDate() {
        return applicationEndDate;
    }

    public void setApplicationEndDate(String applicationEndDate) {
        this.applicationEndDate = applicationEndDate;
    }

    public String getMinTerm() {
        return minTerm;
    }

    public void setMinTerm(String minTerm) {
        this.minTerm = minTerm;
    }

    public String getMaxTerm() {
        return maxTerm;
    }

    public void setMaxTerm(String maxTerm) {
        this.maxTerm = maxTerm;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getFundRate() {
        return fundRate;
    }

    public void setFundRate(String fundRate) {
        this.fundRate = fundRate;
    }

    public String getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getInterestTerm() {
        return interestTerm;
    }

    public void setInterestTerm(String interestTerm) {
        this.interestTerm = interestTerm;
    }

    public String getInterestCount() {
        return interestCount;
    }

    public void setInterestCount(String interestCount) {
        this.interestCount = interestCount;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public List<InterestRecord> getInterestArrayList() {
        return interestArrayList;
    }

    public void setInterestArrayList(List<InterestRecord> interestArrayList) {
        this.interestArrayList = interestArrayList;
    }
}
