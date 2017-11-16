package com.eu.eyecare.service;
import java.util.List;
import java.util.Map;

import com.eu.eyecare.entity.EyeProduct;
import com.eu.eyecare.utils.PageUtil;

public interface EyeProductService{
	/**
	 * 用户信息
	 * @param
	 * @return
	 */
	List<Map<String,String>>  insertUser(PageUtil pageUtil, String proName) throws Exception;

	/**
	 * 插入管理员
	 * @param eyeProduct
	 */
	void addUser(EyeProduct eyeProduct) throws Exception;

	/**
	 * 通过ID删除用户
	 * @param id
	 */
	void deleteUser(int id) throws Exception;

	/**
	 * 通过ID查询用户信息
	 * @param id
	 * @return
	 */
	List<EyeProduct> findById(int id) throws Exception;
	/**
	 * 查找用户信息
	 * @param username
	 * @return
	 */
	EyeProduct queryUserInfo(String username);

	/**
	 * 更新用户信息
	 * @param eyeProduct
	 */
	void updateUserInfo(EyeProduct eyeProduct);
}