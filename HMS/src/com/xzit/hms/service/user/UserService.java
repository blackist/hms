/**  
* @Title: UserService.java <br>
* @Package com.xzit.hms.service.user <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月4日 下午9:42:59 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.service.user;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.user.User;

/**
 * @ClassName: UserService <br>
 * @Description: TODO <br>
 * @author Mr.Black <br>
 * @date 2016年1月4日 下午9:42:59 <br>
 * @version V1.0 <br>
 */
public interface UserService {

	/**
	 * @Title: save
	 * @Description: TODO save
	 * @param @param user   
	 * @return void 
	 * @throws
	 */
	public void save(User user);
	
	/**
	 * @Title: delete
	 * @Description: TODO delete
	 * @param @param user   
	 * @return void 
	 * @throws
	 */
	public void delete(User user);
	
	/**
	 * @Title: getUserById
	 * @Description: TODO getUserById
	 * @param @param id
	 * @param @return   
	 * @return User 
	 * @throws
	 */
	public User getUserById(Integer id);

	/**
	 * @Title: getUser
	 * @Description: TODO getUser
	 * @param @param user
	 * @param @return   
	 * @return User 
	 * @throws
	 */
	public User getUser(User user);
	
	/**
	 * @Title: updateUser
	 * @Description: TODO updateUser
	 * @param @param user   
	 * @return void 
	 * @throws
	 */
	public void updateUser(User user);

	/**
	 * @Title: queryUsers
	 * @Description: TODO queryUsers
	 * @param @param pagecode
	 * @param @param pagesize
	 * @param @param queryStr
	 * @param @return   
	 * @return PageBean<Map<String,Object>> 
	 * @throws
	 */
	public PageBean<Map<String, Object>> queryUsers(int pagecode, int pagesize, String queryStr);
}
