package org.example.DTO;

import java.util.Objects;

public class Registration {

  private String login;
  private String password;
  private Long timestamp;

  public Registration() {
  }

  public Registration(String login, String password, Long timestamp) {
    this.login = login;
    this.password = password;
    this.timestamp = timestamp;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass() != getClass()) {
      return false;
    }
    Registration that = (Registration) o;
    return this.getLogin().equals(that.getLogin())
        && this.getPassword().equals(that.getPassword())
        && this.getTimestamp().equals(that.getTimestamp());
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, password, timestamp);
  }
}
