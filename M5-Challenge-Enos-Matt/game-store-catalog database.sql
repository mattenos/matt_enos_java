drop schema game_store_catalog;
create schema if not exists game_store_catalog;
use game_store_catalog;

create table if not exists console (
    console_id int primary key,
    model varchar(50) not null,
    manufacturer varchar(50) not null,
    memoryAmount varchar(20),
    processor varchar(20),
    price decimal(5, 2) not null,
    quantity long not null
);

create table if not exists game (
    game_id int primary key,
    title varchar(50) not null,
    esrbRating varchar(50) not null,
    description varchar(255) not null,
    price decimal(5, 2) not null,
    studio varchar(50) not null,
    quantity long not null
);

create table if not exists tshirt (
    tshirt_id int primary key,
    size varchar(20) not null,
    color varchar(20) not null,
    description varchar(255) not null,
    price decimal(5,2) not null,
    quantity long not null
);