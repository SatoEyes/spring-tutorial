package com.example.session.domain.service.userdetails;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * ユーザ情報検索テスト
 * @author sato.hitomi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:META-INF/spring/session-tutorial-init-infra.xml",
		"classpath:META-INF/spring/Test-context.xml"})
@Transactional
public class AccountDetailsServiceTest {

	@Inject
	AccountDetailsService target;
	
	@Test
	public void userDetailsTtest_1() {
		String email = "a@b.com";
		try {
			target.loadUserByUsername(email);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void userDetailsTest_2() throws UsernameNotFoundException{
		String email = null;
		target.loadUserByUsername(email);
	}
	
	@Test
	public void userDetailsTest_3() throws UsernameNotFoundException{
		String email = "c@d.com";
		target.loadUserByUsername(email);
	}

}
