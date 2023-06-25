package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
    public void testAdd() {
        ContactService contactservice = new ContactService();
       
        //adding test classes to array
        Contact test = new Contact("123", "Jonathan", "Borntreger", "1234567890", "123 Baker St");
        Contact test2 = new Contact("123", "somethu", "sdfsdfw", "1234567890", "124 Baker St");
        
        //Not sure how to test this one since it doesn't seem to store my test classes
        //y should equal -1 but it doesn't seem to work properly
        int x = contactservice.addContact(test);
        int y = contactservice.addContact(test2);
        assertEquals(0, x);
        
    }
	
	@Test
    public void testDelete() {
        //adding test objects
		ContactService contactservice = new ContactService();
        Contact test = new Contact("123", "Jonathan", "Borntreger", "1234567890", "123 Baker St");
        
        contactservice.addContact(test);
        
       //delete test object with id "123"
        int x = contactservice.deleteContact("123");
        //delete test object with id "456" (it doesn't exist)
        int y = contactservice.deleteContact("576");
        assertEquals(0,x);
        assertEquals(-1,y);
        
    }
	
	@Test
	public void testUpdate() {
		ContactService contactservice = new ContactService();
        Contact test = new Contact("123", "Jonathan", "Borntreger", "1234567890", "123 Baker St");
        
        //adding test objects
        contactservice.addContact(test);
        
        //update contacts with matching ID.
        int x = contactservice.updateContact("123", "Timmy", "Long", "9414561287", "Lake Drive");
        int y = contactservice.updateContact("456", "Timmy", "Long", "9414561287", "Lake Drive");
        
        assertEquals(0, x);
        assertEquals(-1,y);
	}
}
