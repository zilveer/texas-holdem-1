drop table if exists spider_poker_info;

/*==============================================================*/
/* Table: spider_poker_info                                     */
/*==============================================================*/
create table spider_poker_info
(
   id                   int not null auto_increment,
   game_id              int,
   game_type            varchar(32) comment 'MTT
            SNG
            CASH',
   big_blind            decimal comment '大盲注 BB',
   small_blind          decimal comment '小盲注 sb',
   monetary_unit        varchar(16) comment 'USD RMB',
   game_time            timestamp comment '牌局时间',
   now_man              int comment '当前参与人数',
   max_man              int comment '最大参与人数',
   pot                  decimal comment '最终底池',
   blind_level          varchar(16) comment '盲注等级',
   buying               decimal comment '买入费用',
   flop                 varchar(32) comment '翻牌内容',
   turn                 varchar(32) comment '转牌内容',
   river                varchar(32) comment '河牌内容',
   over_street          varchar(32) comment '最终结束在哪一条街',
   win_card             varchar(64) comment '最终赢牌 牌面',
   win_card_type        varchar(32) comment '赢牌类型 -A-high 3条 葫芦',
   win_card_user        varchar(32) comment '赢牌玩家id',
   remark               varchar(1024),
   remark_json          varchar(1024),
   rake                 float(8,2) comment '抽成',
   company              varchar(32),
   create_at            timestamp,
   update_at            timestamp,
   create_user          varchar(32),
   update_user          varchar(32),
   primary key (id)
);

alter table spider_poker_info comment '牌局信息表';

drop table if exists spider_user_action_info;

/*==============================================================*/
/* Table: spider_user_action_info                               */
/*==============================================================*/
create table spider_user_action_info
(
   id                   int not null auto_increment,
   game_id              int,
   step                 varchar(64) comment 'pre-flop flop  turn river',
   bet_amounts          decimal comment '下注总量',
   raise_amounts        decimal comment '加注总量',
   user_action          varchar(32) comment 'bet call raise allin',
   user_site            varchar(32) comment 'B&S,BTN,SB,BB,MP,EP,CO',
   create_at            timestamp,
   create_user          varchar(32),
   update_at            timestamp,
   update_user          varchar(32),
   primary key (id)
);

alter table spider_user_action_info comment '记录用户每一步的操作过程';


drop table if exists spider_user_poker_outline;

/*==============================================================*/
/* Table: user_poker_outline                                    */
/*==============================================================*/
create table spider_user_poker_outline
(
   id                   int not null auto_increment,
   game_id              int,
   user_id              varchar(32) comment '用户编号',
   earnings             decimal comment '收益 有+ -',
   user_site            varchar(32) comment 'B&S,BTN,SB,BB,MP,EP,CO',
   user_hand            varchar(32) comment '用户手牌',
   hand_type            varchar(32) comment '口袋对 高张 连牌',
   suited               int comment '1-是 0-非',
   allin                int comment '1 allin  0- off allin',
   create_at            timestamp,
   update_at            timestamp,
   create_user          varchar(32),
   update_user          varchar(32),
   primary key (id)
);

alter table spider_user_poker_outline comment '用户牌局概要表';

