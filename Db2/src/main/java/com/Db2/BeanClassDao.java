package com.Db2;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BeanClassDao {
	public void getAllBeanClasss(){
		JdbcTemplate jdbcTemplate = null;
		String sql = "SELECT CASENAME#CIM FROM QUA.CASE_MASTER FETCH FIRST 20 ROWS ONLY";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for(Map<String, Object> row:rows){
			System.out.println(row.get("CASENAME#CIM").toString());
		}	
	}
}
