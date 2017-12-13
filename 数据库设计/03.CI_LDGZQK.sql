-- auto create by SMD

use DB_DOTA;

-- call pr_Drop_index_if_exists('T_GAMEVERSION','I_PK_T_GAMEVERSION');

create  index I_PK_T_GAMEVERSION on T_GAMEVERSION (C_ID);


use DB_DOTA;

-- call pr_Drop_index_if_exists('T_HEROS','I_PK_T_HEROS');

create  index I_PK_T_HEROS on T_HEROS (C_ID);


use DB_DOTA;

  -- call pr_Drop_index_if_exists('T_ESPORTCORPS','I_PK_T_ESPORTCORPS');

create  index I_PK_T_ESPORTCORPS on T_ESPORTCORPS (C_ID);


use DB_DOTA;

-- call pr_Drop_index_if_exists('T_ESPORTPLAYERS','I_PK_T_ESPORTPLAYERS');

create  index I_PK_T_ESPORTPLAYERS on T_ESPORTPLAYERS (C_ID);


use DB_DOTA;

-- call pr_Drop_index_if_exists('T_PLAYER_EXP','I_PK_T_PLAYER_EXP');

create  index I_PK_T_PLAYER_EXP on T_PLAYER_EXP (C_ID);


use DB_DOTA;

-- call pr_Drop_index_if_exists('T_LEAGUE','I_PK_T_LEAGUE');

create  index I_PK_T_LEAGUE on T_LEAGUE (C_ID);


use DB_DOTA;

-- call pr_Drop_index_if_exists('T_MACH','I_PK_T_MACH');

create  index I_PK_T_MACH on T_MACH (C_ID);


use DB_DOTA;

-- call pr_Drop_index_if_exists('T_MATCH_ZR','I_PK_T_MATCH_ZR');

create  index I_PK_T_MATCH_ZR on T_MATCH_ZR (C_ID);


use DB_DOTA;

-- call pr_Drop_index_if_exists('T_MATCH_ZRHEROS','I_PK_T_MATCH_ZRHEROS');

create  index I_PK_T_MATCH_ZRHEROS on T_MATCH_ZRHEROS (C_ID);


