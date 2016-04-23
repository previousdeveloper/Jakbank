package lib.response;


import lib.model.BranchRecordList;

public class BranchRecordResponse extends BaseResponse{
    private BranchRecordList data;

    public BranchRecordList getData() {
        return data;
    }

    public void setData(BranchRecordList data) {
        this.data = data;
    }
}
