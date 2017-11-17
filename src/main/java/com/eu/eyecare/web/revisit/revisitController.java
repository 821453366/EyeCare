package com.eu.eyecare.web.revisit;

import com.eu.eyecare.dto.Result;
import com.eu.eyecare.entity.Revisit;
import com.eu.eyecare.service.RevisitService;
import com.eu.eyecare.service.RevisitService;
import com.eu.eyecare.utils.Constant;
import com.eu.eyecare.utils.ImgUtil;
import com.eu.eyecare.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
@RequestMapping("revisit")
public class revisitController {
    @Autowired
    private RevisitService revisitService;

    @RequestMapping("/findRevist")
    @ResponseBody
    public Map<String, Object> insertProfession(PageUtil page, String proName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> eye;
        try {
            eye = revisitService.insertRevist(page,proName);
            data.put("user", eye);
            data.put("page", page);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);
            e.printStackTrace();
        }

        return data;
    }

    @RequestMapping("/addRevist")
    @ResponseBody
    public Result addRevist(Revisit revisit) {
        try {
            revisitService.addRevist(revisit);
            return Result.success(null, Constant.ADD_SUCCESS);
        } catch (Exception e) {
            new RuntimeException(e);
        }

        return Result.failure(null, Constant.ADD_FAILURE);
    }

    @RequestMapping("/deleteRevist")
    @ResponseBody
    public Map<String, Object> deleteRevist(int id) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            revisitService.deleteRevist(id);
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
            List<Revisit> list =revisitService.findById(id);
            result.put("user", list);
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
    public Map<String, Object> updateInfoAjax(Revisit revisit) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            revisitService.updateRevistInfo(revisit);
            result.put("msg", Constant.UPDATE_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", Constant.UPDATE_FAILURE);
        }

        return result;
    }

    @RequestMapping("/updateImage")
    @ResponseBody
    public Result updateImage(MultipartFile file, HttpServletRequest request) {
        try {
            String imgPath = ImgUtil.saveImg(file, request.getServletContext().getRealPath("/images") + Constant.USER_IMAGE_PATH);
            String imgName = imgPath.substring(imgPath.lastIndexOf("/"));

            return Result.success(imgName, Constant.UPLOAD_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Result.failure(null, Constant.UPDATE_FAILURE);
    }

}
