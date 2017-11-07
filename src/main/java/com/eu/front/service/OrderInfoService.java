package com.eu.front.service;
import java.util.List;
import com.eu.front.entity.OrderInfo;
public interface OrderInfoService{
	/**
	 * 获得OrderInfo数据的总行数
	 * @return
	 */
    long getOrderInfoRowCount();
	/**
	 * 获得OrderInfo数据集合
	 * @return
	 */
    List<OrderInfo> selectOrderInfo();
	/**
	 * 获得一个OrderInfo对象,以参数OrderInfo对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    OrderInfo selectOrderInfoByObj(OrderInfo obj);
	/**
	 * 通过OrderInfo的id获得OrderInfo对象
	 * @param id
	 * @return
	 */
    OrderInfo selectOrderInfoById(Integer id);
	/**
	 * 插入OrderInfo到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertOrderInfo(OrderInfo value);
	/**
	 * 插入OrderInfo中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyOrderInfo(OrderInfo value);
	/**
	 * 通过OrderInfo的id删除OrderInfo
	 * @param id
	 * @return
	 */
    int deleteOrderInfoById(Integer id);
	/**
	 * 通过OrderInfo的id更新OrderInfo中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateOrderInfoById(OrderInfo enti);
	/**
	 * 通过OrderInfo的id更新OrderInfo中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyOrderInfoById(OrderInfo enti);
}