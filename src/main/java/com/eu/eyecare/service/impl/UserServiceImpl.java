package com.eu.eyecare.service.impl;

import com.eu.eyecare.dao.UserDao;
import com.eu.eyecare.entity.EyeEmp;
import com.eu.eyecare.service.UserService;
import com.eu.eyecare.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<Map<String, String>> insertUser(PageUtil page,String eyeName) throws Exception {
        String eyeEmpReal="%"+eyeName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("empName",eyeEmpReal);
        page.setTotalSize(userDao.queryUserCount(eyeEmpReal));

        return userDao.queryUser(data);
    }

    @Override
    public void addUser(EyeEmp eyeEmp) throws Exception{

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
        String date = dateFormat.format( now );
        eyeEmp.setEmpTime(date);

        userDao.addUser(eyeEmp);

    }
    @Override
    public void deleteUser(int id) throws Exception{
        userDao.deleteUser(id);
    }
    @Override
    public List<EyeEmp> findById(int empId)throws Exception {
        return userDao.findById(empId);
    }

    @Override
    public EyeEmp queryUserInfo(String username) {
        try {
            return userDao.queryUserInfo(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUserInfo(EyeEmp eyeEmp) {
        try {
            userDao.updateUserInfo(eyeEmp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
