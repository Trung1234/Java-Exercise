import java.util.ArrayList;

/**
 * Created by My PC on 11/11/2017.
 */
public class ContactManager {
	private ArrayList<Contact> listDB;
	
	public ContactManager() {
		listDB = new ArrayList<>();
	}
	public boolean checkExist(String soDT){
		for (int i=0;i<listDB.size();i++){
			if(listDB.get(i).getPhoneNumber()==soDT){
				return true;
			}
			
	}
		return false;
}
	public void addContact(String name,String phoneNumber){
		Contact contact = new Contact(name,phoneNumber);
		if(!listDB.contains(contact)){
			listDB.add(contact);
			System.out.println("Đã thêm thành công");
		}
	}
	public void modifyContact(String gtriSDT,String SDTMoi){
		for (int i=0;i<listDB.size();i++) {
			if (listDB.get(i).getPhoneNumber().equals(gtriSDT)) {
				listDB.get(i).setPhoneNumber(SDTMoi);
			}
			
		}
	}
	public void printAllContact(){
		
		System.out.println(listDB.toString());
	}
	
}
