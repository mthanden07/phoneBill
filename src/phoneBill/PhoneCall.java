package phoneBill;

import phoneBill.BillAction;

public class PhoneCall implements BillAction {
      double PhoneCallPrice  = 0.00;

    public PhoneCall(double price){
   this.PhoneCallPrice += price;
    }

    @Override
    public double totalCost() {
        System.out.println("PhoneCall: "+"R" + PhoneCallPrice);
         return PhoneCallPrice;
    }





}
