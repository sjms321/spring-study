package ATM;

class Atm{
	public String name;
	public String Account;
	public int money;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Atm(String name,String Account,int money) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.Account = Account;
		this.money = money;
	}
	
	void income(Atm atm,int income) {
		atm.money +=income;
	}
	
	void outcome(Atm atm,int outcome) {
		int charge=atm.money - outcome;
		if(charge<0) {
			System.out.println("잔액부족");
		}
		else atm.money =charge;
	}
	
	void trans(Atm atms,Atm atmr,int money) {
		if((atms.money-money)<0) {
			System.out.println("잔액부족");
			return;
		}
		atms.money -= money;
		atmr.money += money;
		System.out.println("송금완료");
		
	}
}
