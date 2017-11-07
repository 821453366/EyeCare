package com.eu.eyecare.dao;
import com.eu.eyecare.entity.OrderDetails;
import java.util.List;
public interface OrderDetailsDao{
	/**
	 * 获得OrderDetails数据的总行数
	 * @return
	 */
    long getOrderDetailsRowCount();
	/**
	 * 获得OrderDetails数据集合
	 * @return
	 */
    List<OrderDetails> selectOrderDetails();
	/**
	 * 获得一个OrderDetails对象,以参数OrderDetails对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    OrderDetails selectOrderDetailsByObj(OrderDetails obj);
	/**
	 * 通过OrderDetails的id获得OrderDetails对象
	 * @param id
	 * @return
	 */
    OrderDetails selectOrderDetailsById(Integer id);
	/**
	 * 插入OrderDetails到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertOrderDetails(OrderDetails value);
	/**
	 * 插入OrderDetails中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyOrderDetails(OrderDetails value);
	/**
	 * 通过OrderDetails的id删除OrderDetails
	 * @param id
	 * @return
	 */
    int deleteOrderDetailsById(Integer id);
	/**
	 * 通过OrderDetails的id更新OrderDetails中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateOrderDetailsById(OrderDetails enti);
	/**
	 * 通过OrderDetails的id更新OrderDetails中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyOrderDetailsById(OrderDetails enti);
}