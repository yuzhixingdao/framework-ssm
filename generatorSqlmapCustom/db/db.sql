drop table if exists sys_dict;

/*==============================================================*/
/* Table: sys_dict                                              */
/*==============================================================*/
create table sys_dict
(
   id                   bigint not null auto_increment comment '编号',
   dict_label           varchar(100) comment '标签名',
   dict_value           varchar(100) comment '数据值',
   dict_type            varchar(100) comment '类型',
   description          varchar(100) comment '描述',
   dict_sort            int comment '排序（升序）',
   create_by            varchar(64) comment '创建者',
   create_date          datetime comment '创建时间',
   update_by            varchar(64) comment '更新者',
   update_date          datetime comment '更新时间',
   remarks              varchar(255) comment '备注信息',
   del_flag             char default '0' comment '删除标记',
   primary key (id)
);

alter table sys_dict comment '字典表';
