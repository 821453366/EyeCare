package com.eu.eyecare.dao;
import com.eu.eyecare.entity.EyeProduct;

import java.util.List;
import java.util.Map;

public interface EyeProductDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryUser(Map<String, Object> data) throws Exception;

	Long queryUserCount(String eyeProductReal) throws Exception;

	/**
	 * 插入管理员
	 *
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