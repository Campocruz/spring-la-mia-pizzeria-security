-- -- Creazione della tabella (se non esiste già)
-- CREATE TABLE IF NOT EXISTS pizze (
--     id INT PRIMARY KEY,
--     nome_pizza VARCHAR(100) NOT NULL,
--     descrizione TEXT
-- );

-- Inserimento dei 20 record
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (1, 'Margherita', 'Pomodoro, mozzarella fior di latte, basilico fresco e olio extravergine.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (2, 'Marinara', 'Pomodoro, aglio, origano e olio extravergine.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (3, 'Diavola', 'Pomodoro, mozzarella e salame piccante.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (4, 'Quattro Stagioni', 'Pomodoro, mozzarella, carciofi, funghi, prosciutto cotto e olive.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (5, 'Quattro Formaggi', 'Mozzarella, gorgonzola, parmigiano reggiano e emmental.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (6, 'Capricciosa', 'Pomodoro, mozzarella, funghi, carciofi, olive nere e prosciutto cotto.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (7, 'Prosciutto e Funghi', 'Pomodoro, mozzarella, prosciutto cotto e funghi champignon.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (8, 'Napoletana', 'Pomodoro, mozzarella, acciughe, capperi e origano.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (9, 'Ortolana', 'Pomodoro, mozzarella, zucchine, melanzane e peperoni grigliati.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (10, 'Tonno e Cipolla', 'Pomodoro, mozzarella, tonno e cipolla rossa di Tropea.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (11, 'Boscaiola', 'Pomodoro, mozzarella, salsiccia sbriciolata e funghi porcini.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (12, 'Salsiccia e Friarielli', 'Mozzarella, salsiccia napoletana e friarielli saltati in padella.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (13, 'Parmigiana', 'Pomodoro, mozzarella, melanzane fritte e scaglie di parmigiano.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (14, 'Hawaii', 'Pomodoro, mozzarella, prosciutto cotto e ananas.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (15, 'Frutti di Mare', 'Pomodoro, mozzarella, gamberi, cozze, calamari e prezzemolo.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (16, 'BBQ Chicken', 'Mozzarella, pollo grigliato, bacon croccante e salsa barbecue.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (17, 'Carbonara', 'Mozzarella, crema di uova, guanciale croccante, pecorino e pepe nero.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (18, 'Tartufata', 'Mozzarella, funghi porcini e crema di tartufo nero.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (19, 'Vegetariana', 'Pomodoro, mozzarella e misto di verdure grigliate di stagione.');
-- INSERT INTO pizzas (id, nome_pizza, descrizione) VALUES (20, 'Bufala', 'Pomodoro, mozzarella di bufala campana DOP, basilico e olio a crudo.');




-- -- Inserimento dei 20 record
-- INSERT INTO pizzas (id, nome_pizza, descrizione, url_foto, prezzo) VALUES 
-- (1, 'Margherita', 'Pomodoro, mozzarella fior di latte, basilico fresco e olio extravergine.', 'https://esempio.com/img/margherita.jpg', 7.00),
-- (2, 'Marinara', 'Pomodoro, aglio, origano e olio extravergine.', 'https://esempio.com/img/marinara.jpg', 6.00),
-- (3, 'Diavola', 'Pomodoro, mozzarella e salame piccante.', 'https://esempio.com/img/diavola.jpg', 8.50),
-- (4, 'Quattro Stagioni', 'Pomodoro, mozzarella, carciofi, funghi, prosciutto cotto e olive.', 'https://esempio.com/img/quattro-stagioni.jpg', 9.50),
-- (5, 'Quattro Formaggi', 'Mozzarella, gorgonzola, parmigiano reggiano e emmental.', 'https://esempio.com/img/quattro-formaggi.jpg', 9.00),
-- (6, 'Capricciosa', 'Pomodoro, mozzarella, funghi, carciofi, olive nere e prosciutto cotto.', 'https://esempio.com/img/capricciosa.jpg', 9.50),
-- (7, 'Prosciutto e Funghi', 'Pomodoro, mozzarella, prosciutto cotto e funghi champignon.', 'https://esempio.com/img/prosciutto-funghi.jpg', 8.50),
-- (8, 'Napoletana', 'Pomodoro, mozzarella, acciughe, capperi e origano.', 'https://esempio.com/img/napoletana.jpg', 8.00),
-- (9, 'Ortolana', 'Pomodoro, mozzarella, zucchine, melanzane e peperoni grigliati.', 'https://esempio.com/img/ortolana.jpg', 9.00),
-- (10, 'Tonno e Cipolla', 'Pomodoro, mozzarella, tonno e cipolla rossa di Tropea.', 'https://esempio.com/img/tonno-cipolla.jpg', 9.00),
-- (11, 'Boscaiola', 'Pomodoro, mozzarella, salsiccia sbriciolata e funghi porcini.', 'https://esempio.com/img/boscaiola.jpg', 10.00),
-- (12, 'Salsiccia e Friarielli', 'Mozzarella, salsiccia napoletana e friarielli saltati in padella.', 'https://esempio.com/img/salsiccia-friarielli.jpg', 10.00),
-- (13, 'Parmigiana', 'Pomodoro, mozzarella, melanzane fritte e scaglie di parmigiano.', 'https://esempio.com/img/parmigiana.jpg', 9.50),
-- (14, 'Hawaii', 'Pomodoro, mozzarella, prosciutto cotto e ananas.', 'https://esempio.com/img/hawaii.jpg', 9.00),
-- (15, 'Frutti di Mare', 'Pomodoro, mozzarella, gamberi, cozze, calamari e prezzemolo.', 'https://esempio.com/img/frutti-di-mare.jpg', 12.00),
-- (16, 'BBQ Chicken', 'Mozzarella, pollo grigliato, bacon croccante e salsa barbecue.', 'https://esempio.com/img/bbq-chicken.jpg', 10.50),
-- (17, 'Carbonara', 'Mozzarella, crema di uova, guanciale croccante, pecorino e pepe nero.', 'https://esempio.com/img/carbonara.jpg', 10.00),
-- (18, 'Tartufata', 'Mozzarella, funghi porcini e crema di tartufo nero.', 'https://esempio.com/img/tartufata.jpg', 13.50),
-- (19, 'Vegetariana', 'Pomodoro, mozzarella e misto di verdure grigliate di stagione.', 'https://esempio.com/img/vegetariana.jpg', 9.00),
-- (20, 'Bufala', 'Pomodoro, mozzarella di bufala campana DOP, basilico e olio a crudo.', 'https://esempio.com/img/bufala.jpg', 11.00);




-- Inserimento dei 20 record
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES 
-- (1, 7.00, 'Pomodoro, mozzarella fior di latte, basilico fresco e olio extravergine.', 'Margherita', 'https://esempio.com/img/margherita.jpg'),
-- (2, 6.00, 'Pomodoro, aglio, origano e olio extravergine.', 'Marinara', 'https://esempio.com/img/marinara.jpg'),
-- (3, 8.50, 'Pomodoro, mozzarella e salame piccante.', 'Diavola', 'https://esempio.com/img/diavola.jpg'),
-- (4, 9.50, 'Pomodoro, mozzarella, carciofi, funghi, prosciutto cotto e olive.', 'Quattro Stagioni', 'https://esempio.com/img/quattro-stagioni.jpg'),
-- (5, 9.00, 'Mozzarella, gorgonzola, parmigiano reggiano e emmental.', 'Quattro Formaggi', 'https://esempio.com/img/quattro-formaggi.jpg'),
-- (6, 9.50, 'Pomodoro, mozzarella, funghi, carciofi, olive nere e prosciutto cotto.', 'Capricciosa', 'https://esempio.com/img/capricciosa.jpg'),
-- (7, 8.50, 'Pomodoro, mozzarella, prosciutto cotto e funghi champignon.', 'Prosciutto e Funghi', 'https://esempio.com/img/prosciutto-funghi.jpg'),
-- (8, 8.00, 'Pomodoro, mozzarella, acciughe, capperi e origano.', 'Napoletana', 'https://esempio.com/img/napoletana.jpg'),
-- (9, 9.00, 'Pomodoro, mozzarella, zucchine, melanzane e peperoni grigliati.', 'Ortolana', 'https://esempio.com/img/ortolana.jpg'),
-- (10, 9.00, 'Pomodoro, mozzarella, tonno e cipolla rossa di Tropea.', 'Tonno e Cipolla', 'https://esempio.com/img/tonno-cipolla.jpg'),
-- (11, 10.00, 'Pomodoro, mozzarella, salsiccia sbriciolata e funghi porcini.', 'Boscaiola', 'https://esempio.com/img/boscaiola.jpg'),
-- (12, 10.00, 'Mozzarella, salsiccia napoletana e friarielli saltati in padella.', 'Salsiccia e Friarielli', 'https://esempio.com/img/salsiccia-friarielli.jpg'),
-- (13, 9.50, 'Pomodoro, mozzarella, melanzane fritte e scaglie di parmigiano.', 'Parmigiana', 'https://esempio.com/img/parmigiana.jpg'),
-- (14, 9.00, 'Pomodoro, mozzarella, prosciutto cotto e ananas.', 'Hawaii', 'https://esempio.com/img/hawaii.jpg'),
-- (15, 12.00, 'Pomodoro, mozzarella, gamberi, cozze, calamari e prezzemolo.', 'Frutti di Mare', 'https://esempio.com/img/frutti-di-mare.jpg'),
-- (16, 10.50, 'Mozzarella, pollo grigliato, bacon croccante e salsa barbecue.', 'BBQ Chicken', 'https://esempio.com/img/bbq-chicken.jpg'),
-- (17, 10.00, 'Mozzarella, crema di uova, guanciale croccante, pecorino e pepe nero.', 'Carbonara', 'https://esempio.com/img/carbonara.jpg'),
-- (18, 13.50, 'Mozzarella, funghi porcini e crema di tartufo nero.', 'Tartufata', 'https://esempio.com/img/tartufata.jpg'),
-- (19, 9.00, 'Pomodoro, mozzarella e misto di verdure grigliate di stagione.', 'Vegetariana', 'https://esempio.com/img/vegetariana.jpg'),
-- (20, 11.00, 'Pomodoro, mozzarella di bufala campana DOP, basilico e olio a crudo.', 'Bufala', 'https://esempio.com/img/bufala.jpg');


-- Inserimento dei record (uno per riga)
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (1, 7.00, 'Pomodoro, mozzarella fior di latte, basilico fresco e olio extravergine.', 'Margherita', 'https://esempio.com/img/margherita.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (2, 6.00, 'Pomodoro, aglio, origano e olio extravergine.', 'Marinara', 'https://esempio.com/img/marinara.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (3, 8.50, 'Pomodoro, mozzarella e salame piccante.', 'Diavola', 'https://esempio.com/img/diavola.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (4, 9.50, 'Pomodoro, mozzarella, carciofi, funghi, prosciutto cotto e olive.', 'Quattro Stagioni', 'https://esempio.com/img/quattro-stagioni.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (5, 9.00, 'Mozzarella, gorgonzola, parmigiano reggiano e emmental.', 'Quattro Formaggi', 'https://esempio.com/img/quattro-formaggi.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (6, 9.50, 'Pomodoro, mozzarella, funghi, carciofi, olive nere e prosciutto cotto.', 'Capricciosa', 'https://esempio.com/img/capricciosa.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (7, 8.50, 'Pomodoro, mozzarella, prosciutto cotto e funghi champignon.', 'Prosciutto e Funghi', 'https://esempio.com/img/prosciutto-funghi.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (8, 8.00, 'Pomodoro, mozzarella, acciughe, capperi e origano.', 'Napoletana', 'https://esempio.com/img/napoletana.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (9, 9.00, 'Pomodoro, mozzarella, zucchine, melanzane e peperoni grigliati.', 'Ortolana', 'https://esempio.com/img/ortolana.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (10, 9.00, 'Pomodoro, mozzarella, tonno e cipolla rossa di Tropea.', 'Tonno e Cipolla', 'https://esempio.com/img/tonno-cipolla.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (11, 10.00, 'Pomodoro, mozzarella, salsiccia sbriciolata e funghi porcini.', 'Boscaiola', 'https://esempio.com/img/boscaiola.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (12, 10.00, 'Mozzarella, salsiccia napoletana e friarielli saltati in padella.', 'Salsiccia e Friarielli', 'https://esempio.com/img/salsiccia-friarielli.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (13, 9.50, 'Pomodoro, mozzarella, melanzane fritte e scaglie di parmigiano.', 'Parmigiana', 'https://esempio.com/img/parmigiana.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (14, 9.00, 'Pomodoro, mozzarella, prosciutto cotto e ananas.', 'Hawaii', 'https://esempio.com/img/hawaii.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (15, 12.00, 'Pomodoro, mozzarella, gamberi, cozze, calamari e prezzemolo.', 'Frutti di Mare', 'https://esempio.com/img/frutti-di-mare.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (16, 10.50, 'Mozzarella, pollo grigliato, bacon croccante e salsa barbecue.', 'BBQ Chicken', 'https://esempio.com/img/bbq-chicken.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (17, 10.00, 'Mozzarella, crema di uova, guanciale croccante, pecorino e pepe nero.', 'Carbonara', 'https://esempio.com/img/carbonara.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (18, 13.50, 'Mozzarella, funghi porcini e crema di tartufo nero.', 'Tartufata', 'https://esempio.com/img/tartufata.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (19, 9.00, 'Pomodoro, mozzarella e misto di verdure grigliate di stagione.', 'Vegetariana', 'https://esempio.com/img/vegetariana.jpg');
-- INSERT INTO pizzas (id, prezzo, descrizione, nome_pizza, url_foto) VALUES (20, 11.00, 'Pomodoro, mozzarella di bufala campana DOP, basilico e olio a crudo.', 'Bufala', 'https://esempio.com/img/bufala.jpg');

INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (1, 'Margherita', 'La regina delle pizze napoletane, semplice e intramontabile.', 6.50, 'https://commons.wikimedia.org/wiki/Special:FilePath/Eq_it-na_pizza-margherita_sep2005_sml.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (2, 'Marinara', 'La pizza più antica di Napoli, senza formaggio e profumatissima.', 5.50, 'https://commons.wikimedia.org/wiki/Special:FilePath/Pizza_marinara.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (3, 'Diavola', 'Per chi ama i sapori decisi e un pizzico di piccante.', 8.00, 'https://commons.wikimedia.org/wiki/Special:FilePath/Pizza_Diavola_%40_Pizzeria_Da_Zero_%40_Milan_(50116096472).jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (4, 'Quattro formaggi', 'Bianca e cremosa, un abbraccio di formaggi filanti.', 9.00, 'https://commons.wikimedia.org/wiki/Special:FilePath/Pizza_quattro_formaggi_at_restaurant,_Chalk_Farm_Road,_London.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (5, 'Quattro stagioni', 'Quattro spicchi, uno per ogni stagione dell''anno.', 9.50, 'https://commons.wikimedia.org/wiki/Special:FilePath/Pizza_quattro_stagioni.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (6, 'Capricciosa', 'Nata a Roma nel 1937, ricca e saporita.', 9.50, 'https://commons.wikimedia.org/wiki/Special:FilePath/Pizza_food.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (7, 'Prosciutto e funghi', 'Un grande classico che mette tutti d''accordo.', 8.50, 'https://commons.wikimedia.org/wiki/Special:FilePath/Pizza_prosciutto_e_funghi,_Edingen.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (8, 'Vegetariana', 'Tante verdure grigliate per una pizza leggera e colorata.', 8.50, 'https://commons.wikimedia.org/wiki/Special:FilePath/Vegetarian_Pizza.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (9, 'Zucchine e provola', 'Pizza bianca dal gusto delicato con una nota affumicata.', 8.00, 'https://commons.wikimedia.org/wiki/Special:FilePath/Pizza_with_zucchini.jpg?width=800');
INSERT INTO pizzas (id, nome_pizza, descrizione, prezzo, url_foto) VALUES (10, 'Bufalina', 'Margherita con mozzarella di bufala aggiunta a crudo.', 8.50, 'https://commons.wikimedia.org/wiki/Special:FilePath/Eq_it-na_pizza-margherita_sep2005_sml.jpg?width=800');
INSERT INTO ingredients (id, name) VALUES (1, 'Pomodoro');
INSERT INTO ingredients (id, name) VALUES (2, 'Mozzarella fiordilatte');
INSERT INTO ingredients (id, name) VALUES (3, 'Basilico');
INSERT INTO ingredients (id, name) VALUES (4, 'Olio extravergine d''oliva');
INSERT INTO ingredients (id, name) VALUES (5, 'Aglio');
INSERT INTO ingredients (id, name) VALUES (6, 'Origano');
INSERT INTO ingredients (id, name) VALUES (7, 'Salame piccante');
INSERT INTO ingredients (id, name) VALUES (8, 'Gorgonzola');
INSERT INTO ingredients (id, name) VALUES (9, 'Fontina');
INSERT INTO ingredients (id, name) VALUES (10, 'Parmigiano Reggiano');
INSERT INTO ingredients (id, name) VALUES (11, 'Prosciutto cotto');
INSERT INTO ingredients (id, name) VALUES (12, 'Funghi champignon');
INSERT INTO ingredients (id, name) VALUES (13, 'Carciofini');
INSERT INTO ingredients (id, name) VALUES (14, 'Olive nere');
INSERT INTO ingredients (id, name) VALUES (15, 'Zucchine');
INSERT INTO ingredients (id, name) VALUES (16, 'Melanzane');
INSERT INTO ingredients (id, name) VALUES (17, 'Peperoni');
INSERT INTO ingredients (id, name) VALUES (18, 'Cipolla rossa');
INSERT INTO ingredients (id, name) VALUES (19, 'Provola affumicata');
INSERT INTO ingredients (id, name) VALUES (20, 'Mozzarella di bufala');
INSERT INTO offers (id, title, description, rate, start_offer, end_offer, pizza_id) VALUES (1, 'Ottobre piccante', 'Sconto sulla Diavola per tutto il mese di ottobre.', 20, '2026-10-01', '2026-10-31', 3);
INSERT INTO offers (id, title, description, rate, start_offer, end_offer, pizza_id) VALUES (2, 'Margherita day', 'Ogni giorno la Margherita a prezzo speciale.', 15, '2026-10-01', '2026-11-30', 1);
INSERT INTO offers (id, title, description, rate, start_offer, end_offer, pizza_id) VALUES (3, 'Autunno nel bosco', 'Offerta stagionale su prosciutto e funghi.', 10, '2026-10-15', '2026-11-15', 7);
