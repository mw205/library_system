package library;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookInterface {
    private final String title;
    private final List<User> waitingList = new ArrayList<User>();
    private boolean isAvailable;
    private User borrowedBy;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(user.getName() + " " + title + " has been borrowed.");
        } else {
            waitingList.add(user);
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public void notifyObserver() {
        for (User user : waitingList) {
            user.update(title + " " + "is available to borrow");
        }
        waitingList.clear();
    }


}
