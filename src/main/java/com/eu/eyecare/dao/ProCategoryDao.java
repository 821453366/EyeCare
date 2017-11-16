package com.eu.eyecare.dao;
import com.eu.eyecare.entity.ProCategory;
import java.util.List;
import java.util.Map;

public interface ProCategoryDao{

	List<Map<String,Object>> add (ProCategory proCategory);

	List<Map<String,Object>> query ();
}