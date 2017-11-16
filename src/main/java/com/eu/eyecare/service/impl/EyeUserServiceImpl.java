package com.eu.eyecare.service.impl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eu.eyecare.dao.EyeUserDao;
import com.eu.eyecare.dao.UserDao;
import com.eu.eyecare.entity.EyeUser;
import com.eu.eyecare.entity.EyeUser;
import com.eu.eyecare.service.EyeUserService;
import com.eu.eyecare.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EyeUserServiceImpl implements EyeUserService{
    @Autowired
    private EyeUserDao eyeUserDao;

    @Override
    public List<Map<String, Object>> insertUser(PageUtil page, String eyeName) throws Exception {
        String eyeUserReal="%"+eyeName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("username",eyeUserReal);
        page.setTotalSize(eyeUserDao.queryUserCount(eyeUserReal));

        System.out.println("dao:");
        System.out.println("dao:"+eyeUserDao.queryUser(data));

        return eyeUserDao.queryUser(data);
    }

    @Override
    public void addUser(EyeUser eyeUser) throws Exception{

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
        String date = dateFormat.format( now );

        eyeUserDao.addUser(eyeUser);

    }
    @Override
    public void deleteUser(int id) throws Exception{
        eyeUserDao.deleteUser(id);
    }
    @Override
    public List<EyeUser> findById(int empId)throws Exception {
        return eyeUserDao.findById(empId);
    }

    @Override
    public EyeUser queryUserInfo(String username) {
        try {
            return eyeUserDao.queryUserInfo(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUserInfo(EyeUser eyeUser) {
        try {
            eyeUserDao.updateUserInfo(eyeUser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}