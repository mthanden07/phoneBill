package phoneBill;
import phoneBill.DataBundle;
import phoneBill.PhoneBill;
import phoneBill.PhoneCall;
import phoneBill.SMSBundle;

public class

Main {

    public static void main( String[] args) {
	// write your code here

        System.out.println("Hie Solo");
        PhoneBill phoneBill = new PhoneBill();
        phoneBill.accept(new PhoneCall(2.01));
        phoneBill.accept(new SMSBundle(2,0.50));
        phoneBill.accept(new DataBundle(600));

        phoneBill.total();
        System.out.println(phoneBill.total());







    }
}
