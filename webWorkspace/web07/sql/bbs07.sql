create table bbs07(
    num number primary key,
    sub varchar2(30),
    content varchar2(2000),
    id varchar2(16),
    nalja date
);
create sequence bbs07_seq;
insert into bbs07 values (bbs07_seq.nextval,'test1','test','tester',sysdate);
insert into bbs07 values (bbs07_seq.nextval,'test2','test','tester',sysdate);
insert into bbs07 values (bbs07_seq.nextval,'test3','test','tester',sysdate);
insert into bbs07 values (bbs07_seq.nextval,'test4','test','tester',sysdate);
insert into bbs07 values (bbs07_seq.nextval,'test5','test','tester',sysdate);
commit;
select * from bbs07 order by num desc;