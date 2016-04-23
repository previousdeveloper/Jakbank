package lib.model;


public class ExchangeRatesRecord {

    private String sellPrice;
    private String buyPrice;
    private String usdCrossRate;
    private String parity;
    private String currencyCode;
    private String banknoteBuying;
    private String currencyCodeAlpha;
    private String banknoteSelling;
    private String unit;


    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getUsdCrossRate() {
        return usdCrossRate;
    }

    public void setUsdCrossRate(String usdCrossRate) {
        this.usdCrossRate = usdCrossRate;
    }

    public String getParity() {
        return parity;
    }

    public void setParity(String parity) {
        this.parity = parity;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getBanknoteBuying() {
        return banknoteBuying;
    }

    public void setBanknoteBuying(String banknoteBuying) {
        this.banknoteBuying = banknoteBuying;
    }

    public String getCurrencyCodeAlpha() {
        return currencyCodeAlpha;
    }

    public void setCurrencyCodeAlpha(String currencyCodeAlpha) {
        this.currencyCodeAlpha = currencyCodeAlpha;
    }

    public String getBanknoteSelling() {
        return banknoteSelling;
    }

    public void setBanknoteSelling(String banknoteSelling) {
        this.banknoteSelling = banknoteSelling;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
