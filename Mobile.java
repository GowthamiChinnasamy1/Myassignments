package week1.day1;
public class Mobile  
{
	public void makecall() 
{
	String mobileModel="nokia";
	float mobileWeight= 10.0f;
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}
	
	public void sendSms()
{
		boolean fullyCharged= true;
		int mobileCost=10000;
		System.out.println(fullyCharged);
		System.out.println(mobileCost);
}
	public static void main(String[] args)
{
		Mobile mo=new Mobile();
	    mo.makecall();
		mo.sendSms();
		System.out.println("this is my mobile");
}
}