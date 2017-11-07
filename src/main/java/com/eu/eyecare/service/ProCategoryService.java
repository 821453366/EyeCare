package com.eu.eyecare.service;
import java.util.List;
import com.eu.eyecare.entity.ProCategory;
public interface ProCategoryService{
	/**
	 * 获得ProCategory数据的总行数
	 * @return
	 */
    long getProCategoryRowCount();
	/**
	 * 获得ProCategory数据集合
	 * @return
	 */
    List<ProCategory> selectProCategory();
	/**
	 * 获得一个ProCategory对象,以参数ProCategory对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    ProCategory selectProCategoryByObj(ProCategory obj);
	/**
	 * 通过ProCategory的id获得ProCategory对象
	 * @param id
	 * @return
	 */
    ProCategory selectProCategoryById(Integer id);
	/**
	 * 插入ProCategory到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertProCategory(ProCategory value);
	/**
	 * 插入ProCategory中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyProCategory(ProCategory value);
	/**
	 * 通过ProCategory的id删除ProCategory
	 * @param id
	 * @return
	 */
    int deleteProCategoryById(Integer id);
	/**
	 * 通过ProCategory的id更新ProCategory中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateProCategoryById(ProCategory enti);
	/**
	 * 通过ProCategory的id更新ProCategory中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyProCategoryById(ProCategory enti);
}