package com.eu.front.service.impl;
import java.util.List;
import com.eu.front.dao.ProCategoryDao;
import com.eu.front.entity.ProCategory;
import com.eu.front.service.ProCategoryService;
public class ProCategoryServiceImpl implements ProCategoryService{
    private ProCategoryDao proCategoryDao;
    @Override
    public long getProCategoryRowCount(){
        return proCategoryDao.getProCategoryRowCount();
    }
    @Override
    public List<ProCategory> selectProCategory(){
        return proCategoryDao.selectProCategory();
    }
    @Override
    public ProCategory selectProCategoryByObj(ProCategory obj){
        return proCategoryDao.selectProCategoryByObj(obj);
    }
    @Override
    public ProCategory selectProCategoryById(Integer id){
        return proCategoryDao.selectProCategoryById(id);
    }
    @Override
    public int insertProCategory(ProCategory value){
        return proCategoryDao.insertProCategory(value);
    }
    @Override
    public int insertNonEmptyProCategory(ProCategory value){
        return proCategoryDao.insertNonEmptyProCategory(value);
    }
    @Override
    public int deleteProCategoryById(Integer id){
        return proCategoryDao.deleteProCategoryById(id);
    }
    @Override
    public int updateProCategoryById(ProCategory enti){
        return proCategoryDao.updateProCategoryById(enti);
    }
    @Override
    public int updateNonEmptyProCategoryById(ProCategory enti){
        return proCategoryDao.updateNonEmptyProCategoryById(enti);
    }

    public ProCategoryDao getProCategoryDao() {
        return this.proCategoryDao;
    }

    public void setProCategoryDao(ProCategoryDao proCategoryDao) {
        this.proCategoryDao = proCategoryDao;
    }

}