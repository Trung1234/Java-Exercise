package com.trungnt.contact.manager;

import com.trungnt.contact.model.Contact;

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
			System.out.println("Đã thêm  " +contact.getName()+" thành công");
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
	public void find(String subString){
		System.out.println("-------------------------");
		System.out.println("Kết quả tìm kiếm Thang là");
		for(int i=0;i<subString.length();i++){
		
			char kitu = subString.charAt(i);
			for(int j = 0;j<listDB.size();j++){
				char kiTuCHuoi = listDB.get(j).getName().charAt(j);
				if(kitu==kiTuCHuoi){
					System.out.println(listDB.get(j).toString());
				}
			}
			
		}
	}
	
}
