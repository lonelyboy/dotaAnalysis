-- auto create by SMD

use DB_DOTA;

-- 游戏版本

drop table if exists T_GAMEVERSION;

create table DB_DOTA.T_GAMEVERSION
(
    C_ID                 varchar(32)                             NOT NULL     comment 'C_ID',
    C_VERSIONUMBER       varchar(32)                                  NULL         comment '版本好',
    D_FBSJ               datetime                             NULL         comment '发布时间',
    T_CONTEXT            text                                 NULL         comment '版本内容',
    C_SONE               varchar(300)                         NULL         comment '版本之子',
    C_NAME               varchar(300)                         NULL         comment '版本之子是谁'
) comment = '游戏版本' ;


use DB_DOTA;

-- 英雄

drop table if exists T_HEROS;

create table DB_DOTA.T_HEROS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME_CN            varchar(300)                         NULL         comment '英雄名字中文',
    C_NAME_EN            varchar(300)                         NULL         comment '英雄名字英文',
    D_CREATE_DATE        varchar(300)                         NULL         comment '创建时间',
    J_SKILLS             json                                 NULL         comment '技能',
    N_POSITION           int                                  NULL         comment '常处位置'
) comment = '英雄' ;


use DB_DOTA;

-- 电子竞技战队

drop table if exists T_ESPORTCORPS;

create table DB_DOTA.T_ESPORTCORPS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME               varchar(300)                         NULL         comment '战队名称',
    C_CLUB               varchar(32)                          NULL         comment '所属俱乐部',
    C_RANK               int                                  NULL         comment '世界排名s',
    D_CREATE_DATE        datetime                             NULL         comment '创建时间'
) comment = '电子竞技战队' ;


use DB_DOTA;

-- 电竞选手

drop table if exists T_ESPORTPLAYERS;

create table DB_DOTA.T_ESPORTPLAYERS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME               varchar(32)                          NULL         comment '真实姓名',
    C_USENAME            varchar(300)                         NULL         comment '游戏名',
    D_CAREER_START       datetime                             NULL         comment '职业开始时间',
    C_CORP               varchar(32)                          NULL         comment '当前战队'
) comment = '电竞选手' ;


use DB_DOTA;

-- 选手战队经历

drop table if exists T_PLAYER_EXP;

create table DB_DOTA.T_PLAYER_EXP
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键'
) comment = '选手战队经历' ;


use DB_DOTA;

-- 电子竞技赛事/联赛

drop table if exists T_LEAGUE;

create table DB_DOTA.T_LEAGUE
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME               varchar(32)                          NULL         comment '联赛名称',
    L_REWARD             long                                 NULL         comment '奖金'
) comment = '电子竞技赛事/联赛' ;


use DB_DOTA;

-- 赛事比赛

drop table if exists T_MACH;

create table DB_DOTA.T_MACH
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    N_XZ                 int                                  NULL         comment '比赛性质',
    N_SCHEDULE           int                                  NULL         comment '赛程',
    C_LEAGUE             varchar(32)                            NULL         comment '所属联赛',
    N_BO                 int                                  NULL         comment 'bo几？',
    N_GAMENUM            int                                  NULL         comment '局数',
    C_WINNER             varchar(32)                          NULL         comment '获胜战队',
    N_WINNERSITE         int                                  NULL         comment '胜利方正营'
) comment = '赛事比赛' ;


use DB_DOTA;

-- 比赛整容

drop table if exists T_MATCH_ZR;

create table DB_DOTA.T_MATCH_ZR
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_MATCHNO            varchar(32)                          NULL         comment '比赛编号',
    C_CORP               varchar(32)                          NULL         comment '比赛队伍',
    N_SITE               int                                  NULL         comment '正营'
) comment = '比赛整容' ;


use DB_DOTA;

-- 整容英雄

drop table if exists T_MATCH_ZRHEROS;

create table DB_DOTA.T_MATCH_ZRHEROS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_HEROS_ID           varchar(32)                          NULL         comment '英雄ID',
    C_HEROS_NAME         varchar(300)                         NULL         comment '英雄名称',
    C_MATCH_ZR           varchar(32)                          NULL         comment '所属整容',
    C_PLAYER             varchar(32)                          NULL         comment '使用选手',
    C_POSITION           int                                  NULL         comment '位置'
) comment = '整容英雄' ;


-- auto create by SMD

use DB_DOTA;

-- 游戏版本

drop table if exists T_GAMEVERSION;

create table DB_DOTA.T_GAMEVERSION
(
    C_ID                 varchar(32)                             NOT NULL     comment 'C_ID',
    C_VERSIONUMBER       varchar(32)                                  NULL         comment '版本好',
    D_FBSJ               datetime                             NULL         comment '发布时间',
    T_CONTEXT            text                                 NULL         comment '版本内容',
    C_SONE               varchar(300)                         NULL         comment '版本之子',
    C_NAME               varchar(300)                         NULL         comment '版本之子是谁'
) comment = '游戏版本' ;


use DB_DOTA;

-- 英雄

drop table if exists T_HEROS;

create table DB_DOTA.T_HEROS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME_CN            varchar(300)                         NULL         comment '英雄名字中文',
    C_NAME_EN            varchar(300)                         NULL         comment '英雄名字英文',
    D_CREATE_DATE        varchar(300)                         NULL         comment '创建时间',
    J_SKILLS             json                                 NULL         comment '技能',
    N_POSITION           int                                  NULL         comment '常处位置'
) comment = '英雄' ;


use DB_DOTA;

-- 电子竞技战队

drop table if exists T_ESPORTCORPS;

create table DB_DOTA.T_ESPORTCORPS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME               varchar(300)                         NULL         comment '战队名称',
    C_CLUB               varchar(32)                          NULL         comment '所属俱乐部',
    C_RANK               int                                  NULL         comment '世界排名s',
    D_CREATE_DATE        datetime                             NULL         comment '创建时间'
) comment = '电子竞技战队' ;


use DB_DOTA;

-- 电竞选手

drop table if exists T_ESPORTPLAYERS;

create table DB_DOTA.T_ESPORTPLAYERS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME               varchar(32)                          NULL         comment '真实姓名',
    C_USENAME            varchar(300)                         NULL         comment '游戏名',
    D_CAREER_START       datetime                             NULL         comment '职业开始时间',
    C_CORP               varchar(32)                          NULL         comment '当前战队'
) comment = '电竞选手' ;


use DB_DOTA;

-- 选手战队经历

drop table if exists T_PLAYER_EXP;

create table DB_DOTA.T_PLAYER_EXP
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键'
) comment = '选手战队经历' ;


use DB_DOTA;

-- 电子竞技赛事/联赛

drop table if exists T_LEAGUE;

create table DB_DOTA.T_LEAGUE
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_NAME               varchar(32)                          NULL         comment '联赛名称',
    L_REWARD             long                                 NULL         comment '奖金'
) comment = '电子竞技赛事/联赛' ;


use DB_DOTA;

-- 赛事比赛

drop table if exists T_MACH;

create table DB_DOTA.T_MACH
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    N_XZ                 int                                  NULL         comment '比赛性质',
    N_SCHEDULE           int                                  NULL         comment '赛程',
    C_LEAGUE             varchar(32)                            NULL         comment '所属联赛',
    N_BO                 int                                  NULL         comment 'bo几？',
    N_GAMENUM            int                                  NULL         comment '局数',
    C_WINNER             varchar(32)                          NULL         comment '获胜战队',
    N_WINNERSITE         int                                  NULL         comment '胜利方正营'
) comment = '赛事比赛' ;


use DB_DOTA;

-- 比赛整容

drop table if exists T_MATCH_ZR;

create table DB_DOTA.T_MATCH_ZR
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_MATCHNO            varchar(32)                          NULL         comment '比赛编号',
    C_CORP               varchar(32)                          NULL         comment '比赛队伍',
    N_SITE               int                                  NULL         comment '正营'
) comment = '比赛整容' ;


use DB_DOTA;

-- 整容英雄

drop table if exists T_MATCH_ZRHEROS;

create table DB_DOTA.T_MATCH_ZRHEROS
(
    C_ID                 varchar(32)                          NOT NULL     comment '主键',
    C_HEROS_ID           varchar(32)                          NULL         comment '英雄ID',
    C_HEROS_NAME         varchar(300)                         NULL         comment '英雄名称',
    C_MATCH_ZR           varchar(32)                          NULL         comment '所属整容',
    C_PLAYER             varchar(32)                          NULL         comment '使用选手',
    C_POSITION           int                                  NULL         comment '位置'
) comment = '整容英雄' ;


