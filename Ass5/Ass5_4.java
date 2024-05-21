class Telephone
{

    String customerName;
    long phoneNumber;
    int noOfCallMade, callDuration,billAmount;
    Telephone(String customerString,long phoneNumber,int noOfCallMade){
        this.customerName=customerString;
        this.phoneNumber=phoneNumber;
        this.noOfCallMade=noOfCallMade;

    }

    void calculateBillAmount()
    {
        double charge;
        if (noOfCallMade <= 100)
            charge = noOfCallMade * 0.6;
        else if (noOfCallMade <= 200)
            charge = (noOfCallMade * 0.5) + ((noOfCallMade - 100) * 0.8);
        else if (noOfCallMade <= 300)
            charge = (noOfCallMade * 0.5) + ((noOfCallMade - 100) * 0.8) + ((noOfCallMade - 200) * 1.2);
        else
            charge = (noOfCallMade * 0.5) + ((noOfCallMade - 100) * 0.8) + ((noOfCallMade - 200) * 1.2) + ((noOfCallMade - 300) * 1.5);
            
        billAmount = (int)charge + 125;
    }

    public void display() {
        System.out.println("Name: " + customerName);
        System.out.println("Phone No: " + phoneNumber);
        System.out.println("Calls: " + noOfCallMade);
        System.out.println("Amount Payable: " + billAmount);
    }
    

}

public class Ass5_4 {
    public static void main(String[] args) {
        Telephone t = new Telephone("Pranoti",123456789,540);
        t.calculateBillAmount();
        t.display();
    }
}
