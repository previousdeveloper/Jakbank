package lib.response;


public class StockDataResponse extends BaseResponse{

    private double average1;
    private double average2;
    private double last;
    private double previousClose;
    private double change;
    private double bestBuy;
    private double bestSell;
    private double volume1;
    private double amount1;
    private double volume2;
    private double amount2;
    private double hour;
    private String max;
    private String groupSymbol;
    private String stockStatus;
    private String symbol;
    private String name;

    public double getAverage1() {
        return average1;
    }

    public void setAverage1(double average1) {
        this.average1 = average1;
    }

    public double getAverage2() {
        return average2;
    }

    public void setAverage2(double average2) {
        this.average2 = average2;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(double previousClose) {
        this.previousClose = previousClose;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getBestBuy() {
        return bestBuy;
    }

    public void setBestBuy(double bestBuy) {
        this.bestBuy = bestBuy;
    }

    public double getBestSell() {
        return bestSell;
    }

    public void setBestSell(double bestSell) {
        this.bestSell = bestSell;
    }

    public double getVolume1() {
        return volume1;
    }

    public void setVolume1(double volume1) {
        this.volume1 = volume1;
    }

    public double getAmount1() {
        return amount1;
    }

    public void setAmount1(double amount1) {
        this.amount1 = amount1;
    }

    public double getVolume2() {
        return volume2;
    }

    public void setVolume2(double volume2) {
        this.volume2 = volume2;
    }

    public double getAmount2() {
        return amount2;
    }

    public void setAmount2(double amount2) {
        this.amount2 = amount2;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getGroupSymbol() {
        return groupSymbol;
    }

    public void setGroupSymbol(String groupSymbol) {
        this.groupSymbol = groupSymbol;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
