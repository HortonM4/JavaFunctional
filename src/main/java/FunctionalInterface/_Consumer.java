package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	public static void main(String[] args) {
		// Normal Java function
		Customer martin = new Customer("Martin", "07792364640");
		greetCustomer(martin);

		// Consumer Functional interface
		greetCustomerConsumer.accept(martin);

		greetCustomerConsumerV2.accept(martin, false);

	}

	static Consumer<Customer> greetCustomerConsumer = customer ->
			System.out.println("Hello " + customer.customerName +
					", thanks for registering phone number "
					+ customer.customerPhoneNumber);

	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
			System.out.println("Hello " + customer.customerName +
					", thanks for registering phone number "
					+ (showPhoneNumber ? customer.customerPhoneNumber : "***********"));


	static void greetCustomer(Customer customer){
		System.out.println("Hello " + customer.customerName +
				", thanks for registering phone number "
				+ customer.customerPhoneNumber);
	}

	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;

		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}


}
