
drop schema if exists project cascade;
create schema project;

drop table if exists users;
drop table if exists map_places_data;

create table users(
 user_id serial primary key,
 user_username varchar(255),
 user_password varchar(255),
 user_name varchar(255),
 user_email varchar(255),
 user_role varchar(255)
);

create table map_places_data(
   	id serial primary key AUTO_INCREMENT,
	name varchar(255),
	reviewsCount int,
	street varchar(255),
	city varchar(255),
	webiste varchar(255),
	phone varchar(255),
	categoryName varchar(255)
);