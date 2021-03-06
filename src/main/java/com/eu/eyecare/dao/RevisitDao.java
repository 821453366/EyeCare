package com.eu.eyecare.dao;
import com.eu.eyecare.entity.Revisit;
import java.util.List;
import java.util.Map;

public interface RevisitDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryRevist(Map<String, Object> data) throws Exception;

	Long queryRevistCount() throws Exception;

	/**
	 * 插入管理员
	 *
	 * @param revisit
	 */
	void addRevist(Revisit revisit) throws Exception;

	/**
	 * 通过ID删除用户
	 * @param id
	 */
	void deleteRevist(int id) throws Exception;

	/**
	 * 通过ID查询用户信息
	 * @param id
	 * @return
	 */
	List<Revisit> findById(int id) throws Exception;

	/**
	 * 查找用户信息
	 * @param username
	 * @return
	 */
	Revisit queryRevistInfo(String username);
	/**
	 * 更新用户信息
	 * @param revisit
	 */
	void updateRevistInfo(Revisit revisit);
}