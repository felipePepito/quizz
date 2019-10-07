#CREATE DATABASE quizz;
#CREATE USER 'quizz'@'localhost' IDENTIFIED BY 'quizz';
# Passwort ist automatisch 'quizz'
#GRANT ALL PRIVILEGES ON quizz.* TO 'quizz'@'localhost';
#FLUSH PRIVILEGES;


#ALTER DATABASE quizz CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

create table land (
  id int not null auto_increment primary key,
  name varchar(255),
  einwohnerzahl bigint,
  idhauptstadt int
);

create table hauptstadt (
  id int not null auto_increment primary key,
  name varchar(255),
  einwohnerzahl bigint,
  idland int
);

alter table land
add foreign key (idhauptstadt) references hauptstadt(id);

alter table hauptstadt
add foreign key (idland) references land(id);

insert into land values ('Deutschland', 85000000, 1);

insert into hauptstadt values ('Berlin', 3400000, 1);
