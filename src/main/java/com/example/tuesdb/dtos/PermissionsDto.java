package com.example.tuesdb.dtos;

import com.example.tuesdb.models.Permissions;

public class PermissionsDto {

    private Long permissionId;
    private String permissionName;

    public PermissionsDto(Permissions a) {

        this.permissionId = a.getPermissionId();
        this.permissionName = a.getPermissionName();
    }

    public Long getPermissionId() { return permissionId; }

    public void setPermissionId(Long permissionId) { this.permissionId = permissionId; }

    public String getPermissionName() { return permissionName; }

    public void setPermissionName(String permissionName) { this.permissionName = permissionName; }
}
