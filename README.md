# Jakbank
Java client library for Akbank Api

# Implementation


## Configuration
You need to get apiKey from [here]('https://apiportal.akbank.com/')
```Java
String apiKey = "";
String baseUrl = "https://apigate.akbank.com/api/mock";

Configuration config = new Configuration(apiKey,baseUrl);
```

## Client
To create a new JAkbankClient
```Java
IJAkbankClient client = new JAkbankClient(config);

//Call Sync
Response<CreditInterestRatesRecordReponse> result = client.build().creditInterestRates("I").execute();

string applicationEndDate =result.body().getData().getApplicationEndDate();
int responseCode =result.code();

//Call Async
Call<CreditInterestRatesRecordReponse> result = client.build().creditInterestRates("t");
        result.enqueue(new Callback<CreditInterestRatesRecordReponse>() {
            @Override
            public void onResponse(Response<CreditInterestRatesRecordReponse> response) { }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });
```


## Contributing
Issues, pull requests and questions are welcomed.

### Pull Requests
 - Fork the repository
 - Make changes
 - Ensure all tests pass and 100% code coverage is achieved
 - Raise pull request