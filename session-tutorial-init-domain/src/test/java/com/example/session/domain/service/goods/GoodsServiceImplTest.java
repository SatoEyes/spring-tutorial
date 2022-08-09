package com.example.session.domain.service.goods;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
/**
 * グッズ状況テスト
 * @author sato.hitomi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:META-INF/spring/session-tutorial-init-infra.xml",
		"classpath:META-INF/spring/Test-context.xml"})
@Transactional
public class GoodsServiceImplTest {

	@Inject
	GoodsService target;
	
	Integer categoryId;
	Pageable pageable;
	String goodsId;
	
	// findByCategoryId
	@Test
	public void findByCategoryIdTest_1() {
		categoryId = 1;
		try {
			target.findByCategoryId(categoryId, pageable);
		}catch(Exception e) {
			fail(e.getMessage());
		}		
	}
	
	@Test
	public void findByCategoryIdTest_2() throws Exception{
		categoryId = 5;
		target.findByCategoryId(categoryId, pageable);		
	}
	
	// findOne
	@Test
	public void findOneTest_1() {
		goodsId = "366cf3a4-68c5-4dae-a557-673769f76870";
		try {
			target.findOne(goodsId);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void findOneTest_2() throws Exception{
		goodsId = "1234567890";
		target.findOne(goodsId);
	}
	
	@Test
	public void findOneTest_3() throws Exception{
		target.findOne(null);
	}

}
