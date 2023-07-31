-- Preload users table
insert into users (id, name, age, address, status) values (1, 'Jocelin Anselmi', 64, '91 Autumn Leaf Point', 'ACTIVE');
insert into users (id, name, age, address, status) values (2, 'Karlan Pozzi', 48, '2764 Ridge Oak Alley', 'ACTIVE');
insert into users (id, name, age, address, status) values (3, 'Brew Maroney', 80, '5955 Hoffman Circle', 'ACTIVE');
insert into users (id, name, age, address, status) values (4, 'Burtie Readwin', 40, '48082 Carpenter Pass', 'ACTIVE');
insert into users (id, name, age, address, status) values (5, 'Abelard MacGragh', 61, '52 Vermont Junction', 'ACTIVE');
insert into users (id, name, age, address, status) values (6, 'Clemmie Scoggans', 80, '1018 Vahlen Junction', 'ACTIVE');
insert into users (id, name, age, address, status) values (7, 'Beverlee Cartner', 45, '2498 Maywood Crossing', 'ACTIVE');
insert into users (id, name, age, address, status) values (8, 'Renae Island', 43, '43565 Logan Point', 'ACTIVE');
insert into users (id, name, age, address, status) values (9, 'Palmer Cloy', 34, '62 Rutledge Terrace', 'ACTIVE');
insert into users (id, name, age, address, status) values (10, 'Aldin Mattocks', 56, '8634 Myrtle Park', 'ACTIVE');

-- Preload cards table
insert into cards (id, card_number, expiration_date, cvv, status) values (1, '5602254617916048', '2023-10-24', 267, 'VALID');
insert into cards (id, card_number, expiration_date, cvv, status) values (2, '6763723053549489', '2020-03-13', 132, 'LOST');
insert into cards (id, card_number, expiration_date, cvv, status) values (3, '201769234470125', '2024-07-04', 330, 'LOST');
insert into cards (id, card_number, expiration_date, cvv, status) values (4, '677186283379576', '2024-01-12', 240, 'VALID');
insert into cards (id, card_number, expiration_date, cvv, status) values (5, '201605295316494', '2024-03-20', 458, 'VALID');
insert into cards (id, card_number, expiration_date, cvv, status) values (6, '370471183545412', '2023-11-25', 815, 'VALID');
insert into cards (id, card_number, expiration_date, cvv, status) values (7, '5100170597039386', '2024-03-27', 328, 'LOST');
insert into cards (id, card_number, expiration_date, cvv, status) values (8, '3547582720629394', '2023-11-27', 844, 'VALID');
insert into cards (id, card_number, expiration_date, cvv, status) values (9, '5602259261304134', '2023-09-04', 787, 'VALID');
insert into cards (id, card_number, expiration_date, cvv, status) values (10, '561018629608363', '2023-12-12', 721, 'LOST');

-- Preload accounts table
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (1, 5203, '2022-10-28', 'Felix Cousens', 'VALID', 1, 1);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (2, 3393, '2023-04-19', 'Basile Struther', 'VALID', 2, 2);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (3, 7238, '2022-09-21', 'Robinett Syne', 'VALID', 3, 3);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (4, 3957, '2022-10-06', 'Elle Oscroft', 'VALID', 4, 4);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (5, 5090, '2022-09-03', 'Gerick Cyster', 'VALID', 5, 5);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (6, 8498, '2023-02-19', 'Moll Escalero', 'VALID', 6, 6);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (7, 7375, '2022-11-24', 'Aloysius Novis', 'VALID', 7, 7);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (8, 7510, '2022-11-18', 'Ezmeralda Pimb', 'VALID', 8, 8);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (9, 4119, '2023-07-19', 'Stanford Oxe', 'VALID', 9, 9);
insert into accounts (id, balance, account_open_date, account_holder_name, account_status, card_id, user_id) values (10, 5205, '2023-02-26', 'Zabrina Habbijam', 'VALID', 10, 10);