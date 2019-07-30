package cn.boy2b.module;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Iterator;
import java.util.Map;

/**
 *@desc BaseControllerTest
 *@author zhouwei
 *@date 2019/7/30 13:28
 */
public class BaseControllerTest extends BaseTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    protected MockMvc mockMvc;

    /**
     * 初始化SpringmvcController类测试环境
     */
    @Before
    public void setup(){
        //加载web容器上下文
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    protected void doGet(String url, Map<String, String> params) {
        try {
            MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get(url);
            if (params != null) {
                Iterator<Map.Entry<String, String>> it = params.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> entry = it.next();
                    builder.param(entry.getKey(), entry.getValue());
                }
            }
            ResultActions resultActions = mockMvc.perform(builder);
            MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("url:" + url + ", params:" + JSON.toJSONString(params));
            System.out.println("get执行结果：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(String url, Object params) {
        try {
            MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post(url);
            builder.contentType(MediaType.APPLICATION_JSON_UTF8);
            if (params != null) {
                builder.content(JSON.toJSONString(params));
            }
            ResultActions resultActions = mockMvc.perform(builder);
            MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("url:" + url + ", params:" + JSON.toJSONString(params));
            System.out.println("post执行结果：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
