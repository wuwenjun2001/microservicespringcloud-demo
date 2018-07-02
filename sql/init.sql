创建库：cloudDB01，cloudDB02，cloudDB03 使用utf8字符集

建表：
create table dept
(
	deptno BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	dname VARCHAR(60),
	db_source VARCHAR(60)
);

插入数据：
insert into dept(dname, db_source) values('开发部', DATABASE());
insert into dept(dname, db_source) values('人事部', DATABASE());
insert into dept(dname, db_source) values('财务部', DATABASE());
insert into dept(dname, db_source) values('市场部', DATABASE());
insert into dept(dname, db_source) values('运维部', DATABASE());