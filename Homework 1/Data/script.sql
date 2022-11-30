
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
   	plаceUrl varchar(300),
	title varchar(255),
	rating float,
	reviewCount varchar(255),
	category varchar(255),
	attributes varchar(255),
	address varchar(255),
	plusCode varchar(255),
	website varchar(255),
	phoneNumber varchar(255),
	sunday varchar(255),
	monday varchar(255),
	tuesday varchar(255),
	wednesday varchar(255),
	thursday varchar(255),
	friday varchar(255),
	saturday varchar(255),
	currentStatus varchar(255),
	imgUrl varchar(300),
	isClaimed boolean,
	latitude float,
	longitude float,
	query varchar(255),
	timestampp date
);