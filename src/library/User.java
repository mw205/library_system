package library;

public class User {

    private String name;
    private boolean isPremium;

    public User(String name) {
        this.name = name;
    }

    public User(String name, boolean isPremium) {
       setName(name);
       setPremium(isPremium);
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public void update(String message){
        System.out.println("Notification sent: "+message);
    }
}
