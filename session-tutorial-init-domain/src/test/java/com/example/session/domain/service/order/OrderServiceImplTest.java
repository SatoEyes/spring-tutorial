package com.example.session.domain.service.order;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.session.domain.model.Account;
import com.example.session.domain.model.Cart;
import com.example.session.domain.model.CartItem;
import com.example.session.domain.model.Goods;
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
public class OrderServiceImplTest {

	@Inject
	OrderService target;
	
	Account account;
	Cart cart;
	CartItem cartItem;
	Goods goods;
	String signature = "signature";
	
	@Test
	public void purchaseTest_1() {
		account.setEmail("a@b.com");
		goods.setId("366cf3a4-68c5-4dae-a557-673769f76840");
		cartItem.setGoods(goods);
		cartItem.setQuantity(1);
		cart.add(cartItem);
		try {
			target.purchase(account, cart, signature);
		}catch(Exception e) {
			fail(e.getMessage());
		}		
	}
	
	@Test
	public void purchaseTest_2() throws InvalidCartOrderException{
		account.setEmail("a@b.com");
		goods.setId("366cf3a4-68c5-4dae-a557-673769f76840");
		cartItem.setGoods(goods);
		cartItem.setQuantity(1);
		cart.add(cartItem);
		target.purchase(account, cart, null);
	}
	
	@Test
	public void purchaseTest_3() throws EmptyCartOrderException{
		account.setEmail("a@b.com");
		cart.isEmpty();
		target.purchase(account, cart, signature);		
	}
	
	@Test
	public void purchaseTest_4() throws EmptyCartOrderException{
		account.setEmail("a@b.com");
		cart.isEmpty();
		try {
			target.purchase(account, cart, null);
		}catch(InvalidCartOrderException e) {
			fail(e.getMessage());
		}		
	}
	
	@Test
	public void purchaseTest_5() throws Exception{
		account.setEmail(null);
		goods.setId("366cf3a4-68c5-4dae-a557-673769f76840");
		cartItem.setGoods(goods);
		cartItem.setQuantity(1);
		cart.add(cartItem);
		target.purchase(account, cart, signature);		
	}

	@Test
	public void purchaseTest_6() throws Exception{
		account.setEmail(null);
		goods.setId("366cf3a4-68c5-4dae-a557-673769f76840");
		cartItem.setGoods(goods);
		cartItem.setQuantity(1);
		cart.add(cartItem);
		target.purchase(account, cart, null);		
	}
	
	@Test
	public void purchaseTest_7() throws Exception{
		account.setEmail(null);
		goods.setId("366cf3a4-68c5-4dae-a557-673769f76840");
		cartItem.setGoods(goods);
		cartItem.setQuantity(1);
		cart.isEmpty();
		target.purchase(account, cart, signature);		
	}
	
	@Test
	public void purchaseTest_8() throws Exception{
		account.setEmail(null);
		goods.setId("366cf3a4-68c5-4dae-a557-673769f76840");
		cartItem.setGoods(goods);
		cartItem.setQuantity(1);
		cart.isEmpty();
		target.purchase(account, cart, null);		
	}
}
