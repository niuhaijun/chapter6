package com.smart.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MailSender implements ApplicationContextAware {

  private ApplicationContext ctx;

  /**
   * ApplicationContextAware接口方法，以便于容器启动时自动注入容器实例。
   *
   * @param ctx 容器实例
   * @throws BeansException 异常
   */
  @Override
  public void setApplicationContext(ApplicationContext ctx)
      throws BeansException {
    this.ctx = ctx;

  }

  public void sendMail(String to) {
    System.out.println("MailSender:模拟发送邮件...");
    MailSendEvent mse = new MailSendEvent(this.ctx, to);
    ctx.publishEvent(mse);
  }
}
