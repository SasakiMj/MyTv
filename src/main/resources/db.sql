create table tv_station(id int primary key AUTOINCREMENT, name varchar(16), owner varchar(32));
create table program_table(id int primary key AUTOINCREMENT, tv_station int, name varchar(512), airtime time, week int);