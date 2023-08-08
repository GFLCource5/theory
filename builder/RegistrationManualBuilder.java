package org.example.builder;

import org.example.DTO.Registration;

public class RegistrationManualBuilder implements Builder {

  private String login;
  private String password;
  private Long timeStamp;

  @Override
  public void setLogin(String login) {
    this.login = login;
  }

  @Override
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  public Registration build() {
    return new Registration(login, password, timeStamp);
  }
}
