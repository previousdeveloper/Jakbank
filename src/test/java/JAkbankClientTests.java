import lib.client.Configuration;
import lib.client.IJAkbankClient;
import lib.client.JAkbankClient;
import lib.request.CreditPaymentRequest;
import lib.request.FindRequest;
import lib.response.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class JAkbankClientTests {

    private Configuration config = null;
    private IJAkbankClient client = null;

    @Before
    public void setUp() throws Exception {
        String apiKey = "l7xx82e25c04825e48ef92dd6bad53bafbd9";
        String baseUrl = "https://apigate.akbank.com/api/mock";

        config = new Configuration(apiKey, baseUrl);
        config.setLogEnabled(true);
        client = new JAkbankClient(config);


    }

    @Test
    public void creditInterestRates_Result_Should_Not_Be_Null() throws IOException {

        Response<CreditInterestRatesRecordReponse> result = client.build().creditInterestRates("I").execute();
        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void exchangeRates_Result_Should_Not_Be_Null() throws IOException {

        Response<ExchangeRatesResponse> result = client.build().exchangeRates().execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void exchangeRatesWithDate_Result_Should_Not_Be_Null() throws IOException {

        Response<ExchangeRatesResponse> result = client.build().exchangeRates("2015-11-10").execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void exchangeRatesWithDateAndCurrency_Result_Should_Not_Be_Null() throws IOException {

        Response<ExchangeRatesResponse> result = client.build().exchangeRates("001", "2015-11-10").execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void exchangeRatesWithCurrency_Result_Should_Not_Be_Null() throws IOException {

        Response<ExchangeRatesResponse> result = client.build().exchangeRatesWithCurrency("001").execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void findAtm_Result_Should_Not_Be_Null() throws IOException {

        FindRequest request = new FindRequest();

        request.setLatitude("41.008238");
        request.setLongitude("28.978359");
        request.setRadius("1000");
        request.setCity(null);
        request.setDistrict(null);
        request.setSearchText(null);

        Response<AtmRecordResponse> result = client.build().findATM(request).execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void findBranch_Result_Should_Not_Be_Null() throws IOException {

        FindRequest request = new FindRequest();

        request.setLatitude("41.008238");
        request.setLongitude("28.978359");
        request.setRadius("1000");
        request.setCity(null);
        request.setDistrict(null);
        request.setSearchText(null);

        Response<BranchRecordResponse> result = client.build().findBranch(request).execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    @Ignore
    //Fix
    public void fundPrices_Result_Should_Not_Be_Null() throws IOException {


        Response<FundPricesRecordResponse> result = client.build().fundPrices("A").execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void stockValue_Result_Should_Not_Be_Null() throws IOException {


        Response<StockDataResponse> result = client.build().stockValue("AKBNK").execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }

    @Test
    public void creditPaymentPlan_Result_Should_Not_Be_Null() throws IOException {

        CreditPaymentRequest creditPaymentRequest = new CreditPaymentRequest();
        creditPaymentRequest.setBsmv("0.1234");
        creditPaymentRequest.setExpenseAmount("10");
        creditPaymentRequest.setInterest("1.25");
        creditPaymentRequest.setKkdf("0.1034");
        creditPaymentRequest.setLoanAmount("5000");
        creditPaymentRequest.setLoanStartDate("2015-11-10");
        creditPaymentRequest.setLoanUsingDate("2015-11-10");
        creditPaymentRequest.setTerm("36");

        Response<CreditPaymentResponse> result = client.build().creditPaymentPlan(creditPaymentRequest).execute();

        assertThat(result.body()).isNotNull();
        assertThat(result.code()).isEqualTo(200);
        assertThat(result.isSuccess()).isTrue();
    }


    @Test(expected = IllegalArgumentException.class)
    public void configuration_value_should_not_be_empty() {
        Configuration configuration = new Configuration("", "");

        configuration.setLogEnabled(true);
    }

    @Test
    public void callAsync() {

        Call<CreditInterestRatesRecordReponse> result = client.build().creditInterestRates("I");
        result.enqueue(new Callback<CreditInterestRatesRecordReponse>() {
            @Override
            public void onResponse(Response<CreditInterestRatesRecordReponse> response) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }

}