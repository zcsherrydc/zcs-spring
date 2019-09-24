package zcs.ioc;

import zcs.BeanDefinition;
import zcs.factory.AutowireCapable;
import zcs.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void test() {
//       1. 初始化
        BeanFactory beanFactory = new AutowireCapable();

//       2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
//        通过反射创建
        beanDefinition.setBeanClassName("zcs.ioc.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

//        获取bean
        HelloWorldService helloWorldService= (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
