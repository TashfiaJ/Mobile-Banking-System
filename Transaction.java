package banking;

public class Transaction {
    public void start_banking(){
        String tashfia_pin="1234";
        String tasnim_pin="7890";
        String hasan_pin;
        Account tashfia = new Account ("Tashfia","01766929644",tashfia_pin);
        Account tasnim = new Account ("Tasnim", "01625434063", tasnim_pin);
        Account hasan = new Account ("Hasan", "01876543433");
        System.out.println(tashfia);
        System.out.println(tasnim);
        System.out.println(hasan);
        tashfia.add_money(1500);
        tasnim.add_money(2000);
        hasan.add_money(3000);
        tashfia.cash_out(500, tasnim_pin);

        if(tashfia.pin_update(tashfia_pin, "3245"))
        {
            tashfia_pin="3245";
        }
        if(hasan.pin_set("2211"))
        {
            hasan_pin="2211";
        }

        System.out.println(tashfia.getAccount_holder_name()+ ", "
                + tashfia.getAccount_phone_number() + ", "
                + tashfia.getBalance());

        System.out.println(tasnim.getAccount_holder_name()+ ", "
                + tasnim.getAccount_phone_number() + ", "
                + tasnim.getBalance());

        tashfia.cash_out(1200, tashfia_pin);
        hasan.cash_out(1000, "2211");
    }
}

