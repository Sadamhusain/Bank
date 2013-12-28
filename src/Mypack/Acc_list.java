package Mypack;

public class Acc_list 
{
	private static Account[] arr;
	private static int arrcount=0;
	
	static {
		arr =new Account[5];
	}
	public static void getAddaccount(Account accobj)
	{
	if(arrcount<5)
	{
		arr[arrcount]=accobj;
		arrcount++;
	}
}
public static Account getAccountdet(int acc_no)
{
Account accobj=null;
{
	for(int i=0;i<=5;i++)
		{
			if(arr[i].getAcc_no()==acc_no)
			{
				accobj=arr[i];
				break;
			}
			else
			{
				continue;
			}
		}
	return accobj;
	}
}
}
