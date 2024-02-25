package com.example.tuesdb.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "permission")
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;

    @Column(nullable = false)
    private String permissionName;


    public Long getPermissionId() { return permissionId; }

    public void setPermissionId(Long permissionId) { this.permissionId = permissionId; }

    public String getPermissionName() { return permissionName; }

    public void setPermissionName(String permissionName) { this.permissionName = permissionName; }
}
