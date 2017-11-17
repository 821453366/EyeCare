package com.eu.eyecare.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eu.eyecare.dao.RevisitDao;
import com.eu.eyecare.entity.Revisit;
import com.eu.eyecare.service.RevisitService;
import com.eu.eyecare.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RevisitServiceImpl implements RevisitService{
    @Autowired
    private RevisitDao revisitDao;

    @Override
    public List<Map<String, String>> insertRevist(PageUtil page, String proName) throws Exception {
        String revisitReal="%"+proName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        page.setTotalSize(revisitDao.queryRevistCount());

        return revisitDao.queryRevist(data);
    }

    @Override
    public void addRevist(Revisit revisit) throws Exception{


        revisitDao.addRevist(revisit);

    }
    @Override
    public void deleteRevist(int id) throws Exception{
        revisitDao.deleteRevist(id);
    }
    @Override
    public List<Revisit> findById(int id)throws Exception {
        return revisitDao.findById(id);
    }

    @Override
    public Revisit queryRevistInfo(String username) {
        try {
            return revisitDao.queryRevistInfo(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateRevistInfo(Revisit revisit) {
        try {
            revisitDao.updateRevistInfo(revisit);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}