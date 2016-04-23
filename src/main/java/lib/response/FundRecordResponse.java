package lib.response;

import lib.model.FundRecord;

import java.util.List;


public class FundRecordResponse extends BaseResponse {

    private List<FundRecord> fundRecords;

    public List<FundRecord> getFundRecords() {
        return fundRecords;
    }

    public void setFundRecords(List<FundRecord> fundRecords) {
        this.fundRecords = fundRecords;
    }
}
