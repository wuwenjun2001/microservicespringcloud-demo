�����⣺cloudDB01��cloudDB02��cloudDB03 ʹ��utf8�ַ���

����
create table dept
(
	deptno BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	dname VARCHAR(60),
	db_source VARCHAR(60)
);

�������ݣ�
insert into dept(dname, db_source) values('������', DATABASE());
insert into dept(dname, db_source) values('���²�', DATABASE());
insert into dept(dname, db_source) values('����', DATABASE());
insert into dept(dname, db_source) values('�г���', DATABASE());
insert into dept(dname, db_source) values('��ά��', DATABASE());