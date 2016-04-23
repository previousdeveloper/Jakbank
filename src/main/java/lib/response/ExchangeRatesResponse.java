package lib.response;

import lib.model.ExchangeRatesRecord;


public class ExchangeRatesResponse extends BaseResponse {

    private ExchangeRatesRecord data;

    public ExchangeRatesRecord getData() {
        return data;
    }

    public void setData(ExchangeRatesRecord data) {
        this.data = data;
    }
}
