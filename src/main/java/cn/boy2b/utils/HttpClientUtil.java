package cn.boy2b.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author zhouwei
 * @date 2019-6-17 11:04
 */
public class HttpClientUtil {

    public static String post(String url, Object params) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(180 * 1000)
                .setConnectionRequestTimeout(180 * 1000)
                .setSocketTimeout(180 * 1000)
                .setRedirectsEnabled(true)
                .build();
        httpPost.setConfig(config);
        httpPost.setHeader("Content-Type", "application/json");
        String rst = null;
        try {
            String jsonParam = JSONObject.toJSONString(params);
            ContentType charset = ContentType.create("application/json", "UTF-8");
            httpPost.setEntity(new StringEntity(jsonParam, charset));
            System.out.println("请求的参数：" + EntityUtils.toString(httpPost.getEntity()));
            HttpResponse response = httpClient.execute(httpPost);
            if (response == null) {
                System.out.println("请求响应的结果：为空");
            }
            else {
                System.out.println("请求响应的结果：" + JSONObject.toJSONString(response));
                rst = EntityUtils.toString(response.getEntity());
            }
//            if (response != null && response.getStatusLine().getStatusCode() == 200) {
//
//            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return rst;
    }

}
