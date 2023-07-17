class Command
{
    enum Action
    {
        DEPOSIT, WITHDRAW
    }

    public Action action;
    public int amount;
    public boolean success;

    public Command(Action action, int amount)
    {
        this.action = action;
        this.amount = amount;
    }
}

class Account
{
    public int balance;

    public void process(Command c)
    {
        switch (c.action) {
            case DEPOSIT -> {
                balance += c.amount;
                c.success = true;
            }
            case WITHDRAW -> {
                if (balance >= c.amount) {
                    balance -= c.amount;
                    c.success = true;
                } else c.success = false;
            }
        }
    }
}