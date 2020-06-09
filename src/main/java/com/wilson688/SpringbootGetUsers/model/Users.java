package com.wilson688.SpringbootGetUsers.model;

import lombok.Getter;
import lombok.Setter;

public class Users {

    @Getter @Setter
    String id;

    @Getter @Setter
    String userName;

    @Getter @Setter
    String designation;

    @Getter @Setter
    String accessLevel;

    @Getter @Setter
    String department;

    public Users(String id, String userName, String designation, String accessLevel, String department) {
        this.id = id;
        this.userName = userName;
        this.designation = designation;
        this.accessLevel = accessLevel;
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
