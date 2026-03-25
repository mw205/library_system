package library;

class Director extends BorrowApprover {
    public boolean approveRequest(int days) {
        if (days >= 15) {
            System.out.println("✅ Director approved borrowing for " + days + " days.");
            return true;
        }
        return false;
    }
}