create table employeeDB4(
empNO int primary key,
lastname varchar2(10),
firstname varchar2(10), 
dept varchar2(4),
designation varchar2(7) 
);

insert into employeeDB4 values (1,'gangrade','gaurav','comp','student');
insert into employeeDB4 values (2,'dwivedi','anirudh','comp','student');
insert into employeeDB4 values (3,'gaur','abhay','comp','student');

create table employee_audit4(
employeeNumber int not null,
lastname varchar2(10) not null,
changedat date,
action varchar2(10)
);

create or replace trigger employeeDB4_update
before update on employeeDB4
for each row
begin
insert into employee_audit4 values
(:old.empNo,:old.lastname,sysdate, 'update');
end;
/

update employeeDB4 set lastname='Trivedi' where empNo=2;

select * from employee_audit4;

create or replace trigger employeeDB4_insert
after insert on employeeDB4
for each row
begin
insert into employee_audit4 values
(:new.empNo,
:new.lastname,
sysdate
,'insert');
end;
/

insert into employeeDB4 values(4,'chourasia','swati','comp','assp');

select * from employee_audit4;

create or replace trigger employeeDB4_delete
before delete on employeeDB4
for each row
begin
insert into employee_audit4 values
(:old.empNo,
:old.lastname,
sysdate,
'delete');
end;
/

delete employeeDB4 where lastname='chourasia';

select * from employee_audit4;

update employeeDB4 set lastname='gangrade' where empNo=1;

select * from employee_audit4;