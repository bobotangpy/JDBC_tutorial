CREATE TABLE course (
    course_id int AUTO_INCREMENT NOT NULL,
    title varchar(88) NOT NULL,
    description varchar(500) NOT NULL ,
    link varchar(255) NOT NULL,
    CONSTRAINT pk_course_course_id PRIMARY KEY (course_id)
);