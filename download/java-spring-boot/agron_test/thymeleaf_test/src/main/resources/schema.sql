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

CREATE TABLE FOOD_CATEGORY (
  id integer,
  name String
);
CREATE TABLE FOOD_INFO (
  id INTEGER PRIMARY KEY,
  food_category_id integer,
  name VARCHAR(40),
  image VARCHAR(40),
  standard_expire_day INTEGER,
  standard_price INTEGER,
  standard_volume VARCHAR(40),
  storage_type VARCHAR(40),
  custom_bool INTEGER,
  season_spring INTEGER,
  season_summer INTEGER,
  season_autumn INTEGER,
  season_winter INTEGER
);

  CREATE TABLE MEMO (
    id integer PRIMARY KEY,
    memo VARCHAR(500),
    created_dt timestamp,
    deleted_dt timestamp
  );

CREATE TABLE RECIPE (
  id integer PRIMARY KEY,
  Ingredients VARCHAR(500),
  Steps VARCHAR(500)
);

CREATE TABLE FOOD_INVENTORY (
  id integer PRIMARY KEY,
  food_id integer,
  expire_date timestamp,
  volume VARCHAR(40),
  created_dt timestamp,
  deleted_dt timestamp
);

CREATE TABLE USER (
  id integer PRIMARY KEY
);

CREATE TABLE CART (
  id integer PRIMARY KEY,
  food_id integer,
  volume VARCHAR(40),
  count integer,
  money integer
);

ALTER TABLE FOOD_INVENTORY ADD FOREIGN KEY (food_id) REFERENCES FOOD_INFO (id);

ALTER TABLE CART ADD FOREIGN KEY (food_id) REFERENCES FOOD_INFO (id);
