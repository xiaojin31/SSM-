package mapper;

import model.User;
import util.DataSource;

import java.util.List;

//@DataSource(value = "dataSource2")
public interface UserMapper {
    List<User> getUser();
}
