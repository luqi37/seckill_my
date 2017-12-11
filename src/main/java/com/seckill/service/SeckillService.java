package com.seckill.service;

import java.util.List;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;

public interface SeckillService {
	
	List<Seckill> getSeckillList();
	
	Seckill getById(long seckillId);
	
	Exposer exportSeckillUrl(long seckillId);
	
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException,
			RepeatKillException, SeckillCloseException;
	
}
