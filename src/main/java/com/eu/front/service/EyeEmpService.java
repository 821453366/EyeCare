package com.eu.front.service;
import java.util.List;
import com.eu.front.entity.EyeEmp;
public interface EyeEmpService{
	/**
	 * 获得EyeEmp数据的总行数
	 * @return
	 */
    long getEyeEmpRowCount();
	/**
	 * 获得EyeEmp数据集合
	 * @return
	 */
    List<EyeEmp> selectEyeEmp();
	/**
	 * 获得一个EyeEmp对象,以参数EyeEmp对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EyeEmp selectEyeEmpByObj(EyeEmp obj);
	/**
	 * 通过EyeEmp的id获得EyeEmp对象
	 * @param id
	 * @return
	 */
    EyeEmp selectEyeEmpById(Integer id);
	/**
	 * 插入EyeEmp到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEyeEmp(EyeEmp value);
	/**
	 * 插入EyeEmp中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEyeEmp(EyeEmp value);
	/**
	 * 通过EyeEmp的id删除EyeEmp
	 * @param id
	 * @return
	 */
    int deleteEyeEmpById(Integer id);
	/**
	 * 通过EyeEmp的id更新EyeEmp中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEyeEmpById(EyeEmp enti);
	/**
	 * 通过EyeEmp的id更新EyeEmp中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEyeEmpById(EyeEmp enti);
}