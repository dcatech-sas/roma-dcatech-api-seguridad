package com.dcatech.seguridad.services.controller.dto;


import lombok.Data;

import java.util.List;

@Data
public class LvMenuDto {
    private String label;
    private String description;
    private String details = "12 New Updates";
    private String routerLink;
    private String iconType;
    private String iconName;
    private String toggle;

    //private List<LvMenuItemDto> submenus;

}
