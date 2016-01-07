/**  
* @Title: UserServiceImpl.java <br>
* @Package com.xzit.hms.service.user.impl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:44:56 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.service.user.impl;

import org.springframework.stereotype.Component;
import com.xzit.hms.service.user.UserService;

/**
 * @ClassName: UserServiceImpl <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午9:44:56 <br>
 * @version V1.0 <br>
 */
@Component("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void test() {
		System.out.println("TEST SUCCESS!");
	}
}
