package ioc;

import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void test() {
//        初始化
        BeanFactory beanFactory = new BeanFactory();

//        注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

//        获取bean
        HelloWorldService helloWorldService= (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}