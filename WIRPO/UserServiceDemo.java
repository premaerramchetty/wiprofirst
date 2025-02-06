import java.util.Optional;
interface UserService {
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }
    Optional<String> getUser(String name);
}
class UserServiceImpl implements UserService {
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }
    public String getPersonalizedMessage(String name) {
        return getUser(name)
                .map(n -> "Welcome, " + n + "!")
                .orElse(getWelcomeMessage());   
    }
}
public class UserServiceDemo {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getPersonalizedMessage("Prem")); 
        System.out.println(userService.getPersonalizedMessage(null));    
}}

