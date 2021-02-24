INSERT INTO usuarios(username,password,enabled,nombre,apellido,email) VALUES('admin','$2a$10$HhGIgNjtJvlRRbbYNn7Dr.PxclxR83udDf.0i3JrzZ5dr3Ia.CJde',true,'Admin','','admin@correo.com');
INSERT INTO usuarios(username,password,enabled,nombre,apellido,email) VALUES('user','$2a$10$A1nq1y0d5BKZjwKFCPcYyumgTi.S3EvHK55uYz9/0zTazgiqBRzDq',true,'user','user','user@correo.com');

INSERT INTO roles(nombre) VALUES('ROLE_OPERADOR');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id,role_id) VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id,role_id) VALUES(2,2);
INSERT INTO usuarios_roles(usuario_id,role_id) VALUES(2,1);

INSERT INTO menus(NAME,DESCRIPTION,ICON,STATUS,ORDEN,URL,PARENT_MENU_ID) VALUES('Seguridad','Menú que lista las opciones de seguridad','',true,1,'',null);
INSERT INTO menus(NAME,DESCRIPTION,ICON,STATUS,ORDEN,URL,PARENT_MENU_ID) VALUES('Usuarios','Menú que lista los usuarios del sistema','',true,1,'/api/security/**',1);
INSERT INTO menus(NAME,DESCRIPTION,ICON,STATUS,ORDEN,URL,PARENT_MENU_ID) VALUES('Roles','Menú que lista los roles del sistema','',true,2,'/api/security/**',1);
INSERT INTO menus(NAME,DESCRIPTION,ICON,STATUS,ORDEN,URL,PARENT_MENU_ID) VALUES('Menú','Menú que lista los menús de la aplicación','',true,3,'/api/security/**',1);


