package lib.client;


import lib.service.ApiService;
import lib.service.IAkbankService;

public class JAkbankClient implements IJAkbankClient {

    private Configuration configuration;

    public JAkbankClient(Configuration configuration) {

        this.configuration = configuration;
    }

    public IAkbankService build() {

        ApiService apiService = new ApiService(configuration);

        return apiService.create();
    }
}
