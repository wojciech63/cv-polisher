CREATE TABLE work_experience (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    job_title VARCHAR(255) NOT NULL,
    company VARCHAR(255) NOT NULL,
    start_date DATE,
    end_date DATE,
    location VARCHAR(255),
    description TEXT,
    contact_info_id BIGINT NOT NULL,

    CONSTRAINT fk_work_experience_contact_info
        FOREIGN KEY (contact_info_id) REFERENCES contact_info(id)
        ON DELETE RESTRICT
);