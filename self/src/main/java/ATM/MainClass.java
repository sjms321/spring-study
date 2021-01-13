package ATM;
/*
 * 통장개설 5명까지 가능 개설시 이름,통장번호, 잔고를 갖는 객체 생성
 * 입금 출금  송금 매소드
 */

import org.springframework.context.support.GenericXmlApplicationContext;

import Service.trans;

public class MainClass {
	public static void main(String[] args) {		
//		Atm min = new Atm("min", "123", 5000);
//		Atm suk = new Atm("suk", "123", 5000);
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		Atm min = ctx.getBean("atm",Atm.class);
		min.setMoney(5000);
		min.setAccount("123");
		min.setName("min");
		
//		min.trans(min, suk, 2000);
//		min.trans(min, suk, 2000);
//		min.trans(min, suk, 2000);
	}
}
