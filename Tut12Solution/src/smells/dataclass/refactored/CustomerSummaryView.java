package smells.dataclass.refactored;

public class CustomerSummaryView {
	private Customer customer;
	public CustomerSummaryView(Customer customer) {
		this.customer = customer;
	}	
	
	// Code smell:  Data Classes
	// 1. Select method body and Apply refactoring technique "Move method" inside method getCustomerSummary() 
	//    to move method to class Customer
	// 2. Extract the address summary
	// 3. Move the address summary to the class Address
	public String getCustomerSummary() {
		return customer.getCustomerSummary();
	}
}
