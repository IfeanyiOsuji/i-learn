create database ile_iwedb;
create user 'school_user'@'localhost'identified by 'iwe123';
grant all privileges on ile_iwedb.* to 'school_user'@'localhost';
flush privileges ;