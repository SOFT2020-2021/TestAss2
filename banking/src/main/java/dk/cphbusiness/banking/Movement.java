package dk.cphbusiness.banking;

public class Movement {
    Account target;
    long amount;
    long timestamp;

    public Movement(Account target, long amount, long timestamp) {
        this.target = target;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}