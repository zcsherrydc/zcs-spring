package zcs.ioc;

import zcs.beans.BeanDefinition;
import zcs.beans.factory.AbstractBeanFactory;
import zcs.beans.factory.AutowireCapableBeanFactory;
import org.junit.Test;
import zcs.beans.io.ResourceLoader;
import zcs.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

public class BeanFactoryTest {
    @Test
    public void test() throws Exception {
//        读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

//       初始化BeanFactory并注册
        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> stringBeanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(stringBeanDefinitionEntry.getKey(), stringBeanDefinitionEntry.getValue());
        }

//        获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
