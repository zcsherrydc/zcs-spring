package zcs.ioc;

import com.sun.javafx.image.IntPixelGetter;
import zcs.BeanDefinition;
import zcs.PropertyValue;
import zcs.PropertyValues;
import zcs.factory.AutowireCapable;
import zcs.factory.BeanFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BeanFactoryTest {
    @Test
    public void test() throws Exception{
//       1. 初始化
        BeanFactory beanFactory = new AutowireCapable();

//       2. BeanDefinition定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("zcs.ioc.HelloWorldService");

//        3. 设置属性
        PropertyValues propertyValues=new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text","hello world"));
        beanDefinition.setPropertyValues(propertyValues);

//        4. 生成bean
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

//        获取bean
        HelloWorldService helloWorldService= (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
