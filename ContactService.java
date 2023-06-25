package contact;
import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	
	public int addContact(Contact contact) {
		for(Contact list : contacts) {
			if (list.equals(contact)) 
				return -1;
		}
		contacts.add(contact);
		return 0;
	}
	
	public int deleteContact(String id) {
		for(Contact list : contacts) {
			if (list.getContactId().equals(id)) {
				contacts.remove(list);
				return 0;
			}
		}
		return -1;
	}
	public int updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		for(Contact list : contacts) {
			if (list.getContactId().equals(contactId)) {
				if(firstName != null && firstName.length()<10) {
					list.setFirstName(firstName);
				
				} else return -1;
				if(lastName != null && lastName.length()<10) {
					list.setLastName(lastName);
				} else return -1;
				if(phone != null && phone.length()==10) {
					list.setPhone(firstName);
				} else return -1;
				if(address != null && address.length()<30) {
					list.setAddress(address);
				} else return -1;
				return 0;
			}
			
		}
		return -1;
	}
}
