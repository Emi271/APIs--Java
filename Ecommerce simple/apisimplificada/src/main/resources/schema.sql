CREATE TABLE categoria (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DOUBLE,
    categoria_id BIGINT,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);
