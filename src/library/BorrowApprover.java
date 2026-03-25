package library;

public abstract class BorrowApprover {
    protected BorrowApprover nextApprover;

    public abstract boolean approveRequest(int days);

    public void setNextApprover(BorrowApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
}
