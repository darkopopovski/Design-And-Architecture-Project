
drop schema if exists project cascade;
create schema project;

drop table if exists users;
drop table if exists map_skopje_banks_atms;

create table users(
 user_id serial primary key,
 user_username varchar(255),
 user_password varchar(255),
 user_name varchar(255),
 user_email varchar(255),
 user_role varchar(255)
);

create table map_skopje_banks_atms(
   	id serial primary key,
   	totalScore float,
	title varchar(255),
	reviewsCount int,
	street varchar(255),                   
	city varchar(255),
	state varchar(255),
	countryCode varchar(255),
	webiste varchar(255),
	phone varchar(255),
	categoryName varchar(255),
	url varchar(255)
);
