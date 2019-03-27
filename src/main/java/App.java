import entity.Role;
import entity.User;

import java.util.ArrayList;
import java.util.List;

import service.RoleService;
import service.UserService;

public class App {
    public static void main(String[] args) {

        UserService userService  = new UserService();

        RoleService roleService = new RoleService();
        Role role = roleService.getById(1L);
        List<Role> roleList = new ArrayList<>();
        roleList.add(role);

        User user = new User();
        user.setId(3L);
        user.setEmail("peter@mail.ru");
        user.setFirstName("Petrov");
        user.setLastName("Peter");
        user.setPassword("");
        user.setPhone("34324234243");
        user.setUserName("peter");
        user.setRoles(roleList);

        userService.add(user);

        List<User> userList = userService.getAll();

        for (User usern: userList) {
            System.out.println(usern.getLastName());
        }
    }
}
