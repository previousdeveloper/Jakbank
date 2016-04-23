import lib.client.Configuration;
import lib.client.IJAkbankClient;
import lib.client.JAkbankClient;
import lib.request.CreditPaymentRequest;
import lib.request.FindRequest;
import lib.response.CreditInterestRatesRecordReponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String apiKey = "l7xx82e25c04825e48ef92dd6bad53bafbd9";
        String baseUrl = "https://apigate.akbank.com/api/mock";

        Configuration configuration = new Configuration(apiKey, baseUrl);

        configuration.setLogEnabled(true);
        IJAkbankClient client = new JAkbankClient(configuration);

        FindRequest request = new FindRequest();
        request.setLatitude("41.008238");
        request.setLongitude("28.978359");
        request.setRadius("1000");
        request.setCity(null);
        request.setDistrict(null);
        request.setSearchText(null);

        CreditPaymentRequest creditPaymentRequest = new CreditPaymentRequest();
        creditPaymentRequest.setBsmv("0.1234");
        creditPaymentRequest.setExpenseAmount("10");
        creditPaymentRequest.setInterest("1.25");
        creditPaymentRequest.setKkdf("0.1034");
        creditPaymentRequest.setLoanAmount("5000");
        creditPaymentRequest.setLoanStartDate("2015-11-10");
        creditPaymentRequest.setLoanUsingDate("2015-11-10");
        creditPaymentRequest.setTerm("36");

        Call<CreditInterestRatesRecordReponse> t = client.build().creditInterestRates("");

        t.enqueue(new Callback<CreditInterestRatesRecordReponse>() {
            @Override
            public void onResponse(Response<CreditInterestRatesRecordReponse> response) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

    }
}
