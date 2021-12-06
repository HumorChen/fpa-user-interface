create database `user` default character set utf8mb4 COLLATE utf8mb4_unicode_ci;
use user;
create table `t_user` (
id int auto_increment primary key comment 'ID',
phone char(11) not null unique comment '手机号码',
nickname varchar(12) not null comment '用户昵称',
password char(32) not null comment '密码摘要',
register_time datetime not null comment '注册时间',
real_name varchar(8) default '' comment '真实姓名',
gender int default 0 comment '性别',
idcard char(18) comment '身份证号码',
address varchar(128) default '' comment '联系地址',
birthday date comment '生日',
sign varchar(512) default '' comment '个性签名',
email varchar(64) default '' comment '邮箱',
qq varchar(11) default '' comment 'QQ号',
wechat varchar(32) default '' comment '微信号',
school_name varchar(64) default '' comment '学校名称',
last_online_time datetime default now() comment '最后登录时间',
last_online_ip varchar(16) default '' comment '最后登录IP地址',
state int default 0 comment '账号状态',
role int default 0 comment '账号类型',
index index_nickname (nickname),
index index_register_time (register_time),
index index_last_online_time (last_online_time)
)comment '用户表';