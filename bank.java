#9

class Bank 
{
  public int getBalance() 
  {
    return 0;
  }
}

class BankA extends Bank 
{
  int balance = 100;
  public int getBalance() 
    {
      return balance;
    }
}

class BankB extends Bank  
{
    int balance = 150;
    public int getBalance() 
    {
        return balance;
    }
}

class BankC extends Bank 
{
  int balance = 200;
  public int getBalance() 
  {
    return balance;
  }
}

public class Banks 
{
  public static void main(String[] args) 
  {
    Bank obj1 = new BankA();
    Bank obj2 = new BankB();
    Bank obj3 = new BankC();

    System.out.println("Money deposited in Bank A: $" + obj1.getBalance());
    System.out.println("Money deposited in Bank B: $" + obj2.getBalance());
    System.out.println("Money deposited in Bank C: $" + obj3.getBalance());
    }
}



***OUTPUT***

Money deposited in Bank A: $100
Money deposited in Bank B: $150
Money deposited in Bank C: $200


