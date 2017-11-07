package com.eu.front.service.impl;
import java.util.List;
import com.eu.front.dao.EyeUserDao;
import com.eu.front.entity.EyeUser;
import com.eu.front.service.EyeUserService;
public class EyeUserServiceImpl implements EyeUserService{
    private EyeUserDao eyeUserDao;
    @Override
    public long getEyeUserRowCount(){
        return eyeUserDao.getEyeUserRowCount();
    }
    @Override
    public List<EyeUser> selectEyeUser(){
        return eyeUserDao.selectEyeUser();
    }
    @Override
    public EyeUser selectEyeUserByObj(EyeUser obj){
        return eyeUserDao.selectEyeUserByObj(obj);
    }
    @Override
    public EyeUser selectEyeUserById(Integer id){
        return eyeUserDao.selectEyeUserById(id);
    }
    @Override
    public int insertEyeUser(EyeUser value){
        return eyeUserDao.insertEyeUser(value);
    }
    @Override
    public int insertNonEmptyEyeUser(EyeUser value){
        return eyeUserDao.insertNonEmptyEyeUser(value);
    }
    @Override
    public int deleteEyeUserById(Integer id){
        return eyeUserDao.deleteEyeUserById(id);
    }
    @Override
    public int updateEyeUserById(EyeUser enti){
        return eyeUserDao.updateEyeUserById(enti);
    }
    @Override
    public int updateNonEmptyEyeUserById(EyeUser enti){
        return eyeUserDao.updateNonEmptyEyeUserById(enti);
    }

    public EyeUserDao getEyeUserDao() {
        return this.eyeUserDao;
    }

    public void setEyeUserDao(EyeUserDao eyeUserDao) {
        this.eyeUserDao = eyeUserDao;
    }

}