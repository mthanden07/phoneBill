package phoneBill;

import phoneBill.BillAction;

public class SMSBundle implements BillAction {

Double SMSBundlePrice = 0.00;

    public SMSBundle(int qty, double price){
                this.SMSBundlePrice += (qty * price);

    }


    @Override
    public double totalCost() {
        System.out.println("SMSBundle: " +  "R" + SMSBundlePrice);
         return  this.SMSBundlePrice;
    }
}
