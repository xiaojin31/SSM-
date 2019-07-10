package service;

import mapper.UserInfoMapper;
import mapper.UserMapper;
import model.User;
import model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.DBContextHolder;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<User> getUser(){
        List<User> userList = new ArrayList<>();
        try {
            DBContextHolder.setDataSource("dataSource2");
            userList = userMapper.getUser();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }

    public List<UserInfo> getUserInfo(){
        List<UserInfo> userInfoList = new ArrayList<>();
        try {
            DBContextHolder.setDataSource("dataSource1");
            userInfoList = userInfoMapper.getUserInfo();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userInfoList;
    }

}
