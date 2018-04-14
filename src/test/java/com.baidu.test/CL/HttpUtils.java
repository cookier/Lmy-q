package com.baidu.test.CL;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpUtils {

	public static PoolingHttpClientConnectionManager poolConnManager;

	static {
		try {
			// 需要通过以下代码声明对https连接支持
			SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy()).build();
			HostnameVerifier hostnameVerifier = SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, hostnameVerifier);
			Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", sslsf).build();
			// 初始化连接管理器
			if (poolConnManager == null) {
				poolConnManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
				// Increase max total connection to 200
				poolConnManager.setMaxTotal(200);
				// Increase default max connection per route to 20
				poolConnManager.setDefaultMaxPerRoute(20);
			}
		} catch (KeyManagementException e) {
		} catch (NoSuchAlgorithmException e) {
		} catch (KeyStoreException e) {
		}
	}

	/**
	 * 获得客户端连接
	 * 
	 * @return
	 */
	public CloseableHttpClient getHttpclientConnection() {
		CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(poolConnManager).build();
		return httpClient;
	}

	/**
	 * 关闭客户端连接
	 * 
	 * @param closeableHttpClient
	 */
	public void closeHttpclientConnection(CloseableHttpClient closeableHttpClient) {
		if (closeableHttpClient != null)
			try {
				closeableHttpClient.close();
			} catch (IOException e) {
			}
	}

	/**
	 * 关闭响应
	 * 
	 * @param closeableHttpResponse
	 */
	public void closeResonseConnection(CloseableHttpResponse closeableHttpResponse) {
		if (closeableHttpResponse != null) {
			try {
				closeableHttpResponse.close();
			} catch (IOException e) {
			}
		}
	}

	/**
	 * 模拟get请求
	 * 
	 * @param url
	 * @param params
	 * @return
	 */
	public String invorkHttpClientGetRequest(String url, Map params) {
		String responseContent = null;
		CloseableHttpClient httpClient = this.getHttpclientConnection();
		CloseableHttpResponse response = null;
		HttpGet httpGet = new HttpGet();

		RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(10000).setConnectTimeout(10000)
				.setSocketTimeout(10000).build();
		try {
			StringBuffer paramStr = new StringBuffer();
			if (params != null) {
				for (Object key : params.keySet()) {
					paramStr.append(key.toString()).append("=")
							.append(URLEncoder.encode(params.get(key).toString(), "utf-8")).append("&");
				}
			}
			HttpContext httpContext = new BasicHttpContext();
			URI uri = new URI(url + (StringUtils.isNotBlank(paramStr) ? "?"+paramStr : ""));
			httpGet.setURI(uri);
			httpGet.setConfig(config);
			response = httpClient.execute(httpGet, httpContext);
			HttpEntity entity = response.getEntity();
			responseContent = EntityUtils.toString(entity,"utf-8");
			EntityUtils.consume(entity);
		} catch (ClientProtocolException e) {
		} catch (IOException e) {
		} finally {
			httpGet.releaseConnection();
			return responseContent;
		}
	}

	/**
	 * 模拟post请求
	 * 
	 * @param url
	 * @param params
	 * @return
	 */
	public String invorkHttpClientPostRequest(String url, Map params) {
		String responseContent = null;
		CloseableHttpClient httpClient = this.getHttpclientConnection();
		CloseableHttpResponse response = null;
		HttpPost httpPost = new HttpPost(url);
		RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(10000).setConnectTimeout(10000)
				.setSocketTimeout(10000).build();

		try {
			List formparams = new ArrayList();
			if (params != null) {
				for (Object key : params.keySet()) {
					formparams.add(new BasicNameValuePair(key.toString(), params.get(key).toString()));
				}
			}
			httpPost.setEntity(new UrlEncodedFormEntity(formparams, "UTF-8"));
			httpPost.setConfig(config);
			response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			responseContent = EntityUtils.toString(entity,"UTF-8");
			EntityUtils.consume(entity);
		} catch (ClientProtocolException e) {
		} catch (IOException e) {
		} finally {
			httpPost.releaseConnection();
			return responseContent;
		}
	}

	public static void main(String[] args) {
		HttpUtils h = new HttpUtils();
		String url = "https://desc.alicdn.com/i7/430/980/43798770630/TB1H4VEKFXXXXXLXXXX8qtpFXlX.desc%7Cvar%5Edesc%3Bsign%5E73924a9a15bf37d8e794a88a4db9d5b1%3Blang%5Egbk%3Bt%5E1447834495";
		String html = h.invorkHttpClientGetRequest(url, null);
		System.out.println(html);
	}

}
