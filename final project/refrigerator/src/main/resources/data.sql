

INSERT INTO USER (id) VALUES (1);
INSERT INTO USER (id) VALUES (2);
INSERT INTO USER (id) VALUES (3);
INSERT INTO USER (id) VALUES (4);INSERT INTO MEMO (id, memo, created_dt, deleted_dt) VALUES 
(1, 'First memo', NOW(), NULL),
(2, 'Second memo', NOW(), NULL),
(3, 'Third memo', NOW(), NULL);

INSERT INTO FOOD_CATEGORY (id, name)
VALUES
(1, 'Fruits'),
(2, 'Vegetables'),
(3, 'Meat'),
(4, 'Dairy'),
(5, 'Bakery'),
(6, 'Snacks'),
(7, 'Beverages'),
(8, 'Condiments'),
(9, 'Seafood'),
(10, 'Frozen Food');

INSERT INTO FOOD_INFO (id, food_category_id, name, image, standard_expire_day, standard_price, standard_volume, storage_type, custom_bool, season_spring, season_summer, season_autumn, season_winter)
VALUES
(1, 1, 'Apple', 'apple.jpg', 30, 1500, '500g', 'Refrigerated', 0, 1, 1, 0, 0),
(2, 1, 'Pear', 'pear.jpg', 25, 2000, '600g', 'Refrigerated', 0, 1, 1, 0, 0),
(3, 2, 'Kimchi', 'kimchi.jpg', 15, 3000, '1kg', 'Refrigerated', 0, 0, 1, 1, 0),
(4, 3, 'Chicken', 'chicken.jpg', 5, 5000, '1kg', 'Frozen', 0, 0, 0, 1, 0),
(5, 2, 'Doenjang (Fermented Soybean Paste)', 'doenjang.jpg', 365, 1000, '500g', 'Refrigerated', 0, 1, 0, 1, 1),
(6, 4, 'Spaghetti', 'spaghetti.jpg', 7, 1500, '500g', 'Room Temperature', 0, 0, 1, 0, 1),
(7, 3, 'Sausage', 'sausage.jpg', 10, 4000, '400g', 'Frozen', 0, 0, 1, 1, 0),
(8, 1, 'Strawberry', 'strawberry.jpg', 7, 2500, '300g', 'Refrigerated', 0, 1, 1, 0, 0),
(9, 5, 'Ice Cream', 'icecream.jpg', 30, 3500, '500ml', 'Frozen', 0, 0, 1, 0, 1),
(10, 1, 'Grapes', 'grape.jpg', 15, 1800, '400g', 'Refrigerated', 0, 1, 1, 0, 0);


INSERT INTO RECIPE (id, Ingredients, Steps) VALUES 
(1, 'Chicken, salt, pepper, garlic', '1. Season the chicken with salt and pepper. 2. Add garlic and saute. 3. Cook until the chicken is done.'),
(2, 'Pasta, olive oil, garlic, salt', '1. Boil the pasta. 2. Saute olive oil and garlic in a pan. 3. Add the boiled pasta and mix.'),
(3, 'Potatoes, butter, salt, pepper', '1. Boil the potatoes. 2. Mash the boiled potatoes. 3. Season with butter, salt, and pepper.');

INSERT INTO FOOD_INVENTORY (id, food_id, expire_date, volume, created_dt, deleted_dt) VALUES 
(1, 1, '2024-12-31 00:00:00', '1kg', NOW(), NULL),
(2, 2, '2024-11-15 00:00:00', '500g', NOW(), NULL),
(3, 3, '2025-01-10 00:00:00', '2kg', NOW(), NULL);

INSERT INTO CART (id, food_id, volume) VALUES 
(1, 1, '1kg'),
(2, 2, '500g'),
(3, 3, '2kg');