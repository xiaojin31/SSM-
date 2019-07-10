package mapper;

import model.UserInfo;
import util.DataSource;

import java.util.List;

//@DataSource(value = "dataSource1")
public interface UserInfoMapper {
    List<UserInfo> getUserInfo();
}
