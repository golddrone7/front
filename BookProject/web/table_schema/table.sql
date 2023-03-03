select * from member;
select * from bookshop;

drop table member purge;
drop table bookshop CASCADE CONSTRAINTS;

create table member (
	USERID VARCHAR2(8) PRIMARY KEY,
	USERPWD VARCHAR2(10) NOT NULL
)

insert into member values ('candy', '1234');
insert into member values ('admin', '5678');

create table bookshop(
	ISBN VARCHAR2(15) PRIMARY KEY,
	TITLE VARCHAR2(50) NOT NULL,
	AUTHOR VARCHAR2(10) NOT NULL,
	COMPANY VARCHAR2(50),
	PRICE NUMBER
)

insert into bookshop values('88-90-11', '오라클3일완성', '이오라', '야메루출판사', '15000');
insert into bookshop values('90-10-12', 'jsp달인되기', '송JP', '공갈닷컴', '20000');
insert into bookshop values('87-90-33', '자바무따기', '김자바', '디지털박스', '35000');

