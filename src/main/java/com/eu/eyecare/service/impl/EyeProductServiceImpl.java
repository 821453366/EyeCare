package com.eu.eyecare.service.impl;
import java.util.List;
import com.eu.eyecare.dao.EyeProductDao;
import com.eu.eyecare.entity.EyeProduct;
import com.eu.eyecare.service.EyeProductService;
public class EyeProductServiceImpl implements EyeProductService{
    private EyeProductDao eyeProductDao;
    @Override
    public long getEyeProductRowCount(){
        return eyeProductDao.getEyeProductRowCount();
    }
    @Override
    public List<EyeProduct> selectEyeProduct(){
        return eyeProductDao.selectEyeProduct();
    }
    @Override
    public EyeProduct selectEyeProductByObj(EyeProduct obj){
        return eyeProductDao.selectEyeProductByObj(obj);
    }
    @Override
    public EyeProduct selectEyeProductById(Integer id){
        return eyeProductDao.selectEyeProductById(id);
    }
    @Override
    public int insertEyeProduct(EyeProduct value){
        return eyeProductDao.insertEyeProduct(value);
    }
    @Override
    public int insertNonEmptyEyeProduct(EyeProduct value){
        return eyeProductDao.insertNonEmptyEyeProduct(value);
    }
    @Override
    public int deleteEyeProductById(Integer id){
        return eyeProductDao.deleteEyeProductById(id);
    }
    @Override
    public int updateEyeProductById(EyeProduct enti){
        return eyeProductDao.updateEyeProductById(enti);
    }
    @Override
    public int updateNonEmptyEyeProductById(EyeProduct enti){
        return eyeProductDao.updateNonEmptyEyeProductById(enti);
    }

    public EyeProductDao getEyeProductDao() {
        return this.eyeProductDao;
    }

    public void setEyeProductDao(EyeProductDao eyeProductDao) {
        this.eyeProductDao = eyeProductDao;
    }

}