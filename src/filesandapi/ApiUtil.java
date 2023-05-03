package filesandapi;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiUtil {

    HttpClient httpClient;

    public ApiUtil() {

    }

    public ApiUtil(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void callGet(String uri) throws URISyntaxException, IOException, InterruptedException {
        System.out.println(httpClient.send(HttpRequest.newBuilder().GET().uri(new URI(uri)).build(), HttpResponse.BodyHandlers.discarding()));
    }

}
