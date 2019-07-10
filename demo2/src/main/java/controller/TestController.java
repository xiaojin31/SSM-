package controller;

import com.alibaba.fastjson.JSONObject;
import model.User;
import model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.TestService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "getuser.do",method = RequestMethod.POST)
    @ResponseBody
    public Object getUser(HttpServletRequest request){
        JSONObject rJson = new JSONObject();
        try {
            List<User> userList = testService.getUser();
            rJson.put("data",userList);
            rJson.put("status",100);
        }catch (Exception e){
            e.printStackTrace();
            rJson.put("status",101);
        }
        return rJson;
    }

    @RequestMapping(value = "getuserinfo.do",method = RequestMethod.POST)
    @ResponseBody
    public Object getUserInfo(HttpServletRequest request){
        JSONObject rJson = new JSONObject();
        try {
            List<UserInfo> userInfoList = testService.getUserInfo();
            rJson.put("data",userInfoList);
            rJson.put("status",100);
        }catch (Exception e){
            e.printStackTrace();
            rJson.put("status",101);
        }
        return rJson;
    }

}
