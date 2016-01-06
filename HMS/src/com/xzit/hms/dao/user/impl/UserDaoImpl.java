/**  
* @Title: UserDaoImpl.java <br>
* @Package com.xzit.hms.dao.user.impl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月5日 下午11:26:52 <br>
* @version V1.0 <br>
*/ 
package com.xzit.hms.dao.user.impl;

import org.springframework.stereotype.Repository;

import com.xzit.hms.bean.user.User;
import com.xzit.hms.dao.impl.BaseDaoImpl;

/**
* @ClassName: UserDaoImpl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月5日 下午11:26:52 <br>
* @version V1.0  <br>
*/
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> {

}
