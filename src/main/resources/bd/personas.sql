create database adoo;
use adoo

create table usuarios
(
id int not null primary key auto_increment,
nombre varchar(20) not null
);

create table tareas
(
id int not null primary key auto_increment,
descrip varchar(80) not null,
fecha varchar(30) not null,
id_usuario int not null
)

alter table tareas
add constraint id_usuario
foreign key (id_usuario) references usuarios(id);

insert into usuarios (nombre) values
('Ezequiel'),
('Ortiz'),
('Conte');

insert into tareas (descrip, fecha, id_usuario) values
('limpiar','22-3-19','1'),
('cocinar','21-4-19','2'),
('lavar','15-5-19','3');