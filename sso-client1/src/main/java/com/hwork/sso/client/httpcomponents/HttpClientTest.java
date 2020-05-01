package com.hwork.sso.client.httpcomponents;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author yangs
 * @Date 2020-4-30 11:34
 */
@Slf4j
public class HttpClientTest {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(
                "http://www.mockbin.org");

        CloseableHttpResponse response = httpClient.execute(httpget);
        HttpEntity entity = null;
        BufferedHttpEntity bufferedHttpEntity = null;
        OutputStream outputStream = new FileOutputStream("d:/test.txt");
        OutputStream outputStream2 = new FileOutputStream("d:/test2.txt");
        try {
            entity = response.getEntity();
            bufferedHttpEntity = new BufferedHttpEntity(entity);
            bufferedHttpEntity.writeTo(outputStream);

            log.info("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[");
            bufferedHttpEntity.writeTo(outputStream2);
            //InputStream is1=bufferedHttpEntity.getContent();
            log.info("-===================================================================-");
            //InputStream is2=bufferedHttpEntity.getContent();
        }finally {
            response.close();
        }
    }
}
