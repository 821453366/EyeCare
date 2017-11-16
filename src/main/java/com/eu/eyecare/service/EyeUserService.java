package com.eu.eyecare.service;
import java.util.List;
import java.util.Map;

import com.eu.eyecare.entity.EyeUser;
import com.eu.eyecare.entity.EyeUser;
import com.eu.eyecare.utils.PageUtil;

public interface EyeUserService{
	/**
	 * 用户信息
	 * @param
	 * @return
	 */
	List<Map<String,Object>>  insertUser(PageUtil pageUtil, String empName) throws Exception;

	/**
	 * 插入管理员
	 * @param eyeUser
	 */
	void addUser(EyeUser eyeUser) throws Exception;

	/**
	 * 通过ID删除用户
	 * @param id
	 */
	void deleteUser(int id) throws Exception;

	/**
	 * 通过ID查询用户信息
	 * @param empId
	 * @return
	 */
	List<EyeUser> findById(int empId) throws Exception;
	/**
	 * 查找用户信息
	 * @param username
	 * @return
	 */
	EyeUser queryUserInfo(String username);

	/**
	 * 更新用户信息
	 * @param eyeUser
	 */
	void updateUserInfo(EyeUser eyeUser);
}