package com.smart.event;

import org.springframework.context.ApplicationListener;

/**
 * 容器监听器
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {

  /**
   * 对MailSendEvent事件进行处理
   *
   * @param event 事件
   */
  @Override
  public void onApplicationEvent(MailSendEvent event) {
    System.out.println("MailSendListener:向" + event.getTo() + "发送完一封邮件");
  }
}
