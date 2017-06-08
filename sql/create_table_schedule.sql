create table schedule(
course_number INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
course_id varchar(20) NOT NULL,
course_name varchar(25) NOT NULL,
person_id varchar(20) NOT NULL,
person_name varchar(20) NOT NULL,
course_stu_num int UNSIGNED NOT NULL,
course_cycle varchar(5),
course_period varchar(15),
course_date varchar(30),
course_location varchar(15),
course_department varchar(20) NOT NULL
)