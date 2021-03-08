INSERT INTO usuarios(username,password,enabled,nombre,apellido,email) VALUES('admin','$2a$10$HhGIgNjtJvlRRbbYNn7Dr.PxclxR83udDf.0i3JrzZ5dr3Ia.CJde',true,'Admin','','admin@correo.com');
INSERT INTO usuarios(username,password,enabled,nombre,apellido,email) VALUES('user','$2a$10$A1nq1y0d5BKZjwKFCPcYyumgTi.S3EvHK55uYz9/0zTazgiqBRzDq',true,'user','user','user@correo.com');

INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');
INSERT INTO roles(nombre) VALUES('ROLE_OPERADOR');


INSERT INTO usuarios_roles(usuario_id,role_id) VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id,role_id) VALUES(2,2);



--1
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Tablero','Panel de Indicadores','fa fa-sliders',true,1,'web/dashboard',null,'fa fa-sliders','close','dummy');
--2
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Configuración','Administracion del Sistema','fa fa-sliders',true,2,'web/Descricpcion Opcion',null,'fa fa-sliders','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Empresa','Administracion de las empresas','fa fa-sitemap',true,1,'web/company',2,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Gestión de conceptos','Gestión de conceptos','fa fa-sitemap',true,2,'web/concepts/list',2,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Archivos auxiliares','Archivos auxiliares','fa fa-sitemap',true,3,'web/unknow',2,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Ubicaciones','Ubicaciones','fa fa-map',true,1,'web/unknow',5,'fa fa-map','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Tipos de contrato','Tipos de contrato','fa fa-file',true,2,'web/contract-types/list',5,'fa fa-file','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Tipos de Riesgo','Tipos de Riesgo','fa fa-plus-square',true,3,'web/risk-types/list',5,'fa fa-plus-square','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Tipos de Fondos','Tipos de Fondos','fa fa-sitemap',true,4,'web/fund-types/list',5,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Traslado de Fondos','Traslado de Fondos','fa fa-sitemap',true,5,'web/transfer-funds',5,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Parámetros Salariales','Parámetros Salariales','fa fa-sitemap',true,6,'web/salary-parameters/list',5,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Frecuencias de Pago','Frecuencias de Pago','fa fa-sitemap',true,7,'web/payment-frequencies/list',5,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Entidades Financieras','Entidades Financieras','fa fa-sitemap',true,8,'web/financial-entities/list',5,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Fondos Solidaridad Pensional','Fondos Solidaridad Pensional','fa fa-sitemap',true,9,'web/pension-solidarity-funds/list',5,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Retención en la Fuente','Retención en la Fuente','fa fa-sitemap',true,10,'web/source-withholdings/list',5,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Festivos y Dominicales','Festivos y Dominicales','fa fa-shopping-basket',true,11,'web/holydays',5,'fa fa-shopping-basket','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Tipos de referencia','Tipos de referencia','fa fa-sitemap',true,4,'web/reference-types/list',2,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Periodos de Pago','Periodos de Pago','fa fa-sitemap',true,5,'web/paid-days/list',2,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Plantillas','Plantillas','fa fa-sitemap',true,6,'web/templates/list',2,'fa fa-sitemap','close','dummy');

--20
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Empleados','Empleados','fa fa-sliders',true,2,'web/',null,'fa fa-sliders','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Hojas de vida','Hojas de vida','fa fa-sitemap',true,1,'web/employees/list',20,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Contratos','Contratos','fa fa-sitemap',true,2,'web/contracts/list',20,'fa fa-sitemap','close','dummy');

--23
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Novedades','Novedades','fa fa-sliders',true,3,'web/payroll-news/list',null,'fa fa-sliders','close','dummy');

--24
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Liquidaciones','Liquidaciones','fa fa-sliders',true,4,'web/payroll-news-list',null,'fa fa-sliders','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Liquidaciones','Liquidaciones','fa fa-sitemap',true,1,'web/pay-periodic-payroll',24,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Autoliquidaciones','Autoliquidaciones','fa fa-sitemap',true,2,'web/pay-periodic-payroll',24,'fa fa-sitemap','close','dummy');

--27
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Contabilizacion','Contabilizacion','fa fa-sliders',true,5,'web/accounting',null,'fa fa-sliders','close','dummy');
--28
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Seguridad social','Seguridad social','fa fa-sliders',true,6,'web/manteinance',null,'fa fa-sliders','close','dummy');
--29
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Procesos especiales','Procesos especiales','fa fa-sliders',true,7,'web/manteinance',null,'fa fa-sliders','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Retención en la Fuente Metodo Dos','Retención en la Fuente Metodo Dos','fa fa-sitemap',true,1,'web/source-withholdings-method-two',29,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Consignación de Cesantias','Consignación de Cesantias','fa fa-map',true,2,'web/consignment-layoffs',29,'fa fa-map','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Reajuste salarial','Reajuste salarial','fa fa-sitemap',true,3,'web/salary-adjustment',29,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Acumulados fin de año','Acumulados fin de año','fa fa-sitemap',true,4,'web/manteinance',29,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Medios magneticos pila','Medios magneticos pila','fa fa-sitemap',true,5,'web/manteinance',29,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Medios magneticos pago','Medios magneticos pago','fa fa-sitemap',true,6,'web/manteinance',29,'fa fa-sitemap','close','dummy');

--36
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Consultas y reportes','Consultas y reportes','fa fa-sliders',true,8,'web/manteinance',null,'fa fa-sliders','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Gestión de Reportes','Gestión de Reportes','fa fa-sitemap',true,1,'web/settlement-report',36,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Archivos auxiliares','Archivos auxiliares','fa fa-sitemap',true,2,'web/manteinance',36,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Empleados & contratos','Empleados & contratos','fa fa-sitemap',true,3,'web/manteinance',36,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Novedades','Novedades','fa fa-sitemap',true,4,'web/manteinance',36,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Liquidaciones','Liquidaciones','fa fa-sitemap',true,5,'web/manteinance',36,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Comprobantes de pago','Comprobantes de pago','fa fa-sitemap',true,1,'web/proof-of-payment',41,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Hist. Reg. Vacaciones','Hist. Reg. Vacaciones','fa fa-sitemap',true,2,'web/manteinance',41,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Hist. Rep. cesantias','Hist. Rep. cesantias','fa fa-sitemap',true,3,'web/manteinance',41,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Hist. Cert. de ingresos','Hist. Cert. de ingresos','fa fa-sitemap',true,4,'web/manteinance',41,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Hist. retenciones','Hist. retenciones','fa fa-sitemap',true,5,'web/manteinance',41,'fa fa-sitemap','close','dummy');

--47
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Contabilización','Contabilización','fa fa-sitemap',true,9,'web/manteinance',null,'fa fa-sitemap','close','dummy');
--48
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Seguridad social','Seguridad social','fa fa-sitemap',true,10,'web/manteinance',null,'fa fa-sitemap','close','dummy');
--49
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Utilitarios','Utilitarios','fa fa-sitemap',true,11,'web/manteinance',null,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Funciones de Nomina','Funciones de Nomina','fa fa-sitemap',true,1,'web/functions/list',49,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Tareas programadas','Tareas programadas','fa fa-sitemap',true,2,'web/scheduled-tasks/list',49,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Reclasificación de Información','Reclasificación de Información','fa fa-sitemap',true,3,'web/manteinance',49,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Generador de queries','Generador de queries','fa fa-sitemap',true,4,'web/manteinance',49,'fa fa-sitemap','close','dummy');

--53
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Administracion del Sistema','Administracion del Sistema','fa fa-sliders',true,12,'web/Descricpcion Opcion',null,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Horas extras y recargos','Horas extras y recargos','fa fa-sitemap',true,1,'web/extra-hours/list',53,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Solicitudes','Solicitudes','fa fa-sitemap',true,2,'web/requests',53,'fa fa-sitemap','close','dummy');

--56
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Seguridad','Menú que lista las opciones de seguridad','fa fa-sliders',true,1,'',null,'fa fa-sliders','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Usuarios','Menú que lista los usuarios del sistema','fa fa-sitemap',true,1,'/api/security/**',56,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Roles','Menú que lista los roles del sistema','fa fa-sitemap',true,2,'/api/security/**',56,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Menú','Menú que lista los menús de la aplicación','fa fa-sitemap',true,3,'/api/security/**',56,'fa fa-sitemap','close','dummy');
INSERT INTO menus(LABEL,DESCRIPTION,ICON_NAME,VISIBLE,ORDEN,ROUTER_LINK,PARENT_MENU_ID,ICON_TYPE,TOGGLE,menu_Item_Based_On_Id) VALUES('Utilidades','Menú que lista las opciones generales','fa fa-sitemap',true,2,'',null,'fa fa-sitemap','close','dummy');

INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,1,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,2,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,3,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,4,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,5,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,6,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,7,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,8,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,9,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,10,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,11,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,12,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,13,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,14,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,15,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,16,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,17,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,18,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,19,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,20,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,21,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,22,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,23,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,24,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,25,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,26,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,27,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,28,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,29,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,30,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,31,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,32,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,33,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,34,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,35,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,36,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,37,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,38,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,39,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,40,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,41,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,42,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,43,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,44,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,45,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,46,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,47,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,48,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,49,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,50,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,51,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,52,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,53,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,54,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,55,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,56,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,57,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,58,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,59,1);
INSERT INTO menus_roles(opt_create,opt_delete,opt_select,opt_update,menu_id,role_id) VALUES(true,true,true,true,60,1);
