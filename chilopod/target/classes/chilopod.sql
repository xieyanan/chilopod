/**
 * 创建用户表
 */
create table t_sys_user(
   id varchar(32) primary key comment '主键',
   username varchar(255) comment '用户名',
   password varchar(255) comment '密码',
   usernick varchar(255) comment '',
   description text comment'用户描述'
);