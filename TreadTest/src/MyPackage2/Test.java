package MyPackage2;

public class Test {
	
	public static void main(String[] args){
		AmountUtil amountUtil=new AmountUtil();
		
		System.out.println(amountUtil.changeY2F("668.12"));
		System.out.println(amountUtil.changeY2F("668"));
		System.out.println(amountUtil.changeF2Y(new Long(1231234)));
		
		System.out.println(amountUtil.handleMoney(new Long(1231234)));
	}

}
