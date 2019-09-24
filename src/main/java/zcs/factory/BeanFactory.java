package zcs.factory;


import zcs.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *  Bean工厂
 */
public interface BeanFactory {
//    获取bean实例
    public Object getBean(String name);

//     注册bean实例
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) throws Exception;
}
