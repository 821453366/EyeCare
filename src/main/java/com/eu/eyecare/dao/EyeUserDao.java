package com.eu.eyecare.dao;
import com.eu.eyecare.entity.EyeUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EyeUserDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, Object>> queryUser(Map<String, Object> data) throws Exception;

	Long queryUserCount(String username) throws Exception;

	/**
	 * 插入管理员
	 *
	 * @param eyeUser
	 */
	void addUser(EyeUser eyeUser) throws Exception;

	/**
	 * 通过ID删除用户
	 * @param empId
	 */
	void deleteUser(int empId) throws Exception;

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