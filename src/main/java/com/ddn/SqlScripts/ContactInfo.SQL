create TABLE person (
id SERIAL,
firstNm varchar(100),
lastNm varchar(100),
middleNm varchar(100)
);

GRANT ALL ON DATABASE anyapp TO postgres;

select * from person