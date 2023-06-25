package contact;

public class Contact {

		private String contactId;
		private String firstName;
		private String lastName;
		private String phone;
		private String address;
		
		public Contact(String contactId, String firstName, String lastName, String phone, String address) {
			if(contactId == null || contactId.length()>10) {
				throw new IllegalArgumentException("Invalid ID:)");
			}
			if(firstName == null || firstName.length()>10) {
				throw new IllegalArgumentException("Invalid name:)");
			}
			if(lastName == null || lastName.length()>10) {
				throw new IllegalArgumentException("Invalid last name:)");
			}
			if(phone == null || phone.length()!=10) {
				throw new IllegalArgumentException("Invalid phone:)");
			}
			if(address == null || contactId.length()>30) {
				throw new IllegalArgumentException("Invalid address:)");
			}
			
			this.contactId = contactId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
			this.address = address;
		}
		
		public String getContactId() {
			return contactId;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getPhone() {
			return phone;
		}
		public String getAddress() {
			return address;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
