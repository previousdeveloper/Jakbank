package lib.model;


import java.util.List;

public class CreditPaymentList {

    private List<CreditPaymentRecord> paymentPlanList;

    public List<CreditPaymentRecord> getPaymentPlanList() {
        return paymentPlanList;
    }

    public void setPaymentPlanList(List<CreditPaymentRecord> paymentPlanList) {
        this.paymentPlanList = paymentPlanList;
    }
}
