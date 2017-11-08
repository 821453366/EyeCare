package com.eu.eyecare.service.impl;

import com.eu.eyecare.dao.LoginDao;
import com.eu.eyecare.entity.Admin;
import com.eu.eyecare.entity.EyeEmp;
import com.eu.eyecare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public EyeEmp login(EyeEmp eyeEmp) {
        try {
            if (loginDao.login(eyeEmp) != null) {
                return  loginDao.login(eyeEmp);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }


}
