package zcs.beans.factory;


import zcs.beans.BeanDefinition;

/**
 * Bean工厂
 */
public interface BeanFactory {
    //    获取bean实例
    public Object getBean(String name) throws Exception;

}
