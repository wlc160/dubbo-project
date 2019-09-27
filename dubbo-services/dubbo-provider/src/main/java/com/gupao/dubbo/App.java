package com.gupao.dubbo;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Main.main(args);
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF.spring/application.xml"});
        context.start();
        //进程不停止
        System.in.read();*/
    }
}
