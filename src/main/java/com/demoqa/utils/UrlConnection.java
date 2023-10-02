package com.demoqa.utils;

import java.io.IOException;
import java.net.*;

public class UrlConnection {

    public static int getResponseCode(String url) {
        HttpURLConnection httpURLConnection = null;
        try {
            URI uri = new URI(url);
            URL link = URL.of(uri, null);
            httpURLConnection= (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

            return httpURLConnection.getResponseCode();

        } catch (MalformedURLException ignored) {

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

}
