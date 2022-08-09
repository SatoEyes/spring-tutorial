package com.example.session.domain.service.account;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

import com.example.session.domain.model.Account;
/**
 * アカウント情報テスト
 * @author sato.hitomi
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:META-INF/spring/session-tutorial-init-infra.xml",
		"classpath:META-INF/spring/Test-context.xml"})
@Transactional
public class AccountServiceImplTest {

	@Inject
	AccountService target;
	
	Account account = new Account();
	String password;
	
	
	// findOne
	@Test
	public void findOneTest_1() {
		try {
			target.findOne("a@b.com");
		}catch(Exception e) {
			fail(e.getMessage());
		}		
	}
	
	@Test
	public void findOneTest_2()throws ResourceNotFoundException{
		target.findOne(null);
	}
	
	@Test
	public void findOneTest_3()throws Exception{
		target.findOne("c@d.com");
	}
	
	// update
	@Test
	public void updateTest_1() {
		try {
		account.setId("gaggagargrgasg");
		account.setEmail("h@j.com");
		account.setName("testname");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthTest = sdf.parse("2022-01-01");
		account.setBirthday(birthTest);
		account.setZip("1234567");
		account.setAddress("Test");
		account.setCardNumber("1234567890");
		Date cardTest = sdf.parse("2022-01-01");
		account.setCardExpirationDate(cardTest);
		account.setCardSecurityCode("123");
		target.update(account);
		}catch(ParseException e) {
		fail(e.getMessage());
		}
	}
	
	public void updateTest_2() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_3() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_4() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_5() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_6() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void updateTest_7() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_8() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_9() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_10() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_11() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void updateTest_12() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_13() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void updateTest_14() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_15() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_16() throws Exception{
		try {
			account.setId("gaggagargrgasg");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_17() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_18() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_19() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_20() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_21() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_22() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_23() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_24() throws Exception{
		try {
			account.setId(null);
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_25() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_26() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_27() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_28() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_29() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_30() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_31() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_32() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_33() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_34() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_35() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_36() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_37() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_38() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_39() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_40() throws Exception{
		try {
			account.setId("abc");
			account.setEmail("h@j.com");
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_41() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_42() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_43() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_44() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2022-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_45() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_46() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_47() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("2022-01-01");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void updateTest_48() throws Exception{
		try {
			account.setId("abc");
			account.setEmail(null);
			account.setName("testname");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Test");
			account.setCardNumber("1234567890");
			Date cardTest = sdf.parse("efgh2323");
			account.setCardExpirationDate(cardTest);
			account.setCardSecurityCode("123");
			target.update(account);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	// create
	@Test
	public void createTest_1() {
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_2() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}		
	}
	
	@Test
	public void createTest_3() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_4() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_5() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_6() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_7() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_8() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_9() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_10() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_11() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_12() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_13() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_14() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_15() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_16() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_17() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_18() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_19() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_20() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_21() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_22() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_23() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_24() throws Exception{
		try {
			account.setId("abcdefg");
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_25() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_26() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}		
	}
	
	@Test
	public void createTest_27() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_28() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_29() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_30() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_31() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_32() throws Exception{
		try {
			account.setId(null);
			account.setEmail("e@f.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_33() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_34() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_35() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_36() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_37() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_38() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_39() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_40() throws Exception{
		try {
			account.setId(null);
			account.setEmail(null);
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_41() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_42() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_43() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_44() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = "testpw22";
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_45() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_46() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("2000-01-01");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_47() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("1234567");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void createTest_48() throws Exception{
		try {
			account.setId(null);
			account.setEmail("a@b.com");
			password = null;
			account.setName("testuser");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date birthTest = sdf.parse("abcd0101");
			account.setBirthday(birthTest);
			account.setZip("0987");
			account.setAddress("Tokyo");		
			target.create(account, password);
			}catch(ParseException e) {
			fail(e.getMessage());
		}
	}	
}
