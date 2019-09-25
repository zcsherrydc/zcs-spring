package zcs.ioc;

import com.sun.javafx.image.IntPixelGetter;
import zcs.BeanDefinition;
import zcs.PropertyValue;
import zcs.PropertyValues;
import zcs.factory.AutowireCapable;
import zcs.factory.BeanFactory;
import org.junit.Test;
import zcs.io.ResourceLoader;
import zcs.xml.XmlBeanDefinitionReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BeanFactoryTest {
    @Test
    public void test() throws Exception{
//        读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader=new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

//       初始化BeanFactory并注册
        BeanFactory beanFactory = new AutowireCapable();
        for (Map.Entry<String, BeanDefinition> stringBeanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(stringBeanDefinitionEntry.getKey(),stringBeanDefinitionEntry.getValue());
        }

//        获取bean
        HelloWorldService helloWorldService= (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
