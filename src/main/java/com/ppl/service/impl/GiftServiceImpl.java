package com.ppl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ppl.dao.GiftDao;
import com.ppl.pojo.Gift;
import com.ppl.service.GiftService;

@Service("giftService")
@Transactional
public class GiftServiceImpl implements GiftService {

	@Autowired
	private GiftDao giftDao;
	@Override
	public List<Gift> selectGift(Gift gift) {
		return giftDao.selectGift(gift);
	}

}
