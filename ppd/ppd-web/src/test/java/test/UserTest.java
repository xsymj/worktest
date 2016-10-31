/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package test;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.pdd.service.UserService;

@ContextConfiguration(locations={"classpath:spring-beans.xml"})  
public class UserTest {
	@Resource
	UserService userService;
	
	public void test(){
		
	}
}