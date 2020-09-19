package EnglishStudy;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ClientTest {
	public static void main(String[] args) {
		System.out.println("123");
		
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		
		HttpGet httpGet = new HttpGet("http://fanyi.youdao.com/translate?&doctype=json&type=AUTO&i=%E8%8B%B9%E6%9E%9C");
		
		CloseableHttpResponse resp = null;
		
		try {
			resp = httpClient.execute(httpGet);
			HttpEntity respEntity = resp.getEntity();
			
			if (respEntity != null) {
				System.out.println("响应内容长度为:" + respEntity.getContentLength());
				System.out.println("响应内容为:" + EntityUtils.toString(respEntity));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}finally {
			try {
				// 释放资源
				if (httpClient != null) {
					httpClient.close();
				}
				if (resp != null) {
					resp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
