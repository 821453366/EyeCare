package com.eu.eyecare.service;
import java.util.List;
import com.eu.eyecare.entity.EyeProduct;
public interface EyeProductService{
	/**
	 * 获得EyeProduct数据的总行数
	 * @return
	 */
    long getEyeProductRowCount();
	/**
	 * 获得EyeProduct数据集合
	 * @return
	 */
    List<EyeProduct> selectEyeProduct();
	/**
	 * 获得一个EyeProduct对象,以参数EyeProduct对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EyeProduct selectEyeProductByObj(EyeProduct obj);
	/**
	 * 通过EyeProduct的id获得EyeProduct对象
	 * @param id
	 * @return
	 */
    EyeProduct selectEyeProductById(Integer id);
	/**
	 * 插入EyeProduct到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEyeProduct(EyeProduct value);
	/**
	 * 插入EyeProduct中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEyeProduct(EyeProduct value);
	/**
	 * 通过EyeProduct的id删除EyeProduct
	 * @param id
	 * @return
	 */
    int deleteEyeProductById(Integer id);
	/**
	 * 通过EyeProduct的id更新EyeProduct中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEyeProductById(EyeProduct enti);
	/**
	 * 通过EyeProduct的id更新EyeProduct中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEyeProductById(EyeProduct enti);
}