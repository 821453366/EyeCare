package com.eu.eyecare.web.eyeProduct;

import com.eu.eyecare.dto.Result;
import com.eu.eyecare.entity.EyeProduct;
import com.eu.eyecare.service.EyeProductService;
import com.eu.eyecare.service.UserService;
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

/**
 * Created by 马欢欢 on 17-11-16.
 */
@Controller
@RequestMapping("eyeProduct")
public class eyeProductController {

    @Autowired
    private EyeProductService eyeProductService;

    @RequestMapping("/findUser")
    @ResponseBody
    public Map<String, Object> insertProfession(PageUtil page, String proName){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> eye;
        try {
            eye = eyeProductService.insertUser(page,proName);
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

    @RequestMapping("/addUser")
    @ResponseBody
    public Result addUser(EyeProduct eyeProduct) {
        try {
            eyeProductService.addUser(eyeProduct);
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
            eyeProductService.deleteUser(id);
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
            List<EyeProduct> list =eyeProductService.findById(id);
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
    public Map<String, Object> updateInfoAjax(EyeProduct eyeProduct) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            eyeProductService.updateUserInfo(eyeProduct);
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
