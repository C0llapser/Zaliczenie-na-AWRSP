package Mappers;
import Core.DailyPhisicalEffort;
import Core.User;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserMapper {

    public User mapDataToUser(LinkedList<String> data)
    {
        return new User(
                data.get(0),
                data.get(1),
                Integer.parseInt(data.get(2)),
                Integer.parseInt(data.get(3)),
                DailyPhisicalEffort.valueOf(data.get(4)));
    }
    public List<String> mapUserToData(User user)
    {
        return new LinkedList(Arrays.asList(
                user.getImie(),
                user.getNazwisko(),
                String.valueOf(user.getAge()),
                String.valueOf(user.getWeight()),
                user.getDailyPhisicalEffort().name()
        ));
    }

}
