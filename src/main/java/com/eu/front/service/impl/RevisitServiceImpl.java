package com.eu.front.service.impl;
import java.util.List;
import com.eu.front.dao.RevisitDao;
import com.eu.front.entity.Revisit;
import com.eu.front.service.RevisitService;
public class RevisitServiceImpl implements RevisitService{
    private RevisitDao revisitDao;
    @Override
    public long getRevisitRowCount(){
        return revisitDao.getRevisitRowCount();
    }
    @Override
    public List<Revisit> selectRevisit(){
        return revisitDao.selectRevisit();
    }
    @Override
    public Revisit selectRevisitByObj(Revisit obj){
        return revisitDao.selectRevisitByObj(obj);
    }
    @Override
    public Revisit selectRevisitById(Object id){
        return revisitDao.selectRevisitById(id);
    }
    @Override
    public int insertRevisit(Revisit value){
        return revisitDao.insertRevisit(value);
    }
    @Override
    public int insertNonEmptyRevisit(Revisit value){
        return revisitDao.insertNonEmptyRevisit(value);
    }
    @Override
    public int deleteRevisitById(Object id){
        return revisitDao.deleteRevisitById(id);
    }
    @Override
    public int updateRevisitById(Revisit enti){
        return revisitDao.updateRevisitById(enti);
    }
    @Override
    public int updateNonEmptyRevisitById(Revisit enti){
        return revisitDao.updateNonEmptyRevisitById(enti);
    }

    public RevisitDao getRevisitDao() {
        return this.revisitDao;
    }

    public void setRevisitDao(RevisitDao revisitDao) {
        this.revisitDao = revisitDao;
    }

}