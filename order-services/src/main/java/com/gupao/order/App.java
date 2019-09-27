package com.gupao.order;

import com.gupao.dubbo.PayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
        PayService payService = (PayService)context.getBean("payService");
        String money = payService.pay("1 yuan");
        System.out.println( money );
    }
}
