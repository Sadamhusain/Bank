package Mypack;

public class Ntbank 
{
	private int accno;
	private Account cusacc;
	
	public Ntbank(int accno)
	{
		this.accno=accno;
		cusacc=Acc_list.getAccountdet(accno);
	}
	public int getCusbal()
	{
		return cusacc.getBalance();
	}
	public int withdraw(int amt)
	{
		return cusacc.withdraw(amt);
	}
	public int deposit(int amt)
	{
		return cusacc.deposit(amt);
	}
}

