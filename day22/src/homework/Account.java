package homework;

public class Account {
	//#1.필드
	private String accounNo;//계좌번호
	private String owner;//계좌주
	private int balance;//예금액
	
	//#2.생성자
	public Account(String accounNo, String owner, int balance) {
		super();
		this.accounNo = accounNo;//계좌번호
		this.owner = owner;//계좌주
		this.balance = balance;//예금액
	}
	
	//#3.메소드
	public String getAccounNo() {
		return accounNo;
	}

	public void setAccounNo(String accounNo) {
		this.accounNo = accounNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	//#4.toString
	@Override
	public String toString() {
		return "Account [accounNo=" + accounNo + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
