package Adapter;

public class MPayTestDriver {

	public static void main(String[] args) {
		
		MpayImpl mpay = new MpayImpl();
		PPACont ppay = new PPACont();
		ppay.setCardOwnerName("Everson");
		ppay.setCustCardNo("0052154");
		ppay.setCVVNo(144);
		ppay.setCardExpMonthDate("10");
		ppay.setTotalAmount(54786d);
		PPay testAdapter = new MpayAdapter(mpay);
		testPPay(ppay);
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		mpay.setCustomerName("Everson");
		mpay.setCreditCardNo("0052154");
		mpay.setCardCVVNo((short) 144);
		mpay.setCardExpMonth("10");
		mpay.setAmount(54786d);
		
	
		testPPay(testAdapter);
	}

	
	public static void testPPay(PPay pp) {
		System.out.println(pp.getCardOwnerName());
		System.out.println(pp.getCustCardNo());
		System.out.println(pp.getCardExpMonthDate());
		System.out.println(pp.getCVVNo());
		System.out.println(pp.getTotalAmount());
	}

}
