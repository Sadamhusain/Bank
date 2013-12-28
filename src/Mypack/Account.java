package Mypack;

public class Account 
{
	private int balance,acc_no;
	private String name;
	private static int counter=1000;
	
public int getBalance()
{
	return this.balance;
}
public int getAcc_no()
{
	return this.acc_no;
}
public String getName()
{
	return this.name;
}
public Account(String cus_name)
{
	this(0,cus_name);
}

public Account(int openingbalance,String cus_name)
{
	counter++;
	name=cus_name;
	balance=openingbalance;
	acc_no=counter;
	
}
public int withdraw(int wd)
{
	if(wd>0) 
	{
		balance=balance-wd;
	}
	return balance;
}
public int deposit(int dp)
{
	if(dp>0&&balance>0)
	{
	balance=balance+dp;
	}
	return balance;
}
}

