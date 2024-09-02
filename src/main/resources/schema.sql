DROP TABLE IF EXISTS TB_USER;
DROP TABLE IF EXISTS TB_POST;
DROP TABLE IF EXISTS TB_COMMENT;
DROP TABLE IF EXISTS TB_POST_LIKE;

CREATE TABLE TB_USER
(
    id bigint AUTO_INCREMENT PRIMARY KEY,
    login_id varchar(10) NOT NULL,
    pw varchar(20) NOT NULL,
    email varchar(20) NOT NULL,
    nickname varchar(10) NOT NULL
);

CREATE TABLE TB_POST
(
    id bigint AUTO_INCREMENT PRIMARY KEY ,
    user_id bigint NOT NULL ,
    title varchar(50) NOT NULL,
    content varchar(4000) NOT NULL ,
    status varchar(20) NOT NULL ,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES TB_USER(id)
);

CREATE TABLE TB_COMMENT
(
    id bigint AUTO_INCREMENT PRIMARY KEY ,
    user_id bigint NOT NULL ,
    post_id bigint NOT NULL ,
    comment varchar(200) NOT NULL ,
    status varchar(20) NOT NULL ,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES TB_USER(id),
    FOREIGN KEY (post_id) REFERENCES TB_POST(id)
);

CREATE TABLE TB_POST_LIKE
(
    id bigint AUTO_INCREMENT PRIMARY KEY ,
    user_id bigint NOT NULL ,
    post_id bigint NOT NULL ,
    FOREIGN KEY (user_id) REFERENCES TB_USER(id),
    FOREIGN KEY (post_id) REFERENCES TB_POST(id)
);

