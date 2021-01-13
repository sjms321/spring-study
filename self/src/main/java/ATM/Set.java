package ATM;
//개설시 이름 잔고를 갖는 객체 생성
public class Set {
	private String name;
	private int money;
	
	public Set(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
