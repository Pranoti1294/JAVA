public class Electricity {
     String customerName;
     double unitsConsumed;
     double billAmount;
   
   
   public Electricity( String customerName , double unitconsumed) {
       
       this.customerName =customerName;
       this.unitsConsumed= unitconsumed;
   }
   
   
     void calculateBillAmount() {
       if  (unitsConsumed<=100)billAmount=5;
       else if (unitsConsumed<=200)billAmount=7;
       else billAmount=10;
       //return billAmount;
    }
   
   
   public void Display() {
        System.out.println("CustomerName :"+customerName);
        System.out.println("unitsConsumed:"+unitsConsumed);
        System.out.println("billAmount:"+billAmount);
   }
   
       public static void main(String args[]){
           Electricity e = new Electricity("poonam" ,250);
           e.calculateBillAmount();
           e.Display();
       }
}