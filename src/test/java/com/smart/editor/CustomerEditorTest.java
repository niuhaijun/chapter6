package com.smart.editor;

import static org.testng.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerEditorTest {

  private static String[] CONFIG_FILES = {"com/smart/editor/beans.xml"};
  public ApplicationContext ctx = null;

  @BeforeClass
  public void setUp() throws Exception {
    ctx = new ClassPathXmlApplicationContext(CONFIG_FILES);
  }

  @Test
  public void testCustomerCarEditor() {
    Boss boss = (Boss) ctx.getBean("boss");
    assertNotNull(boss);
    System.out.println(boss);
  }

}
