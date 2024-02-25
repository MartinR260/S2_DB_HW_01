package com.example.tuesdb.dtos;

import com.example.tuesdb.models.Group;

public class GroupDto {

    private Long groupId;
    private String groupName;

    public GroupDto (Group a) {

        this.groupId = a.getGroupId();
        this.groupName = a.getGroupName();
    }

    public Long getGroupId() { return groupId; }

    public void setGroupId(Long groupId) { this.groupId = groupId; }

    public String getGroupName() { return groupName; }

    public void setGroupName(String groupName) { this.groupName = groupName; }
}
