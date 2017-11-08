package com.eu.eyecare.dao;

import com.eu.eyecare.entity.EyeEmp;

import java.util.List;
import java.util.Map;

public interface UserDao {
    /**
     * 分页查询数据
     */
    List<Map<String, String>> queryUser(Map<String, Object> data) throws Exception;

    Long queryUserCount() throws Exception;

    /**
     * 插入管理员
     *
     * @param eyeEmp
     */
    void addUser(EyeEmp eyeEmp) throws Exception;

    /**
     * 通过ID删除用户
     * @param empId
     */
    void deleteUser(String empId) throws Exception;

    /**
     * 通过ID查询用户信息
     * @param empId
     * @return
     */
    List<EyeEmp> findById(int empId) throws Exception;

    /**
     * 查找用户信息
     * @param username
     * @return
     */
    EyeEmp queryUserInfo(String username);
    /**
     * 更新用户信息
     * @param eyeEmp
     */
    void updateUserInfo(EyeEmp eyeEmp);
}
