package com.eu.eyecare.web.user;

import com.eu.eyecare.dto.Result;
import com.eu.eyecare.entity.EyeEmp;
import com.eu.eyecare.entity.EyeEmp;
import com.eu.eyecare.service.UserService;
import com.eu.eyecare.utils.Constant;
import com.eu.eyecare.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    @ResponseBody
    public Map<String, Object> insertProfession(PageUtil page,String empName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> emp;
        try {
            emp = userService.insertUser(page,empName);
            data.put("user", emp);
            data.put("page", page);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);
            e.printStackTrace();
        }

        return data;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public Result addUser(EyeEmp eyeEmp) {
        try {
            userService.addUser(eyeEmp);
            return Result.success(null, Constant.ADD_SUCCESS);
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return Result.failure(null, Constant.ADD_FAILURE);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public Map<String, Object> deleteUser(int id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            userService.deleteUser(id);
            result.put("msg", Constant.DELETE_SUCCESS);
            result.put("result", true);
        } catch (Exception e) {
            new RuntimeException(e);
            result.put("msg", Constant.DELETE_FAILURE);
        }
        return result;
    }

    @RequestMapping("/userInfo")
    @ResponseBody
    public Map<String, Object> findById(int id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            result.put("user", userService.findById(id));
            result.put("msg", Constant.SEARCH_SUCCESS);
            result.put("result", true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", Constant.SEARCH_FAILURE);
        }

        return result;
    }
    //用户信息
    @RequestMapping("/updateInfoAjax")
    @ResponseBody
    public Map<String, Object> updateInfoAjax(EyeEmp admin) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            userService.updateUserInfo(admin);
            result.put("msg", Constant.UPDATE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", Constant.UPDATE_FAILURE);
        }

        return result;
    }
}
