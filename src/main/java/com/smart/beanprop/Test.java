//package com.smart.beanprop;
//
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//
///**
// * @author niuhaijun
// * @date 2018/8/1 19:43
// */
//public class Test {
//
//  public void refresh() {
//    // Tell the subclass to refresh the internal bean factory.//1 初始化BeanFactory
//    ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();
//    // Invoke factory processors registered as beans in the context.//2 调用Bean工厂后处理器
//    invokeBeanFactoryPostProcessors(beanFactory);
//    // Register bean processors that intercept bean creation.//3 注册Bean后处理器
//    registerBeanPostProcessors(beanFactory);
//    // Initialize message source for this context.//4 初始化消息
//    initMessageSource();
//    // Initialize event multicaster for this context.//5 初始化应用上下文事件广播器
//    initApplicationEventMulticaster();
//    // Initialize other special beans in specific context subclasses.//6 初始化其他特殊的Bean；由具体子类实现
//    onRefresh();
//    // Check for listener beans and register them.//7 注册事件监听器
//    registerListeners();
//    // Instantiate all remaining (non-lazy-init) singletons.//8 初始化所有单实例的Bean，使用懒加载模式的Bean除外
//    finishBeanFactoryInitialization(beanFactory);
//    // Last step: publish corresponding event.//9 完成刷新并发布容器刷新事件
//    finishRefresh();
//  }
//}
