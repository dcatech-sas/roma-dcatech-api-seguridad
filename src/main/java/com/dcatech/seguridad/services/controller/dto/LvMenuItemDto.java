package com.dcatech.seguridad.services.controller.dto;

import lombok.Data;


@Data
public class LvMenuItemDto {
    private String label;
    private String parentLabel;
    private String routerLink;
    private String iconType;
    private String iconName;
    private String menuItemBasedOnId;
}
