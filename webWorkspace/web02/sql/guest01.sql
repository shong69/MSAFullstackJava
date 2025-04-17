drop table quest01;
drop sequence guest01_seq;

create sequence guest_seq;


create table guest01(
	idx number primary key,
	writer varchar2(15) not null,
	content varchar2(2000)
);