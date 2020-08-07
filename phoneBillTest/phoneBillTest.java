
import org.junit.jupiter.api.Test;
import phoneBill.DataBundle;
import phoneBill.PhoneBill;
import phoneBill.PhoneCall;
import phoneBill.SMSBundle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class phoneBillTest {


    @Test

    public void acceptBillActionInstances(){



        PhoneBill phoneBill = new PhoneBill();

        phoneBill.accept(new PhoneCall(200));
        phoneBill.accept(new SMSBundle(20,50));
        phoneBill.accept(new DataBundle(500




        ));
        phoneBill.accept(new SMSBundle(20,00.50));
        // phoneBill.total();

        System.out.println("awe" + "");
        assertEquals(920.00, phoneBill.total() );
    }


@Test

    public void shouldGetTotal() {

    PhoneBill phoneBill = new PhoneBill();
    phoneBill.accept(new DataBundle(10));
    phoneBill.accept(new SMSBundle(10,1.00));
    phoneBill.accept(new PhoneCall(2.50));
  //  phoneBill.total();

    assertEquals(20.00,phoneBill.total());

    }
@Test
    public void incrementTotalCost() {
        PhoneBill phoneBill = new PhoneBill();
        SMSBundle smsBundle = new SMSBundle(2, 2.30);
        PhoneCall phoneCall = new PhoneCall(5.00);
        DataBundle dataBundle = new DataBundle(600);

        phoneBill.accept(smsBundle);
        phoneBill.accept(phoneCall);
        phoneBill.accept(dataBundle);

        phoneBill.total();

        assertEquals(339.60, phoneBill.total);


    }

}