package com.trungnt.contact.main;

import com.trungnt.contact.manager.ContactManager;

/**
 * Created by My PC on 11/11/2017.
 */
public class Main {
	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		contactManager.addContact("trung","32323323");
		contactManager.addContact("Thang","43323");
		contactManager.addContact("Hoai","326563323");
		contactManager.addContact("ToHoang","3254523323");
		contactManager.addContact("ToThang","3232354323");
		contactManager.addContact("ToTien","323233233223");
		contactManager.printAllContact();
//		contactManager.modifyContact("32323323","232323232");
		contactManager.find("Thang");
		
	}
}
