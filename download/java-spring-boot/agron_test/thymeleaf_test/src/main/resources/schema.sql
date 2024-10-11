DROP TABLE book2 IF EXISTS;
DROP TABLE lemp IF EXISTS;

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