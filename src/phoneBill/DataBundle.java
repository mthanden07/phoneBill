package phoneBill;
import phoneBill.*;
public class DataBundle implements BillAction {
   Double DataBundlePrice = 0.00;

public DataBundle(double megabytes){
    if(megabytes<500){

        this.DataBundlePrice += megabytes * 0.75;

    }
    else if(megabytes>500 && megabytes < 1000){
        this.DataBundlePrice += megabytes * 0.55D;
    }
else if (megabytes>1000){
this.DataBundlePrice += megabytes * 0.35D;

 }
else{
    this.DataBundlePrice = 0.00;
  }
}
    @Override
    public double totalCost() {
        System.out.println("DataBundle:"  + " R" + DataBundlePrice);
        return DataBundlePrice;


    }
}
