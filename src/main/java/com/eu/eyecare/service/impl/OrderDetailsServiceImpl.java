package com.eu.eyecare.service.impl;
import java.util.List;
import com.eu.eyecare.dao.OrderDetailsDao;
import com.eu.eyecare.entity.OrderDetails;
import com.eu.eyecare.service.OrderDetailsService;
public class OrderDetailsServiceImpl implements OrderDetailsService{
    private OrderDetailsDao orderDetailsDao;
    @Override
    public long getOrderDetailsRowCount(){
        return orderDetailsDao.getOrderDetailsRowCount();
    }
    @Override
    public List<OrderDetails> selectOrderDetails(){
        return orderDetailsDao.selectOrderDetails();
    }
    @Override
    public OrderDetails selectOrderDetailsByObj(OrderDetails obj){
        return orderDetailsDao.selectOrderDetailsByObj(obj);
    }
    @Override
    public OrderDetails selectOrderDetailsById(Integer id){
        return orderDetailsDao.selectOrderDetailsById(id);
    }
    @Override
    public int insertOrderDetails(OrderDetails value){
        return orderDetailsDao.insertOrderDetails(value);
    }
    @Override
    public int insertNonEmptyOrderDetails(OrderDetails value){
        return orderDetailsDao.insertNonEmptyOrderDetails(value);
    }
    @Override
    public int deleteOrderDetailsById(Integer id){
        return orderDetailsDao.deleteOrderDetailsById(id);
    }
    @Override
    public int updateOrderDetailsById(OrderDetails enti){
        return orderDetailsDao.updateOrderDetailsById(enti);
    }
    @Override
    public int updateNonEmptyOrderDetailsById(OrderDetails enti){
        return orderDetailsDao.updateNonEmptyOrderDetailsById(enti);
    }

    public OrderDetailsDao getOrderDetailsDao() {
        return this.orderDetailsDao;
    }

    public void setOrderDetailsDao(OrderDetailsDao orderDetailsDao) {
        this.orderDetailsDao = orderDetailsDao;
    }

}