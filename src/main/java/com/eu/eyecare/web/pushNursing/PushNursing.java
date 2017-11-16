package com.eu.eyecare.web.pushNursing;

import com.eu.eyecare.dao.ProCategoryDao;
import com.eu.eyecare.entity.ProCategory;
import com.eu.eyecare.service.EyeUserService;
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
@RequestMapping("pushNursing")
public class PushNursing {

    @Autowired
    private ProCategoryDao proCategoryDao;

    @RequestMapping("/add")
    @ResponseBody
    public Map<String, Object> add(ProCategory proCategory){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,Object>> emp;
        try {
            emp = proCategoryDao.add(proCategory);
            data.put("result", true);
        } catch (Exception e) {

            e.printStackTrace();
        }

        return data;
    }

    @RequestMapping("/query")
    @ResponseBody
    public Map<String, Object> query(){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,Object>> emp;
        try {
            emp = proCategoryDao.query();
            data.put("user", emp);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);

            e.printStackTrace();
        }

        return data;
    }
}
