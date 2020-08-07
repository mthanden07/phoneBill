package phoneBill;

//import static org.com.BillAction.totalCost;

import phoneBill.BillAction;

public class PhoneBill{
 public static double total = 0;

    public void accept(BillAction billAction){
           total += billAction.totalCost();
    }


    public double total(){
        System.out.println("the total cost is   R" + total);
        return this.total;
    }

}
