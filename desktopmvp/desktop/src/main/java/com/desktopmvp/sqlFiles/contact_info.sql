CREATE TABLE contact_info (
id BIGINT AUTO_INCREMENT PRIMARY KEY,

full_name VARCHAR(255) NOT NULL,
email VARCHAR(255) UNIQUE,
phone_number VARCHAR(15),
location TEXT,
picture_url TEXT,
description TEXT,
linkedin_url TEXT,
github_url TEXT,
any_url TEXT
);

