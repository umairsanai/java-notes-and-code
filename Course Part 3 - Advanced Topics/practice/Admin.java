package practice;

public class Admin extends User {
    private String role;

    public Admin(String name, int age) {
        super(name, age);
        this.role = "ADMIN";
    }

    public String getRole() {
        return role;
    }

}
