package bg.adesso.officemanager.service;

import bg.adesso.officemanager.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    List<User> users = new ArrayList<>(Arrays.asList(
            new User("1", "kolarova", "adessoBGk"),
            new User("2", "tsvetanova", "adessoBGt"),
            new User("3", "ali", "adessoBGa"),
            new User("4", "tsvyatkov", "adessoBGt"),
            new User("5", "dedov", "adessoBGd"),
            new User("6", "atanasov", "adessoBGa"),
            new User("7", "topalov", "adessoBGt"),
            new User("8", "dimov", "adessoBGd"),
            new User("9", "redzhov", "adessoBGr"),
            new User("10", "georgieva", "adessoBGg"),
            new User("11", "hristozov", "adessoBGh"),
            new User("12", "todorova", "adessoBGt"),
            new User("13", "valchec", "adessoBGv"),
            new User("14", "hristozova", "adessoBGh"),
            new User("15", "terziev", "adessoBGt")
    ));

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(String name) {

        return users.stream().filter(i -> i.getId().equals(name)).findFirst().get();
    }


}