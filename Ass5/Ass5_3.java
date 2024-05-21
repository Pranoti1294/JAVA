class ElectricityBill
{
    String customerName;
    double unitsConsumed,billAmount;

    ElectricityBill()
    {
        customerName="Pranoti";
        unitsConsumed=500.50;
    }

    public double calculateBillAmount(){
                
        if (unitsConsumed<=100)
        {
            billAmount=(unitsConsumed-100)*0.5;
        }
        
        else if (unitsConsumed>100 && unitsConsumed<=200){
            billAmount=(unitsConsumed-100)*0.5+(unitsConsumed-200)*0.7;
        }
        else 
        {
            billAmount=(unitsConsumed-100)*0.5+(unitsConsumed-200)*0.7+(unitsConsumed)*1;

        }
        return billAmount;
    }
}

public class Ass5_3 {
    public static void main(String[] args) {
       ElectricityBill e =new ElectricityBill();
       System.out.println("Customer Name : "+e.customerName);
       System.out.println("Bill Generated is :"+e.calculateBillAmount());
    }
}
