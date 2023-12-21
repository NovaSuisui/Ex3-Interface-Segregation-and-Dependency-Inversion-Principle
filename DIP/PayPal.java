public class PayPal implements IPayment {
	@Override
	public void pay() {
		System.out.println("Paying with PayPal...");
	}
}
