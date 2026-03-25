package library;

public class Librarian extends BorrowApprover {
    @Override
    public boolean approveRequest(int days) {
        if (days <= 7) {
            System.out.println("librarian approved borrowing request");
            return true;

        } else if (nextApprover != null) {
            return nextApprover.approveRequest(days);
        }
        return false;
    }
}
