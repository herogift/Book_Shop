2022/3/21
前端显示界面是在网上找的静态模板，然后把html文件改成jsp
目前缺陷：
1 数据库中书的数量不够
2 订单模块未实现
3 没有给用户初始金额

数据库说明：
create table user   //用户表
(
    ID           varchar(32)  not null comment '用户id 唯一、主键',
    Nickname     varchar(30)  not null comment '用户昵称',
    Password     varchar(20)  not null comment '密码',
    Sex          varchar(1)   not null comment '性别',
    Birthday     datetime     null comment '出生日期，用于年龄检测等,默认为空',
    Idenity_Code varchar(60)  null comment '拓展字段，默认空',
    Email        varchar(60)  null comment '邮箱',
    Phone        varchar(11)  null comment '手机号',
    Address      varchar(200) not null comment '收货地址',
    Status       decimal(6)   not null comment '权限，1或2（管理员）',
    constraint User_ID_uindex
        unique (ID)
)
    comment '
';

alter table user
    add primary key (ID);

create table category  //书籍分类表
(
    c_ID   int auto_increment,
    c_Name varchar(20) not null comment '分类名称',
    c_PID  decimal     not null comment '找父亲id，可以快速知道当前分类下子分类',
    constraint category_c_id_uindex
        unique (c_ID)
);

alter table category
    add primary key (c_ID);

create table book   //书籍表
(
    b_ID       int auto_increment
        primary key,
    b_Name     varchar(128)   not null,
    b_Desc     varchar(512)   null,
    b_Price    decimal(10, 2) not null,
    b_Stock    decimal        null,
    b_FID      decimal        null,
    b_CID      decimal        null,
    b_FileName varchar(200)   null
);


create table cart   //购物车表
(
    c_ID       int auto_increment,
    c_FileName varchar(128) null,
    c_Name     varchar(64)  null,
    c_Price    int          null,
    c_Num      int          null,
    c_Stock    int          null,
    c_BID      int          null,
    c_UID      varchar(32)  null,
    c_Valid    int          null,
    constraint cart_c_ID_uindex
        unique (c_ID)
);

alter table cart
    add primary key (c_ID);
