package com.example.session.domain.repository.goods;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.session.domain.model.Goods;

/**
 * グッズ状況テスト
 * @author sato.hitomi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		 "classpath:META-INF/spring/session-tutorial-init-infra.xml",
		"classpath:META-INF/spring/test-context.xml"})
@Transactional
public class GoodsRepositoryTest {

	@Inject
	GoodsRepository target;
	
	//@Inject
	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbctemplate;	
	
	
	RowBounds rowBounds = new RowBounds();
	int listSize = 0;
	
	long result;
	long expect;
	
	// findPageByCategoryId
	@Test
	public void findPageTest_1() {
		List<Goods> list = target.findPageByCategoryId(1, rowBounds);
		listSize = 5;
		assertEquals(listSize, list.size());
	}
	
	@Test
	public void findPageTest_2() {
		List<Goods> list = target.findPageByCategoryId(1, rowBounds);
		listSize = 6;
		assertNotEquals(listSize, list.size());
		
	}
	
	@Test
	public void findPageTest_3() {
		try {
			List<Goods> list = target.findPageByCategoryId(5, rowBounds);
			listSize = 5;
			assertNotEquals(listSize, list.size());
		}catch(Exception e) {
			e.getMessage();
		}		
	}
	
	@Test
	public void findPageTest_4() {
		try {
			List<Goods> list = target.findPageByCategoryId(5, rowBounds);
			listSize = 6;
			assertNotEquals(listSize, list.size());
		}catch(Exception e) {
			e.getMessage();
		}			
	}
	
	// countByCategoryId
	@Test
	public void countByCategoryIdTest_1() {
		result = target.countByCategoryId(2);
		expect = 5;
		assertEquals(expect, result);
	}
	
	@Test
	public void countByCategoryIdTest_2() {
		result = target.countByCategoryId(2);
		expect = 6;
		assertNotEquals(expect, result);
	}
	
	@Test
	public void countByCategoryIdTest_3() {
		result = target.countByCategoryId(5);
		expect = 5;
		assertNotEquals(expect, result);
	}
	
	@Test
	public void countByCategoryIdTest_4() {
		result = target.countByCategoryId(5);
		expect = 6;
		assertNotEquals(expect, result);
	}
	
	// findById
	@Test
	public void findByIdTest_1() {
		target.findById("366cf3a4-68c5-4dae-a557-673769f76860");
	}
	
	@Test
	public void findByIdTest_2() {
		try {
			target.findById("1234567890");
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void findByIdTest_3() {
		try {
			target.findById(null);
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
