package Adapter;

public class PPATestDrive {

	public static void main(String[] args) {
		
		MpayImpl mpay = new MpayImpl();
		PPACont ppa = new PPACont();
		// Interface Class
		MPay testAdapter = new PPAdapter(ppa);
		//test mpay
		
		testPPay(mpay);
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		ppa.setCardOwnerName("Everson");
		ppa.setCustCardNo("0052154");
		ppa.setCVVNo(144);
		ppa.setCardExpMonthDate("10");
		ppa.setTotalAmount(54786d);
		System.out.println(ppa.getCardOwnerName() + " " +  ppa.getCustCardNo() + " " + ppa.getCVVNo() );
		
		testPPay(testAdapter);
		
		
	}

	public static void testPPay(MPay mpay){
		System.out.println(mpay.getCreditCardNo());
		System.out.println(mpay.getCustomerName());
		System.out.println(mpay.getCardExpMonth());
		System.out.println(mpay.getCardExpYear());
		System.out.println(mpay.getCardCVVNo());
		System.out.println(mpay.getAmount());
		}
}
