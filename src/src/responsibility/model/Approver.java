package responsibility.model;

public abstract class Approver {
    final protected String name;
    protected Approver nextApprover;

    public Approver(String name) {
        this.name = name;
    }

    public Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return this.nextApprover;
    }

    public abstract void approve(int amount);
}
