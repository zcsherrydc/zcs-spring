package zcs.beans;

public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
