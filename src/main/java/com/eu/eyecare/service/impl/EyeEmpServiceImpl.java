package com.eu.eyecare.service.impl;

import com.eu.eyecare.dao.EyeEmpDao;
import com.eu.eyecare.entity.EyeEmp;
import com.eu.eyecare.service.EyeEmpService;

import java.util.List;

public class EyeEmpServiceImpl implements EyeEmpService {
    private EyeEmpDao eyeEmpDao;
    @Override
    public long getEyeEmpRowCount(){
        return eyeEmpDao.getEyeEmpRowCount();
    }
    @Override
    public List<EyeEmp> selectEyeEmp(){
        return eyeEmpDao.selectEyeEmp();
    }
    @Override
    public EyeEmp selectEyeEmpByObj(EyeEmp obj){
        return eyeEmpDao.selectEyeEmpByObj(obj);
    }
    @Override
    public EyeEmp selectEyeEmpById(Integer id){
        return eyeEmpDao.selectEyeEmpById(id);
    }
    @Override
    public int insertEyeEmp(EyeEmp value){
        return eyeEmpDao.insertEyeEmp(value);
    }
    @Override
    public int insertNonEmptyEyeEmp(EyeEmp value){
        return eyeEmpDao.insertNonEmptyEyeEmp(value);
    }
    @Override
    public int deleteEyeEmpById(Integer id){
        return eyeEmpDao.deleteEyeEmpById(id);
    }
    @Override
    public int updateEyeEmpById(EyeEmp enti){
        return eyeEmpDao.updateEyeEmpById(enti);
    }
    @Override
    public int updateNonEmptyEyeEmpById(EyeEmp enti){
        return eyeEmpDao.updateNonEmptyEyeEmpById(enti);
    }

    public EyeEmpDao getEyeEmpDao() {
        return this.eyeEmpDao;
    }

    public void setEyeEmpDao(EyeEmpDao eyeEmpDao) {
        this.eyeEmpDao = eyeEmpDao;
    }

}