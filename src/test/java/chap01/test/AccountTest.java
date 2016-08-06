package chap01.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chap01.main.Account;

public class AccountTest {

	/**
	 * 아래의 테스트시나리오의 내용은 '계좌를 생성한다. 
	 * 그때 특별한 에러는 없어야 한다' 이다. 단 계좌를 생성 할때 초기 입금액이
	 * 있어야 계좌가 생성이 되는 현실을 반영 했다.
	 */
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals("1000원으로 계좌 생성 후 잔고 조회", 1000, account.getBalance());

		account = new Account(0);
		assertEquals("0원으로 계좌 생성 후 잔고 조회", 0, account.getBalance());
	}

	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount();
		} catch (Exception e) {
			System.out.println("실패(X)");
			return;
		}
		System.out.println("성공(O)");
	}
}
