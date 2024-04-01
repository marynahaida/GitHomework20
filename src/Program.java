public class Program {
    public static void main(String[] args) {
        User user = new User("Alice", "qwerty");
        User.Account acc = user.new Account("qwerty");
        acc.displayAccount();
    }
}
