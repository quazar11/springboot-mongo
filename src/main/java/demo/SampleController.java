package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author edwardsbean
 * @date 15-6-19
 */
@RestController
public class SampleController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    List<User> home() {
        User user = new User();
        user.setName("edwardsbean");
        userRepository.save(user);
        //not persistent entity error when find something
        List<User> userList = userRepository.findAll();
        return userList;
    }
}
