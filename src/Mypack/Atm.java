package Mypack;

public class Atm 
{
	private int acc_no;
	private Account cusacc;
	
	public Atm(int acc_no)
	{
		this.acc_no=acc_no;
		cusacc=Acc_list.getAccountdet(acc_no);
	}
	public int getCusbal()
	{
		return cusacc.getBalance();
	}
	public int withdraw(int wd)
	{
		return cusacc.withdraw(wd);
	}
}
