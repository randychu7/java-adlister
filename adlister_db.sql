use adlister_db;


    create table users
    (
        id       INT UNSIGNED NOT NULL AUTO_INCREMENT,
        username VARCHAR(50)  NOT NULL,
        email    VARCHAR(50)  NOT NULL,
        password VARCHAR(50)  NOT NULL,
        PRIMARY KEY (id)
    );

    create table ads(
                        id  INT UNSIGNED NOT NULL AUTO_INCREMENT,
                        user_id  int unsigned  NOT NULL,
                        title VARCHAR(125) NOT NULL,
                        description   TEXT NOT NULL,
                        PRIMARY KEY (id),
                        FOREIGN KEY (user_id) references users(id)
    );

INSERT into users (username, email, password) values ('bob', 'bob1234@gmail.com', 'adasdw');
DELETE from ads;
