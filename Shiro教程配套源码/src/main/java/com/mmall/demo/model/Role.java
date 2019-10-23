package com.mmall.demo.model;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private Integer rid;

    private String name;

    private Set<Premission> premissions = new HashSet<>();

    //角色列表 每个role包含多个用户
    private Set<User> users = new HashSet<>();


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Premission> getPremissions() {
        return premissions;
    }

    public void setPremissions(Set<Premission> premissions) {
        this.premissions = premissions;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
