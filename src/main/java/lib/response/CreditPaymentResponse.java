package lib.response;

import lib.model.CreditPaymentList;


public class CreditPaymentResponse extends BaseResponse {

    private CreditPaymentList data;

    public CreditPaymentList getData() {
        return data;
    }

    public void setData(CreditPaymentList data) {
        this.data = data;
    }
}
