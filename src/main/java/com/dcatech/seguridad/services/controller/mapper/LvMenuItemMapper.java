package com.dcatech.seguridad.services.controller.mapper;

import com.dcatech.security.commons.models.entity.Menu;
import com.dcatech.seguridad.services.controller.dto.LvMenuItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LvMenuItemMapper {

    LvMenuItemMapper INSTANCE = Mappers.getMapper(LvMenuItemMapper.class);

    @Mapping(source = "name", target = "label")
    @Mapping(source = "parentMenu.getName()", target = "parentLabel")
    @Mapping(source = "url", target = "routerLink")
    @Mapping(source = "icon", target = "iconType")
    @Mapping(source = "icon", target = "iconName")
    @Mapping(source = "description", target = "menuItemBasedOnId")
    LvMenuItemDto menuItemToMenuItemDTO(Menu lvMenuItem);

}
