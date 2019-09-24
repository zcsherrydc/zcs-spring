package zcs.ioc;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Bean工厂
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

//    获取bean实例
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

//     注册bean实例
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
