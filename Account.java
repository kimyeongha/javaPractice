package chapter07;

public class Account {
  
    
	int MAX_BALANCE=1000000;
	int MIN_BALANCE=0;
	private int deposit;
	private int withdraw;
	
	private int balance=deposit-withdraw;
	

	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getBalance() {
		return balance;
		
	}
 //0 <= balance <= 1,000,000 
	public void setBalance(int balance) {
		if(0<=balance&&balance<=1000000) {
		this.balance = balance;
	}else{
		     System.out.println("잘못 입력하셨습니다. 현재 잔고는 "+this.balance+"입니다");
	}
       
}
}