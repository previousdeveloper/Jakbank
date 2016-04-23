package lib.response;

import lib.model.CreditInterestRatesRecord;


public class CreditInterestRatesRecordReponse extends BaseResponse {

    private CreditInterestRatesRecord data;

    public CreditInterestRatesRecord getData() {
        return data;
    }

    public void setData(CreditInterestRatesRecord data) {
        this.data = data;
    }
}
