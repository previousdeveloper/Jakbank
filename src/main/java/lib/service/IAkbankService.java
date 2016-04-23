package lib.service;

import lib.request.CreditPaymentRequest;
import lib.request.FindRequest;
import lib.response.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface IAkbankService {

    @GET("exchangeRatesApi")
    Call<ExchangeRatesResponse> exchangeRates();

    @GET("exchangeRatesApi")
    Call<ExchangeRatesResponse> exchangeRates(@Query("date") String date);

    @GET("exchangeRatesApi/{currencyCode}")
    Call<ExchangeRatesResponse> exchangeRatesWithCurrency(@Path("currencyCode") String currencyCode);

    @GET("exchangeRatesApi/{currencyCode}")
    Call<ExchangeRatesResponse> exchangeRates(@Path("currencyCode") String currencyCode, @Query("date") String date);

    @GET("stockValues")
    Call<StockDataResponse> stockValue(@Query("symbol") String symbol);

    @GET("creditInterestRates")
    Call<CreditInterestRatesRecordReponse> creditInterestRates(@Query("creditType") String creditType);

    @GET("fundPrices")
    Call<FundPricesRecordResponse> fundPrices(@Query("fundType") String fundType);

    @POST("findBranch")
    Call<BranchRecordResponse> findBranch(@Body FindRequest request);

    @POST("findATM")
    Call<AtmRecordResponse> findATM(@Body FindRequest request);

    @POST("creditPaymentPlan")
    Call<CreditPaymentResponse> creditPaymentPlan(@Body CreditPaymentRequest request);
}
