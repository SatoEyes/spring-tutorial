package com.example.session.domain.repository.order;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.session.domain.model.Goods;
import com.example.session.domain.model.Order;
import com.example.session.domain.model.OrderLine;

/**
 * 注文状況テスト
 * @author sato.hitomi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:META-INF/spring/session-tutorial-init-infra.xml",
		"classpath:META-INF/spring/Test-context.xml"})
@Transactional
public class OrderRepositoryTest {

	@Inject
	OrderRepository target;
	
	// createOrder
	@Test
	public void createOrderTest_1() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines("abcd");
			order.setEmail("a@b.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("2000-01-01");
			order.setOrderDate(orderTest);
			target.createOrder(order);
		}catch(ParseException e) {
			fail(e.getMessage());
		}catch(Exception ex) {
			fail(ex.getMessage());
		}
	}
	
	@Test
	public void createOrderTest_2() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines("abcd");
			order.setEmail("a@b.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("abcd1234");
			order.setOrderDate(orderTest);
			target.createOrder(order);
			fail();
		}catch(ParseException e) {
			e.getMessage();
		}catch(Exception ex) {
			fail(ex.getMessage());
		}
	}
	
	@Test
	public void createOrderTest_3() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines("abcd");
			order.setEmail(null);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("2000-01-01");
			order.setOrderDate(orderTest);
			target.createOrder(order);
			fail();
		}catch(ParseException e) {
			fail(e.getMessage());
		}catch(Exception ex) {
			ex.getMessage();
		}
	}
	
	@Test
	public void createOrderTest_4() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines("abcd");
			order.setEmail(null);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("abcd1234");
			order.setOrderDate(orderTest);
			target.createOrder(order);
			fail();
		}catch(ParseException e) {
			e.getMessage();
		}catch(Exception ex) {
			fail(ex.getMessage());
		}
	}
	
	@Test
	public void createOrderTest_5() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines(null);
			order.setEmail("a@b.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("2000-01-01");
			order.setOrderDate(orderTest);
			target.createOrder(order);
			fail();
		}catch(ParseException e) {
			fail(e.getMessage());
		}catch(Exception ex) {
			ex.getMessage();
		}
	}
	
	@Test
	public void createOrderTest_6() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines(null);
			order.setEmail("a@b.com");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("abcd1234");
			order.setOrderDate(orderTest);
			target.createOrder(order);
			fail();
		}catch(ParseException e) {
			e.getMessage();
		}catch(Exception ex) {
			fail(ex.getMessage());
		}
	}
	
	@Test
	public void createOrderTest_7() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines(null);
			order.setEmail(null);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("2000-01-01");
			order.setOrderDate(orderTest);
			target.createOrder(order);
			fail();
		}catch(ParseException e) {
			fail(e.getMessage());
		}catch(Exception ex) {
			ex.getMessage();
		}
	}
	
	@Test
	public void createOrderTest_8() {
		Order order = new Order();
		try {
			order.setOrderIdToALllOrderLines(null);
			order.setEmail(null);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date orderTest = sdf.parse("abcd1234");
			order.setOrderDate(orderTest);
			target.createOrder(order);
			fail();
		}catch(ParseException e) {
			e.getMessage();
		}catch(Exception ex) {
			fail(ex.getMessage());
		}
	}
	
	// createOrderLines
	@Test
	public void createLinesTest_1() {
		Order order = new Order();
		List<OrderLine> orderLines = new ArrayList<>();
		OrderLine orderLine = new OrderLine();
		Goods goods = new Goods();
		try {
			orderLine.setOrderId("abcd");
			orderLine.setGoods(goods);
			orderLine.setQuantity(2);
			order.setOrderLines(orderLines);
			target.createOrderLines(orderLines);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createLinesTest_2() {
		Order order = new Order();
		List<OrderLine> orderLines = new ArrayList<>();
		OrderLine orderLine = new OrderLine();
		Goods goods = new Goods();
		try {
			orderLine.setOrderId("abcd");
			orderLine.setGoods(goods);
			orderLine.setQuantity(2);
			order.setOrderLines(orderLines);
			target.createOrderLines(orderLines);
			fail();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void createLinesTest_3() {
		Order order = new Order();
		List<OrderLine> orderLines = new ArrayList<>();
		OrderLine orderLine = new OrderLine();
		try {
			orderLine.setOrderId("abcd");
			orderLine.setGoods(null);
			orderLine.setQuantity(2);
			order.setOrderLines(orderLines);
			target.createOrderLines(orderLines);
			fail();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void createLinesTest_4() {
		Order order = new Order();
		List<OrderLine> orderLines = new ArrayList<>();
		OrderLine orderLine = new OrderLine();
		Goods goods = new Goods();
		try {
			orderLine.setOrderId(null);
			orderLine.setGoods(goods);
			orderLine.setQuantity(2);
			order.setOrderLines(orderLines);
			target.createOrderLines(orderLines);
			fail();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void createLinesTest_5() {
		Order order = new Order();
		List<OrderLine> orderLines = new ArrayList<>();
		OrderLine orderLine = new OrderLine();
		Goods goods = new Goods();
		try {
			orderLine.setOrderId(null);
			orderLine.setGoods(goods);
			orderLine.setQuantity(2);
			order.setOrderLines(orderLines);
			target.createOrderLines(orderLines);
			fail();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void createLinesTest_6() {
		Order order = new Order();
		List<OrderLine> orderLines = new ArrayList<>();
		OrderLine orderLine = new OrderLine();
		try {
			orderLine.setOrderId(null);
			orderLine.setGoods(null);
			orderLine.setQuantity(2);
			order.setOrderLines(orderLines);
			target.createOrderLines(orderLines);
			fail();
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
