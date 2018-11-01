package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("123549876", 1000);
		BankAccount acc2 = new BankAccount("321546002", 2000);
		BankAccount acc3 = new BankAccount("341199002", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
}
	
class BankAccount implements IInterest {
	// class memmbers
	private static int iD = 1001;
	private String accountNumber; // iD + random 2-digit number + frist 2 of SSN
	private static final String routingNumber = "122100024";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN) {
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		System.out.println(iD);
		setAccountNumber();
	}
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number : " + accountNumber);
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	//public void setRoutingNumber(String routingNumber) {
	//	this.routingNumber = routingNumber;
	//}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSSN() {
		return SSN;
	}

	//public void setSSN(String sSN) {
	//	SSN = sSN;
	//}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying Bill : " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit  : " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your Balance : " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1+ (rate/100));
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name : " + name + " ]\n[Account Number : " + accountNumber + "]\n[Routing Number : " + routingNumber + "]\n[Balance : " + balance +"]" ;
	}
}
