package lib.model;


public class FundRecord {

    private String fundCode;
    private String fundShortName;
    private String fundName;
    private String fundType;
    private String buyPrice;
    private String sellPrice;
    private String fundBalance;
    private String fundTypeDescription;

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundShortName() {
        return fundShortName;
    }

    public void setFundShortName(String fundShortName) {
        this.fundShortName = fundShortName;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getFundBalance() {
        return fundBalance;
    }

    public void setFundBalance(String fundBalance) {
        this.fundBalance = fundBalance;
    }

    public String getFundTypeDescription() {
        return fundTypeDescription;
    }

    public void setFundTypeDescription(String fundTypeDescription) {
        this.fundTypeDescription = fundTypeDescription;
    }
}
