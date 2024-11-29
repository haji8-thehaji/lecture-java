

INSERT INTO USER (id) VALUES (1);
INSERT INTO USER (id) VALUES (2);
INSERT INTO USER (id) VALUES (3);
INSERT INTO USER (id) VALUES (4);

INSERT INTO MEMO (id, memo, created_dt, deleted_dt) VALUES 
(11, 'First memo', NOW(), NULL),
(12, 'Second memo', NOW(), NULL),
(13, 'Third memo', NOW(), NULL);

INSERT INTO MEMO_LIST (id, memo, created_dt, deleted_dt) VALUES
(1, 'Bought milk, enough for the week', '2024-11-08 09:00:00', NULL),
(2, '10 eggs left, need to buy more soon', '2024-11-08 09:05:00', NULL),
(3, 'Need to organize fruits in the fridge', '2024-11-08 09:10:00', NULL),
(4, 'Kimchi finished, need to buy more', '2024-11-08 09:15:00', NULL),
(5, 'Thinking about when to clean the fridge', '2024-11-08 09:20:00', NULL),
(6, 'Preparing ingredients for soybean paste stew', '2024-11-08 09:25:00', NULL),
(7, 'Only 1 slice of cheese left', '2024-11-08 09:30:00', NULL),
(8, '2 bottles of water left, drink them today', '2024-11-08 09:35:00', NULL),
(9, 'Planning to buy a bunch of green grapes', '2024-11-08 09:40:00', NULL),
(10, 'Some meat left, need to cook it soon', '2024-11-08 09:45:00', NULL);

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

INSERT INTO RECIPE (id, name, Ingredients, Steps) VALUES
(1, 'Apple Oatmeal', '1 Apple, 1 Cup of Oats, 1/2 Cup of Milk, 1 Tablespoon of Honey', '1. Slice the apple./2. Mix oats, milk, and honey in a bowl./3. Add the sliced apple and mix.'),
(2, 'Grilled Chicken Breast', '1 Chicken Breast, 1 Tablespoon Olive Oil, Salt, Pepper, Garlic', '1. Season chicken with salt, pepper, and garlic./2. Heat oil in a pan./3. Cook chicken until golden on both sides.'),
(3, 'Scrambled Eggs', '2 Eggs, 1/4 Cup of Milk, 1/4 Cup Cheese, Salt, Pepper', '1. Beat eggs with milk./2. Pour into a hot pan./3. Add cheese and season. Cook until scrambled.'),
(4, 'Steamed Rice', '1 Cup Rice, 2 Cups Water, Salt, 1 Tablespoon Butter', '1. Boil water with salt./2. Add rice, cover, and simmer for 15 minutes./3. Fluff with a fork and add butter.'),
(5, 'Banana Peanut Butter Snack', '2 Bananas, 1/2 Cup Peanut Butter, 1/4 Cup Honey', '1. Slice bananas./2. Spread peanut butter on banana slices./3. Drizzle with honey. Serve cold.'),
(6, 'Pancakes', '1 Cup Flour, 1 Egg, 1/2 Cup Milk, Salt, 1 Tablespoon Sugar', '1. Mix flour, egg, milk, salt, and sugar into a batter./2. Pour batter onto hot skillet./3. Flip pancakes when bubbles form.'),
(7, 'Sautéed Spinach', '1 Cup Spinach, 1/4 Cup Feta, 1 Tablespoon Olive Oil, Salt, Pepper', '1. Heat olive oil in a pan./2. Add spinach and cook until wilted./3. Top with feta and season with salt and pepper.'),
(8, 'Chips & Guacamole', '1 Bag Tortilla Chips, 1/2 Cup Guacamole, 1/4 Cup Sour Cream', '1. Arrange chips on a plate./2. Serve with guacamole and sour cream on the side.'),
(9, 'Greek Yogurt with Honey & Walnuts', '1/2 Cup Greek Yogurt, 1/4 Cup Honey, 1/4 Cup Walnuts', '1. Mix yogurt and honey./2. Top with walnuts.'),
(10, 'Tomato Onion Salad', '2 Tomatoes, 1/4 Onion, 1 Tablespoon Olive Oil, Salt, Pepper', '1. Chop tomatoes and onion./2. Drizzle with olive oil and season with salt and pepper.'),
(11, 'Lemon Herb Chicken', '2 Chicken Breasts, 1/4 Cup Lemon Juice, 1 Tablespoon Olive Oil, Garlic, Salt', '1. Marinate chicken in lemon juice, olive oil, garlic, and salt for 30 minutes./2. Cook in a hot skillet for 6-7 minutes each side.'),
(12, 'Quinoa Salad', '1 Cup Quinoa, 2 Cups Water, Salt, 1/2 Cup Cherry Tomatoes, Olive Oil', '1. Boil water and salt./2. Add quinoa, cover, and simmer for 15 minutes./3. Mix with tomatoes and drizzle with olive oil.'),
(13, 'Overnight Oats', '1 Cup Oats, 1/2 Cup Almond Milk, 1 Tablespoon Chia Seeds, Honey', '1. Combine oats, almond milk, and chia seeds in a bowl./2. Let sit for 15 minutes or overnight./3. Drizzle with honey before serving.'),
(14, 'Lentil Soup', '1 Cup Lentils, 2 Cups Water, 1 Onion, 1 Carrot, Garlic, Salt, Pepper', '1. Boil water and add lentils./2. Dice onion and carrot and cook in a pan./3. Add cooked veggies to lentils and season.'),
(15, 'Roasted Potatoes', '2 Potatoes, 2 Tablespoons Olive Oil, Salt, Pepper, Rosemary', '1. Peel and slice potatoes./2. Toss with olive oil, salt, pepper, and rosemary./3. Roast at 400°F for 25 minutes.'),
(16, 'Almond Flour Pancakes', '1 Cup Almond Flour, 2 Eggs, 1 Tablespoon Honey, 1/2 Cup Berries', '1. Mix almond flour, eggs, and honey to make a batter./2. Pour into a pan./3. Top with berries and bake at 350°F for 20 minutes.'),
(17, 'Shortbread Cookies', '1 Cup Flour, 1/2 Cup Butter, 1/4 Cup Sugar, 1/4 Cup Water', '1. Combine flour, butter, and sugar./2. Add water and knead into dough./3. Roll out and bake at 350°F for 15 minutes.'),
(18, 'Curry Chicken', '1 Chicken Breast, 1 Tablespoon Curry Powder, 1/4 Cup Coconut Milk', '1. Season chicken with curry powder./2. Cook chicken in a pan./3. Add coconut milk and simmer for 5 minutes.'),
(19, 'Avocado Toast with Egg', '2 Eggs, 1 Avocado, 1 Tablespoon Lemon Juice, Salt', '1. Mash avocado and mix with lemon juice and salt./2. Fry eggs to your liking./3. Serve eggs with avocado mash on top.'),
(20, 'Vanilla Cake', '1 Cup Flour, 1 Cup Sugar, 1/2 Cup Butter, 2 Eggs', '1. Mix flour, sugar, and butter./2. Add eggs and mix./3. Bake at 350°F for 25 minutes.'),
(21, 'Spinach Feta Salad', '1 Cup Spinach, 1/4 Cup Goat Cheese, 1 Tablespoon Olive Oil, Salt', '1. Wilt spinach in olive oil./2. Top with goat cheese and season with salt.'),
(22, 'Coconut Mango Rice', '1/2 Cup Rice, 1 Cup Coconut Milk, 1/2 Cup Mango, Sugar', '1. Cook rice in coconut milk./2. Add diced mango and sugar to taste.'),
(23, 'Spinach Almond Salad', '1 Cup Spinach, 1/4 Cup Almonds, 1 Tablespoon Olive Oil, Salt', '1. Toss spinach and almonds with olive oil./2. Season with salt and serve.'),
(24, 'Savory Pancakes', '2 Eggs, 1/2 Cup Flour, 1/2 Cup Milk, 1 Tablespoon Butter', '1. Beat eggs with milk and flour./2. Cook in a pan with butter to form a pancake.'),
(25, 'Kale Walnut Salad', '1 Cup Chopped Kale, 1/4 Cup Walnuts, Olive Oil, Salt', '1. Sauté kale in olive oil./2. Top with walnuts and season with salt.'),
(26, 'Tofu Rice Bowl', '1 Cup Rice, 1/4 Cup Soy Sauce, 1/2 Cup Tofu, 1/4 Cup Green Onions', '1. Cook rice and set aside./2. Fry tofu with soy sauce./3. Serve tofu over rice and top with green onions.'),
(27, 'Banana Oat Bars', '2 Bananas, 1 Cup Oats, 1/4 Cup Honey, 1/2 Cup Peanut Butter', '1. Mash bananas and mix with oats, honey, and peanut butter./2. Form into bars and bake at 350°F for 15 minutes.'),
(28, 'Chocolate Cake', '1 Cup Flour, 1/4 Cup Sugar, 1/4 Cup Butter, 2 Eggs', '1. Mix flour, sugar, and butter./2. Add eggs and mix./3. Bake at 350°F for 20 minutes.'),
(29, 'Tomato Sauce', '2 Cups Tomatoes, 1 Onion, 1/2 Cup Olive Oil, 1 Clove Garlic', '1. Dice tomatoes and onion./2. Cook in olive oil with garlic./3. Simmer for 20 minutes and serve as a sauce.');

INSERT INTO FOOD_INVENTORY (id, food_id, expire_date, volume, created_dt, deleted_dt) VALUES 
(1, 1, '2024-12-31 00:00:00', '1kg', NOW(), NULL),
(2, 2, '2024-11-15 00:00:00', '500g', NOW(), NULL),
(3, 3, '2025-01-10 00:00:00', '2kg', NOW(), NULL),
(4, 4, '2025-01-10 00:00:00', '2kg', NOW(), NULL),
(5, 5, '2025-01-10 00:00:00', '2kg', NOW(), NULL),
(6, 6, '2025-01-10 00:00:00', '2kg', NOW(), NULL),
(7, 7, '2025-01-10 00:00:00', '2kg', NOW(), NULL),
(8, 8, '2025-01-10 00:00:00', '2kg', NOW(), NULL),
(9, 9, '2025-01-10 00:00:00', '2kg', NOW(), NULL),
(10, 10, '2025-01-10 00:00:00', '2kg', NOW(), NULL);

INSERT INTO CART (id, food_id, volume, count, money) VALUES
(1, 1, 'Small', 2, 5000),
(2, 2, 'Medium', 3, 7500),
(3, 3, 'Large', 1, 3000),
(4, 4, 'Small', 4, 4000),
(5, 5, 'Medium', 2, 6000),
(6, 6, 'Large', 5, 12000),
(7, 7, 'Small', 6, 15000),
(8, 8, 'Medium', 3, 7500),
(9, 9, 'Large', 2, 8000),
(10, 10, 'Small', 7, 21000);


INSERT INTO TEST2 (id, phone)
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