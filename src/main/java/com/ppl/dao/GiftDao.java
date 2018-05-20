package com.ppl.dao;

import java.util.List;

import com.ppl.pojo.Gift;

public interface GiftDao {
	List<Gift> selectGift(Gift gift);

}
