DROP TABLE IF EXISTS students;

CREATE TABLE students (
                          id INTEGER PRIMARY KEY AUTOINCREMENT,
                          last_name TEXT NOT NULL,
                          first_name TEXT NOT NULL,
                          middle_name TEXT,
                          birth_date TEXT NOT NULL,
                          record_book_number TEXT UNIQUE NOT NULL
);

INSERT INTO students (last_name, first_name, middle_name, birth_date, record_book_number) VALUES
                                                                                              ('Петров', 'Іван', 'Сергійович', '2000-01-15', 'RB001'),
                                                                                              ('Іваненко', 'Марія', 'Василівна', '1999-02-20', 'RB002'),
                                                                                              ('Коваль', 'Олександр', 'Миколайович', '2001-03-10', 'RB003'),
                                                                                              ('Сидорчук', 'Наталія', 'Ігорівна', '1998-04-25', 'RB004'),
                                                                                              ('Мельник', 'Андрій', 'Олегович', '2000-05-05', 'RB005'),
                                                                                              ('Гаврилюк', 'Олена', 'Петрівна', '1997-07-12', 'RB006'),
                                                                                              ('Дмитренко', 'Сергій', 'Андрійович', '2001-08-18', 'RB007'),
                                                                                              ('Федоренко', 'Віктор', 'Іванович', '1999-09-30', 'RB008'),
                                                                                              ('Лисенко', 'Ірина', 'Михайлівна', '2000-10-10', 'RB009'),
                                                                                              ('Кравчук', 'Павло', 'Васильович', '1998-11-21', 'RB010'),
                                                                                              ('Шевченко', 'Василь', 'Григорович', '1997-12-01', 'RB011');
