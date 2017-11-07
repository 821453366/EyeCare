package com.eu.front.dao;
import com.eu.front.entity.ProImg;
import java.util.List;
public interface ProImgDao{
	/**
	 * 获得ProImg数据的总行数
	 * @return
	 */
    long getProImgRowCount();
	/**
	 * 获得ProImg数据集合
	 * @return
	 */
    List<ProImg> selectProImg();
	/**
	 * 获得一个ProImg对象,以参数ProImg对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    ProImg selectProImgByObj(ProImg obj);
	/**
	 * 通过ProImg的id获得ProImg对象
	 * @param id
	 * @return
	 */
    ProImg selectProImgById(Integer id);
	/**
	 * 插入ProImg到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertProImg(ProImg value);
	/**
	 * 插入ProImg中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyProImg(ProImg value);
	/**
	 * 通过ProImg的id删除ProImg
	 * @param id
	 * @return
	 */
    int deleteProImgById(Integer id);
	/**
	 * 通过ProImg的id更新ProImg中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateProImgById(ProImg enti);
	/**
	 * 通过ProImg的id更新ProImg中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyProImgById(ProImg enti);
}