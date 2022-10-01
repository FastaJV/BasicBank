//MAIN FILE
//------------------

public class Main {

    public static void main(String[] args) {
//        passing the parameters through the constructor
        BankAccount account = new BankAccount("Mardochee brice", "fastamb@gmail.com",
                1220, 2022, 16993327996L);

//        account.setAccountNumber(2022);
//        account.setCustomerName("Mardochee brice");
//        account.setEmail("fastamb@gmail.com");
//        account.setBalance(1220);
//        account.setPhoneNumber(16993327996L);
          account.DepositFund(10);
          account.withdraw(200);

        String cusName = account.getCustomerName();
        String email = account.getEmail();
        int accNumber = account.getAccountNumber();
        long balance = account.getBalance();
        long num = account.getPhoneNumber();


        BankAccount newOne = new BankAccount("Fasta", "mardo@gmail.com", 93274982);
        System.out.println("name: " + newOne.getCustomerName());

//        System.out.println("customer name: " + cusName + "\r\nemail: " + email + "\r\naccount number: "
//        + accNumber + "\r\nbalance: " + balance + "\r\nphone number: " + num
//        + "\r\nDeposited fund: ");

        System.out.println("----------------------------------------------------------");
        VipCustomer info = new VipCustomer("Fasta", 253.78, "mardochee@gmail.com");

        VipCustomer otherInfo = new VipCustomer("Mardochee", 890.15);
        System.out.println("Name: " + otherInfo.getName() + "\r\ncredit limited: " + info.getCreditLimited());

        System.out.println("----------------------------------------------------");

        System.out.println("name: " + info.getName() + "\r\ncredit limited: " + info.getCreditLimited()
        + "\r\nemail address: " + info.getEmailAddress());

        System.out.println("----------------------------------------------------");

        VipCustomer DefaultInfo = new VipCustomer();
        System.out.println(DefaultInfo.getName() + "\r\n" + DefaultInfo.getCreditLimited()
        +"\r\n" + DefaultInfo.getEmailAddress());


    }



}




//BANKACCOUNT FILE
//-------------------------

public class BankAccount {

    private int accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;
//    create a constructor
    public BankAccount() {
//        empty constructor called
        this("Default name", "Default address", 13132, 32132, 16993327996L);
    }

    public BankAccount(String customerName, String email, long balance, int accountNumber,
                       long phoneNumber){
//        account constructor with parameters called
        this.customerName = customerName;
        this.email = email;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;

    }
//    call another default constructor;

    public BankAccount(String customerName, String email, long phoneNumber) {
        this(customerName, email, 999, 2013,23233232L);
    }

    //    create the setter for each method

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

//    set the getter methods

    public int getAccountNumber(){
        return accountNumber;
    }

    public long getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

//    deposit fund to the balance field
    public void DepositFund(long deposited){
        balance += deposited;
        System.out.println("deposit of " + deposited + " made. \r\nnew balance is " + this.balance);

    }

    public void withdraw(long withdrawAmount){
        if(this.balance - withdrawAmount <0){
            System.out.println("Only " + withdrawAmount + "available. it was not processed");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("withdrawal of " + withdrawAmount + "process. remaining balance"
            + this.balance);
        }
    }

}


//VIPCUSTOMER FILE
//------------------------

public class VipCustomer {
    private String name;
    private double creditLimited;
    private String emailAddress;

//    default constructor
    public VipCustomer() {
        this("Default name", 1234.45, "default adress");
    }
//    pass the fields in the second contructor

    public VipCustomer(String name, double creditLimited){
        this(name, 333.33, "Default@.com");
    }
//    save all fields in the third constructor
    public VipCustomer(String name, double creditLimited, String emailAddress){
        this.name = name;
        this.creditLimited = creditLimited;
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return name;
    }

    public double getCreditLimited() {
        return creditLimited;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

