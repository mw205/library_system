package library;

class Manager extends BorrowApprover {
    public boolean approveRequest(int days) {
        if (days <= 14) {
            System.out.println("✅ Manager approved borrowing for " + days + " days.");
            return true;
        } else if (nextApprover != null) {
            return nextApprover.approveRequest(days);
        }
        return false;
    }
}

