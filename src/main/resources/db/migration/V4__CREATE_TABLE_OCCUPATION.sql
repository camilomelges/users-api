CREATE TABLE occupation
(
    id  serial PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);