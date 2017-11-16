package com.eu.eyecare.web.customer;

import com.eu.eyecare.service.EyeUserService;
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
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private EyeUserService eyeUserService;

    @RequestMapping("/findUser")
    @ResponseBody
    public Map<String, Object> insertProfession(PageUtil page, String empName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,Object>> emp;
        try {
            emp = eyeUserService.insertUser(page,empName);
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
}
