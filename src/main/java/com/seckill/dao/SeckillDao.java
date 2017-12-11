package com.seckill.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.seckill.entity.Seckill;

public interface SeckillDao {
	
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);
	
	Seckill queryById(@Param("seckillId") long seckillId);
	
	List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	void killByProcedure(Map<String, Object> paramMap);
	
}
