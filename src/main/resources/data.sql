CREATE TABLE IF NOT EXISTS products (
                                        id    BIGSERIAL PRIMARY KEY,
                                        name  VARCHAR(255) NOT NULL,
                                        price NUMERIC(19,2) NOT NULL
);

INSERT INTO products (name, price) VALUES
                                       ('Book', 500),
                                       ('Phone', 30000),
                                       ('Laptop', 100000),
                                       ('Mouse', 1500),
                                       ('Keyboard', 4000);