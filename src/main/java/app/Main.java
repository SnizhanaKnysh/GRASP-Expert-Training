package app;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Address address = new Address("London", "Main St.", "213432", "98", "112");

        user.setAddress(address);
        System.out.println(user.getAddress());
    }

}
