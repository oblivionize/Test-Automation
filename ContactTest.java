package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest{

	@Test
	void testContact () {
		Contact contact = new Contact("123", "Jonathan", "Borntreger", "1234567890", "123 Baker St");
		assertTrue(contact.getContactId().equals("123"));
		assertTrue(contact.getFirstName().equals("Jonathan"));
		assertTrue(contact.getLastName().equals("Borntreger"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Baker St"));
	}
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "Jonathan", "Borntreger", "123456789", "123 Baker St");
			});
	}
	
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Jonathan", "Borntreger", "123456789", "123 Baker St");
			});
	}
	
	@Test
	void testContactNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jonathan123", "Borntreger", "123456789", "123 Baker St");
			});
	}
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", null, "Borntreger", "123456789", "123 Baker St");
			});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "", "Borntreger123", "123456789", "123 Baker St");
			});
	}
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jonathan", null, "123456789", "123 Baker St");
			});
	}
	
	@Test
	void testContactPhoneNot10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jonathan", "Borntreger", "12345678999", "123 Baker St");
			});
	}
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jonathan", "Borntreger", null, "123 Baker St");
			});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jonathan", "Borntreger", "123456789", "123 Baker st more words to add to reach over 30");
			});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Jonathan", "Borntreger", "123456789", null);
			});
	}
	
	


}
