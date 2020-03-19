package com.mpush.mpns.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mpush.api.push.PushContext;
import com.mpush.client.push.PushClient;

public class SpringTest {

    public static void main(String[] args) {

        ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:/bean/biz-manager.xml");
        final PushClient bean = ac.getBean(PushClient.class);
        bean.send(new PushContext("hello world".getBytes())
                .setUserId("user-0")
                .setCallback(null)
        );

    }

}
