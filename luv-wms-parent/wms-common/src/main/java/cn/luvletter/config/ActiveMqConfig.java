package cn.luvletter.config;

import cn.luvletter.constant.WMSConstant;
import org.apache.activemq.camel.CamelConnectionFactory;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

/**
 * @author Zephyr
 * @Description:
 * @Date 2018/4/25
 */
public class ActiveMqConfig {
    @Bean
    public ConnectionFactory connectionFactory (){
        ActiveMQConnectionFactory connectionFactory = new CamelConnectionFactory();
        connectionFactory.setBrokerURL(WMSConstant.MQURL);
        return connectionFactory;
    }
    @Bean
    public JmsOperations jmsOperations (ConnectionFactory connectionFactory){
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(connectionFactory);
        jmsTemplate.setDefaultDestinationName("luv_order");
        return jmsTemplate;
    }
}
