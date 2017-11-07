package com.eu.eyecare.service;
import java.util.List;
import com.eu.eyecare.entity.Revisit;
public interface RevisitService{
	/**
	 * 获得Revisit数据的总行数
	 * @return
	 */
    long getRevisitRowCount();
	/**
	 * 获得Revisit数据集合
	 * @return
	 */
    List<Revisit> selectRevisit();
	/**
	 * 获得一个Revisit对象,以参数Revisit对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Revisit selectRevisitByObj(Revisit obj);
	/**
	 * 通过Revisit的id获得Revisit对象
	 * @param id
	 * @return
	 */
    Revisit selectRevisitById(Object id);
	/**
	 * 插入Revisit到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertRevisit(Revisit value);
	/**
	 * 插入Revisit中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyRevisit(Revisit value);
	/**
	 * 通过Revisit的id删除Revisit
	 * @param id
	 * @return
	 */
    int deleteRevisitById(Object id);
	/**
	 * 通过Revisit的id更新Revisit中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateRevisitById(Revisit enti);
	/**
	 * 通过Revisit的id更新Revisit中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyRevisitById(Revisit enti);
}