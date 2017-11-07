package com.eu.front.service.impl;
import java.util.List;
import com.eu.front.dao.ProImgDao;
import com.eu.front.entity.ProImg;
import com.eu.front.service.ProImgService;
public class ProImgServiceImpl implements ProImgService{
    private ProImgDao proImgDao;
    @Override
    public long getProImgRowCount(){
        return proImgDao.getProImgRowCount();
    }
    @Override
    public List<ProImg> selectProImg(){
        return proImgDao.selectProImg();
    }
    @Override
    public ProImg selectProImgByObj(ProImg obj){
        return proImgDao.selectProImgByObj(obj);
    }
    @Override
    public ProImg selectProImgById(Integer id){
        return proImgDao.selectProImgById(id);
    }
    @Override
    public int insertProImg(ProImg value){
        return proImgDao.insertProImg(value);
    }
    @Override
    public int insertNonEmptyProImg(ProImg value){
        return proImgDao.insertNonEmptyProImg(value);
    }
    @Override
    public int deleteProImgById(Integer id){
        return proImgDao.deleteProImgById(id);
    }
    @Override
    public int updateProImgById(ProImg enti){
        return proImgDao.updateProImgById(enti);
    }
    @Override
    public int updateNonEmptyProImgById(ProImg enti){
        return proImgDao.updateNonEmptyProImgById(enti);
    }

    public ProImgDao getProImgDao() {
        return this.proImgDao;
    }

    public void setProImgDao(ProImgDao proImgDao) {
        this.proImgDao = proImgDao;
    }

}