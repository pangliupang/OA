package com.ppl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ppl.pojo.Gift;
import com.ppl.service.GiftService;

@Controller
public class GiftController {
	@Autowired
	private GiftService giftService;
	@RequestMapping(value = "/gift")
	@ResponseBody
	public List<Gift> gift(Gift gift) {
		return giftService.selectGift(gift);
	}

}
