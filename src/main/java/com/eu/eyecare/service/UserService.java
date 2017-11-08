package com.eu.eyecare.service;

import com.eu.eyecare.entity.EyeEmp;
import com.eu.eyecare.utils.PageUtil;
import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 用户信息
     * @param
     * @return
     */
    List<Map<String,String>>  insertUser(PageUtil pageUtil,String empName) throws Exception;

    /**
     * 插入管理员
     * @param eyeEmp
     */
    void addUser(EyeEmp eyeEmp) throws Exception;

    /**
     * 通过ID删除用户
     * @param id
     */
    void deleteUser(String id) throws Exception;

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
