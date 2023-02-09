package Bank;

public class BankABCMain {
	public static void main(String[]args)
	{
		BankA a = new BankA();

		BankB b = new BankB();

		BankC c = new BankC();

		System.out.println("Balance of Bank A Rs :"+a.getbalance());

		System.out.println("Balance of Bank B Rs :"+b.getbalance());

		System.out.println("Balance of Bank C Rs :"+c.getbalance());

	}

}
