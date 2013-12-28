
import Mypack.*;

public class Bankoperation 
{
	public static void main(String args[])
	{
		Account obj1=new Account("Sadam");
		Acc_list.getAddaccount(obj1);
		
		Account obj2=new Account(5000,"HUsain");
		Acc_list.getAddaccount(obj2);
		
		Account obj3=new Account(10000,"Abdul");
		Acc_list.getAddaccount(obj3);
				
		Atm atm=new Atm(1002);
		System.out.println(String.format("%d has balance:%d",1001,atm.getCusbal()));
		
		int updatedBalance = atm.withdraw(1000);
		System.out.println(String.format("%d has balance :%d",1001,atm.getCusbal()));
		
		Ntbank nb=new Ntbank(1002);
		System.out.println(String.format("%d has balance:%d",1001,nb.deposit(500)));
	}
}

