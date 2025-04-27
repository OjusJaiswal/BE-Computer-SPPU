CREATE TABLE Student(
StudRoll number(10),
StudAtt number(10),
Status varchar(20)
);

insert into Student values (1,75,'D');
insert into Student values (2,46,'D');
insert into Student values (3,95,'D');
insert into Student values (4,78,'D');

select * from Student;

DECLARE
mroll number(10);
matt number(10);
BEGIN
mroll:=&mroll;
select StudAtt into matt from Student where StudRoll=mroll;
if matt < 75 then
dbms_output.put_line(mroll||'Term Not Granted');
update Student set Status='D' where StudRoll=mroll;
else
dbms_output.put_line(mroll||'Term Granted');
update Student set Status='ND' where StudRoll=mroll;
end if;
EXCEPTION
when no_data_found then
dbms_output.put_line(mroll||'Not Found');
END;

select * from Student;