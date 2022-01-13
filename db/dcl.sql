-- db 생성
create database webdb;

-- user 생성
create user 'webdb'@'localhost' identified by 'webdb';

-- 권한 부여
grant all privileges on webdb.* to 'webdb'@'localhost';

show tables;
desc emaillist;

-- create
insert into emaillist values(null, '둘', '리', 'dooly@gmail.com');
insert into emaillist values(null, '루', '피', 'luffy@gmail.com');

-- read
-- select * from emaillist 이렇게 쓰면 메모리 낭비 심함 -> 욕먹음
select no, first_name, last_name, email from emaillist order by no desc;