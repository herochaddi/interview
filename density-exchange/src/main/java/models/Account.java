package models;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Account {
    private final String id;
    private final String username;
    private final String password;

    public Account(String clientName, String password) {
        this.id = UUID.randomUUID().toString();
        this.username = clientName;
        this.password = password;
    }
}
