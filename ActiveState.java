
public class ActiveState implements AccountState {
    private final Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(Double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println(account.toString());
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend() {
        account.setAccountState(new SuspendedState(account));
        System.out.println("Account is suspended!");
    }

    @Override
    public void close() {
        account.setAccountState(new ClosedState(account));
        System.out.println("Account is closed!");
    }
}
