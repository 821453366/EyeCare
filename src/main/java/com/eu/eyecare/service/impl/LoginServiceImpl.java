package com.eu.eyecare.service.impl;

import com.eu.eyecare.dao.LoginDao;
import com.eu.eyecare.entity.Admin;
import com.eu.eyecare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Admin login(Admin admin) {
        try {
            if (loginDao.login(admin) != null) {
                return  loginDao.login(admin);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }


}
