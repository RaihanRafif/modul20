package api;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class APIClient {
    private String baseUrl = "https://reqres.in/";

    public int sendValidRequest() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(baseUrl + "/endpoint");
        CloseableHttpResponse response = httpClient.execute(request);

        int statusCode = response.getStatusLine().getStatusCode();
        String responseBody = EntityUtils.toString(response.getEntity());

        httpClient.close();
        return statusCode;
    }

    public int sendInvalidRequest() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(baseUrl + "/invalid-endpoint");
        CloseableHttpResponse response = httpClient.execute(request);

        int statusCode = response.getStatusLine().getStatusCode();
        String responseBody = EntityUtils.toString(response.getEntity());

        httpClient.close();
        return statusCode;
    }
}
