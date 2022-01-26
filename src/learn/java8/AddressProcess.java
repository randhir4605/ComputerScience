package learn.java8;

import learn.dto.Address;

public class AddressProcess {

	public Address process(Address addr) {
		if(addr.getPincode()==123456) {
			addr.setCity("Kolkata");
			addr.setCountry("India");
		}
		return addr;
	}
}
