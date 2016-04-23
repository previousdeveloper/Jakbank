package lib.service;


import lib.client.Configuration;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

import java.io.IOException;

public class ApiService implements IApiService {

    private Configuration configuration;

    public ApiService(Configuration configuration) {

        this.configuration = configuration;
    }

    public IAkbankService create() {


        Interceptor interceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request()
                        .newBuilder()
                        .addHeader("Apikey", configuration.getApiKey())
                        .addHeader("Content-Type", "application/json")
                        .build();
                return chain.proceed(newRequest);
            }


        };

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(interceptor);

        if (configuration.isLogEnabled()) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.interceptors().add(logging);
        }

        OkHttpClient client = builder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(configuration.getBaseUrl())
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(IAkbankService.class);
    }
}




