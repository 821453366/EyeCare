package com.eu.eyecare.service;
import java.util.List;
import com.eu.eyecare.entity.EyeUser;
public interface EyeUserService{
	/**
	 * 获得EyeUser数据的总行数
	 * @return
	 */
    long getEyeUserRowCount();
	/**
	 * 获得EyeUser数据集合
	 * @return
	 */
    List<EyeUser> selectEyeUser();
	/**
	 * 获得一个EyeUser对象,以参数EyeUser对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EyeUser selectEyeUserByObj(EyeUser obj);
	/**
	 * 通过EyeUser的id获得EyeUser对象
	 * @param id
	 * @return
	 */
    EyeUser selectEyeUserById(Integer id);
	/**
	 * 插入EyeUser到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEyeUser(EyeUser value);
	/**
	 * 插入EyeUser中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEyeUser(EyeUser value);
	/**
	 * 通过EyeUser的id删除EyeUser
	 * @param id
	 * @return
	 */
    int deleteEyeUserById(Integer id);
	/**
	 * 通过EyeUser的id更新EyeUser中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEyeUserById(EyeUser enti);
	/**
	 * 通过EyeUser的id更新EyeUser中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEyeUserById(EyeUser enti);
}