package lib.response;


import lib.model.AtmRecord;
import lib.response.BaseResponse;

import java.util.List;

public class AtmRecordResponse extends BaseResponse{

    private List<AtmRecord> data;

    public List<AtmRecord> getData() {
        return data;
    }

    public void setData(List<AtmRecord> data) {
        this.data = data;
    }
}
