package com.example.tuesdb.dtos;

import com.example.tuesdb.models.UserGroup;

public class UserGroupDto {

    private Long id;
    private Long user;
    private Long group;

    public UserGroupDto (UserGroup a){

        this.id = a.getId();
        this.user = a.getUser().getUserId();
        this.group = a.getGroup().getGroupId();
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public Group getGroup() { return group; }

    public void setGroup(Group group) { this.group = group; }
}
