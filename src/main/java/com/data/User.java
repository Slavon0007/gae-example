package com.data;

public class User {
    private String email;
    private String password;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Email: ");
        builder.append(email);
        builder.append(". Name: ");
        builder.append(name);
        builder.append(". Password: ");
        builder.append(password);

        return builder.toString();
    }
}