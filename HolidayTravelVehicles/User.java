package W6;

public class User {
    private String username;
    public User(String username) {
        this.username = username;
    }

    public boolean login(String password) {
        // 假设简单的验证
        if (password.equals("password123")) {
            System.out.println(username + " logged in successfully.");
            return true;
        }
        System.out.println("Login failed.");
        return false;
    }

    public void logout() {
        System.out.println(username + " logged out.");
    }
}
