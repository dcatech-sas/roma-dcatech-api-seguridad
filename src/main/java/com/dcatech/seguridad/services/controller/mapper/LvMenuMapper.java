package com.dcatech.seguridad.services.controller.mapper;

import com.dcatech.security.commons.models.entity.Menu;
import com.dcatech.seguridad.services.controller.dto.LvMenuDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper//(uses = LvMenuItemMapper.class)
public interface LvMenuMapper {

    LvMenuMapper INSTANCE = Mappers.getMapper(LvMenuMapper.class);

    @Mapping(source = "name", target = "label")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "url", target = "routerLink")
    @Mapping(source = "description", target = "details")
    @Mapping(source = "icon", target = "iconType")
    @Mapping(source = "icon", target = "iconName")
    @Mapping(source = "orden", target = "toggle")
    //@Mapping(source = "submenus", target = "submenus")
    LvMenuDto toMenuDto(Menu lvMenu);

    List<LvMenuDto> toLvMenuDto(List<Menu> lvMenus);

}
