package user;

public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;

    private Account account;
    public boolean createAccount(){
        return true;
    }
}
