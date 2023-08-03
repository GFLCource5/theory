package com.geeksforless.tuleninov.builder;

import java.util.Objects;

public final class User implements Cloneable{

    private final String login;
    private final String password;
    private final Long timestamp;

    private User(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }

    public static User create(String login, String password, Long timestamp) {
        return new User(login, password, timestamp);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    protected User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(timestamp, user.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, timestamp);
    }

    static class UserBuilder {

        private String login;
        private String password;
        private Long timestamp;

        UserBuilder login(String login) {
            this.login = login;
            return this;
        }

        UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        UserBuilder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public User build() {
            return User.create(login, password, timestamp);
        }
    }
}
