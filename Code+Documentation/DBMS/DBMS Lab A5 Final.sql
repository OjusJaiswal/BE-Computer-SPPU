create table Borrower(
Rollno number(20),
B_Name varchar(20),
DateOfIssue date,
NameOfBook varchar(20),
Status varchar(20)
);

insert into Borrower values(101,'PQR','09 Oct 2021','TOC','Issued');
insert into Borrower values(102,'ABC','03 Aug 2021','DM','Issued');
insert into Borrower values(103,'XYZ','01 Sep 2021','CN','Issued');

select * from Borrower;

create table Fine(
Rollno number(20),
Curr_Date date,
Amt number(20)
);

