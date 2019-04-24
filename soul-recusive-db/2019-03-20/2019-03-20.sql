-- auto-generated definition
create table T_BASE_USER
(
  ID          bigint auto_increment primary key,
  user_name   varchar(40)  null,
  pass_word   varchar(40)  null,
  STATUS      varchar(10)  null,
  LAST_LOGIN  timestamp    null on update CURRENT_TIMESTAMP,
  CREATE_TIME timestamp    null on update CURRENT_TIMESTAMP,
  UPDATE_TIME timestamp    null on update CURRENT_TIMESTAMP,
  EMAIL       varchar(100) null,
  NAME        varchar(40)  null,
  user_desc   varchar(64)  null,
  PHONE       varchar(20)  null,
  SEX         tinyint(1)   null,
  constraint UNIQ_PHONE
    unique (PHONE)
);

-- auto-generated definition
create table T_PERMISSION
(
  TYPE            varchar(20) null,
  PARENT_ID       bigint      null,
  PERMISSION_NAME varchar(40) null,
  NAME            varchar(40) null,
  ID              bigint auto_increment primary key
);

-- auto-generated definition
create table T_ROLE
(
  STATUS      varchar(20) null,
  CREATE_TIME timestamp   null on update CURRENT_TIMESTAMP,
  ROLE_DESC   varchar(80) null,
  NAME        varchar(40) null,
  ID          bigint auto_increment primary key
);

-- auto-generated definition
create table T_ROLE_PERMISSION
(
  STATUS        varchar(20) null,
  PERMISSION_ID bigint      null,
  ROLE_ID       bigint      null,
  ID            bigint auto_increment primary key
);

-- auto-generated definition
create table T_USER_ROLE
(
  ROLE_ID bigint null,
  USER_ID bigint null,
  ID      bigint auto_increment primary key
);



