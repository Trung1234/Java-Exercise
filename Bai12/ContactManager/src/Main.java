/**
 * Created by My PC on 11/11/2017.
 */
public class Main {
	public static void main(String[] args) {
		ContactManager contactManager = new ContactManager();
		contactManager.addContact("trung","32323323");
		contactManager.printAllContact();
		contactManager.modifyContact("32323323","232323232");
		contactManager.printAllContact();
	}
}
