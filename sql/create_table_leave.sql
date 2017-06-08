create table leave_apply(
leave_number INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
person_id varchar(20) NOT NULL,
person_name varchar(20) NOT NULL,
leave_information varchar(140) NOT NULL,
leave_permission varchar(20),
commitor_name varchar(20),
commitor_id varchar(20)
)
