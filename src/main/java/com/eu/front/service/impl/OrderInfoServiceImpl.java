package com.eu.front.service.impl;
import java.util.List;
import com.eu.front.dao.OrderInfoDao;
import com.eu.front.entity.OrderInfo;
import com.eu.front.service.OrderInfoService;
public class OrderInfoServiceImpl implements OrderInfoService{
    private OrderInfoDao orderInfoDao;
    @Override
    public long getOrderInfoRowCount(){
        return orderInfoDao.getOrderInfoRowCount();
    }
    @Override
    public List<OrderInfo> selectOrderInfo(){
        return orderInfoDao.selectOrderInfo();
    }
    @Override
    public OrderInfo selectOrderInfoByObj(OrderInfo obj){
        return orderInfoDao.selectOrderInfoByObj(obj);
    }
    @Override
    public OrderInfo selectOrderInfoById(Integer id){
        return orderInfoDao.selectOrderInfoById(id);
    }
    @Override
    public int insertOrderInfo(OrderInfo value){
        return orderInfoDao.insertOrderInfo(value);
    }
    @Override
    public int insertNonEmptyOrderInfo(OrderInfo value){
        return orderInfoDao.insertNonEmptyOrderInfo(value);
    }
    @Override
    public int deleteOrderInfoById(Integer id){
        return orderInfoDao.deleteOrderInfoById(id);
    }
    @Override
    public int updateOrderInfoById(OrderInfo enti){
        return orderInfoDao.updateOrderInfoById(enti);
    }
    @Override
    public int updateNonEmptyOrderInfoById(OrderInfo enti){
        return orderInfoDao.updateNonEmptyOrderInfoById(enti);
    }

    public OrderInfoDao getOrderInfoDao() {
        return this.orderInfoDao;
    }

    public void setOrderInfoDao(OrderInfoDao orderInfoDao) {
        this.orderInfoDao = orderInfoDao;
    }

}