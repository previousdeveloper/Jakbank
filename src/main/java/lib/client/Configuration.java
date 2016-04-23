package lib.client;


public class Configuration {

    private String apiKey;
    private String baseUrl;
    private boolean logEnabled;

    public Configuration(String apiKey, String baseUrl) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;

        if (this.apiKey.isEmpty() || this.baseUrl.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (!this.baseUrl.endsWith("/")) {
            this.baseUrl = this.baseUrl + "/";
        }
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public boolean isLogEnabled() {
        return logEnabled;
    }

    public void setLogEnabled(boolean logEnabled) {
        this.logEnabled = logEnabled;
    }
}
