package com.thunisoft.codemonkey.dota.mapper;

import java.util.List;
import java.util.Map;


/**
 * @author Administrator 英雄们mapper
 */
public interface HeroMapper {

	/**
	 * 获取所有的heros
	 * 
	 * @return
	 */
	public List<Map> selectall();
}
