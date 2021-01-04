package banking;

public class Account {

    private String account_holder_name;
    private String account_phone_number;
    private double balance;
    private String pin;
    public Account(String name,String phone_number, String pin_number){
        this.account_holder_name=name;
        this.account_phone_number=phone_number;
        this.pin=pin_number;
    }
    public Account(String Name, String phone_number)
    {
        this.account_holder_name= Name;
        this.account_phone_number= phone_number;
    }

    //    Method overloading  []
//    Polymorphism

    public boolean pin_update(String old_pin,String new_pin)
    {
        if(old_pin==this.pin)
        {
            this.pin=new_pin;
            System.out.println("Pin updated.");
            return true;

        }
        else
        {
            System.out.println("Old pin does not match.");
            return false;
        }
    }

    public boolean pin_set(String newPin)
    {
        this.pin=newPin;
        System.out.println("New pin is ****.");
        return true;
    }
    public void add_money(double amount){
        this.balance = balance+amount;
        System.out.println("Cash in: "+amount);
    }
    public void cash_out(double amount, String pin){

        if(pin!=this.pin)
        {
            System.out.println("Pin does not match.");
            return;
        }

        else {
            if (balance>=amount)
            {
                balance=balance-amount;
                System.out.println("Cash out: "+amount);
            }
            else
            {
                System.out.println("Failed to cash out due to insufficient balance.");
            }
        }

    }
    public String toString()
    {
        return " Account { "
                + " Account Holder Name = " +account_holder_name
                + ", Phone number = " +account_phone_number
                + ", Balance = " +balance+ "}";

    }
    public String getAccount_holder_name(){
        return this.account_holder_name;
    }
    public String getAccount_phone_number(){
        return this.account_phone_number;
    }
    public double getBalance()
    {
        return this.balance;
    }
}

