package com.dciwang.domain;

import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContext implements ApplicationContextAware {

  @Setter
  private static ApplicationContext appContext;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) {
    setAppContext(applicationContext);
  }

  public static <T> T getBean(Class<T> className) {
    return appContext.getBean(className);
  }
}
