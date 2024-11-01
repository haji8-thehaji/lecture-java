DROP TABLE book2 IF EXISTS;
DROP TABLE lemp IF EXISTS;
DROP TABLE boardHaji IF EXISTS;
DROP TABLE board IF EXISTS;
DROP TABLE FOOD_INFO IF EXISTS;
DROP TABLE MEMO IF EXISTS;
DROP TABLE RECIPE IF EXISTS;
DROP TABLE FOOD_INVENTORY IF EXISTS;
DROP TABLE USER IF EXISTS;
DROP TABLE CART IF EXISTS;

CREATE TABLE book2 (
  book_id VARCHAR(5),
  title VARCHAR(40),
  author VARCHAR(40),
  publisher VARCHAR(40),
  release_date VARCHAR(8),
  isbn VARCHAR(13),
  PRIMARY KEY(book_id)
);
CREATE TABLE lemp (
  id VARCHAR(5),
  state VARCHAR(40)
);
CREATE TABLE boardHaji (
  id VARCHAR(5) PRIMARY KEY,
  name VARCHAR(40),
  content LONGVARCHAR,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  views INT DEFAULT 0
);
CREATE TABLE board (
  id VARCHAR(5) PRIMARY KEY,
  name VARCHAR(40),
  content LONGVARCHAR,
  created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
  views INT DEFAULT 0
);

CREATE TABLE `FOOD_INFO` (
  `id` integer PRIMARY KEY,
  `name` String,
  `standard_expire_day` interger,
  `standard_price` interger,
  `standard_volume` string,
  `storage_type` string,
  `custom_bool` integer,
  `season_spring` interger,
  `season_summer` interger,
  `season_autumn` interger,
  `season_winter` interger
);

CREATE TABLE `MEMO` (
  `id` integer PRIMARY KEY,
  `memo` string COMMENT 'Content of the memo',
  `created_dt` timestamp,
  `deleted_dt` timestamp
);

CREATE TABLE `RECIPE` (
  `id` integer PRIMARY KEY,
  `Ingredients` string,
  `Steps` string
);

CREATE TABLE `FOOD_INVENTORY` (
  `id` integer PRIMARY KEY,
  `food_id` integer,
  `expire_date` timestamp,
  `volume` string,
  `created_dt` timestamp,
  `deleted_dt` timestamp
);

CREATE TABLE `USER` (
  `id` integer PRIMARY KEY
);

CREATE TABLE `CART` (
  `id` integar PRIMARY KEY,
  `food_id` integer,
  `volume` string
);

ALTER TABLE `FOOD_INVENTORY` ADD FOREIGN KEY (`food_id`) REFERENCES `FOOD_INFO` (`id`);

ALTER TABLE `CART` ADD FOREIGN KEY (`food_id`) REFERENCES `FOOD_INFO` (`id`);
