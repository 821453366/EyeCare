package com.eu.eyecare.dao;
import com.eu.eyecare.entity.ProPushinfo;
import java.util.List;
public interface ProPushinfoDao{
	/**
	 * 获得ProPushinfo数据的总行数
	 * @return
	 */
    long getProPushinfoRowCount();
	/**
	 * 获得ProPushinfo数据集合
	 * @return
	 */
    List<ProPushinfo> selectProPushinfo();
	/**
	 * 获得一个ProPushinfo对象,以参数ProPushinfo对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    ProPushinfo selectProPushinfoByObj(ProPushinfo obj);
	/**
	 * 通过ProPushinfo的id获得ProPushinfo对象
	 * @param id
	 * @return
	 */
    ProPushinfo selectProPushinfoById(Integer id);
	/**
	 * 插入ProPushinfo到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertProPushinfo(ProPushinfo value);
	/**
	 * 插入ProPushinfo中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyProPushinfo(ProPushinfo value);
	/**
	 * 通过ProPushinfo的id删除ProPushinfo
	 * @param id
	 * @return
	 */
    int deleteProPushinfoById(Integer id);
	/**
	 * 通过ProPushinfo的id更新ProPushinfo中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateProPushinfoById(ProPushinfo enti);
	/**
	 * 通过ProPushinfo的id更新ProPushinfo中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyProPushinfoById(ProPushinfo enti);
}