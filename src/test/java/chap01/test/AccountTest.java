package chap01.test;

import org.junit.Test;

import chap01.main.Account;

public class AccountTest {

	/*
	 * 아래의 테스트시나리오의 내용은
	 * '계좌를 생성한다. 그때 특별한 에러는 없어야 한다' 이다.
	 * */
	@Test
	public void testAccount() throws Exception {
		Account account = new Account();
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
