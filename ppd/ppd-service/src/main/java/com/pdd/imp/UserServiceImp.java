/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package com.pdd.imp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pdd.service.UserService;
import com.pdd.user.User;
@Repository
public class UserServiceImp implements UserService{

	
	public Map<String, Object> select(String id) {
		Map<String, Object> returnValMap = new HashMap<String,Object>();
		returnValMap.put("id", "123");
		returnValMap.put("name", "张三");
		returnValMap.put("age", 27);
		return returnValMap;
	}
	
}