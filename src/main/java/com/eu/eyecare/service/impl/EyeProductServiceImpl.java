package com.eu.eyecare.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eu.eyecare.dao.EyeProductDao;
import com.eu.eyecare.entity.EyeProduct;
import com.eu.eyecare.service.EyeProductService;
import com.eu.eyecare.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EyeProductServiceImpl implements EyeProductService{

    @Autowired
    private EyeProductDao eyeProductDao;

    @Override
    public List<Map<String, String>> insertUser(PageUtil page, String proName) throws Exception {
        String eyeProductReal="%"+proName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("proName",eyeProductReal);
        page.setTotalSize(eyeProductDao.queryUserCount(eyeProductReal));

        return eyeProductDao.queryUser(data);
    }

    @Override
    public void addUser(EyeProduct eyeProduct) throws Exception{


        eyeProductDao.addUser(eyeProduct);

    }
    @Override
    public void deleteUser(int id) throws Exception{
        eyeProductDao.deleteUser(id);
    }
    @Override
    public List<EyeProduct> findById(int id)throws Exception {
        return eyeProductDao.findById(id);
    }

    @Override
    public EyeProduct queryUserInfo(String username) {
        try {
            return eyeProductDao.queryUserInfo(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUserInfo(EyeProduct eyeProduct) {
        try {
            eyeProductDao.updateUserInfo(eyeProduct);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}