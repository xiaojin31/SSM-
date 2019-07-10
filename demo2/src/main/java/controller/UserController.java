package controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("")
public class UserController {
    private static final Logger log = Logger.getLogger(UserController.class);

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public Object login(HttpServletRequest request){
        log.info("login()");
        JSONObject rJson = new JSONObject();
        try {

            rJson.put("status",100);
        }catch (Exception e){
            log.error("login()",e);
            rJson.put("status",101);
        }
        return rJson;
    }

    @RequestMapping(value = "register.do",method = RequestMethod.POST)
    @ResponseBody
    public Object register(HttpServletRequest request){
        log.info("register()");
        JSONObject rJson = new JSONObject();
        try {

            rJson.put("status",100);
        }catch (Exception e){
            log.error("register()",e);
            rJson.put("status",101);
        }
        return rJson;
    }
}
