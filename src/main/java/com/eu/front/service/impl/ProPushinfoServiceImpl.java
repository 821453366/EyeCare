package com.eu.front.service.impl;
import java.util.List;
import com.eu.front.dao.ProPushinfoDao;
import com.eu.front.entity.ProPushinfo;
import com.eu.front.service.ProPushinfoService;
public class ProPushinfoServiceImpl implements ProPushinfoService{
    private ProPushinfoDao proPushinfoDao;
    @Override
    public long getProPushinfoRowCount(){
        return proPushinfoDao.getProPushinfoRowCount();
    }
    @Override
    public List<ProPushinfo> selectProPushinfo(){
        return proPushinfoDao.selectProPushinfo();
    }
    @Override
    public ProPushinfo selectProPushinfoByObj(ProPushinfo obj){
        return proPushinfoDao.selectProPushinfoByObj(obj);
    }
    @Override
    public ProPushinfo selectProPushinfoById(Integer id){
        return proPushinfoDao.selectProPushinfoById(id);
    }
    @Override
    public int insertProPushinfo(ProPushinfo value){
        return proPushinfoDao.insertProPushinfo(value);
    }
    @Override
    public int insertNonEmptyProPushinfo(ProPushinfo value){
        return proPushinfoDao.insertNonEmptyProPushinfo(value);
    }
    @Override
    public int deleteProPushinfoById(Integer id){
        return proPushinfoDao.deleteProPushinfoById(id);
    }
    @Override
    public int updateProPushinfoById(ProPushinfo enti){
        return proPushinfoDao.updateProPushinfoById(enti);
    }
    @Override
    public int updateNonEmptyProPushinfoById(ProPushinfo enti){
        return proPushinfoDao.updateNonEmptyProPushinfoById(enti);
    }

    public ProPushinfoDao getProPushinfoDao() {
        return this.proPushinfoDao;
    }

    public void setProPushinfoDao(ProPushinfoDao proPushinfoDao) {
        this.proPushinfoDao = proPushinfoDao;
    }

}