package com.webproject;

import com.webproject.config.SpringConfig;
import com.webproject.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBean bean = context.getBean(TestBean.class);
        String name = bean.getName();
        System.out.println( "Hello World!"+name );

    }
}
