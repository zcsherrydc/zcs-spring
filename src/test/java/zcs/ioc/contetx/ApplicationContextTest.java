package zcs.ioc.contetx;

import org.junit.Test;
import zcs.context.ApplicationContext;
import zcs.context.ClassPathXmlApplicationContext;
import zcs.ioc.HelloWorldService;

public class ApplicationContextTest {
    @Test
    public void test() throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
