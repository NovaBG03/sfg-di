package com.example.sfgdi.config;

import com.example.sfgdi.examplebeans.FakeDataSource;
import com.example.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfig {

    @Value("${com.username}")
    private String username;

    @Value("${com.password}")
    private String password;

    @Value("${com.dbUrl}")
    private String url;

    @Value("${com.jms.username}")
    private String jmsUsername;

    @Value("${com.jms.password}")
    private String jmsPassword;

    @Value("${com.jms.url}")
    private String jmsUrl;

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }
}