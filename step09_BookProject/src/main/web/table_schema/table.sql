drop table users purge
--primary key : unique + not null
create table member4(
userid varchar2(8) primary key,
userpwd varchar2(10) not null
);  

insert into member4(userid,userpwd) values('candy','1234');
insert into member4(userid,userpwd) values('admin','5678');
commit

select * from member4;
-------------------------------------------------
create table bookshop4(
isbn varchar2(15) primary key,   --우리나라 13, 미국10자리 isbn 출판사 책 고유번호
title varchar2(50) not null,  --사원이름
author varchar2(10) ,          --연락처
company varchar2(50),
price number
);          --부서명

insert into bookshop4 values();
insert into bookshop4 values();
insert into bookshop4 values();



--시퀀스만들기
create sequence seq_eno increment by 1 start with 1
nocycle nocache;

select * from emp;

select * from tab;      --테이블목록확이
drop table emp purge;   --휴지통에 넣지 않고 바로 삭제
drop table emp;         --emp테이블 삭제 
drop table dept;
purge recyclebin;       --휴지통비우기

select * from emp;


update emp set phone='333', dept='삼족오' where eno=1
















