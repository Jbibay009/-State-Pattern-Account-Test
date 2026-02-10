
public interface AccountState {
    void deposit(Double amount);
    void withdraw(Double amount);
    void activate();
    void suspend();
    void close();
}
