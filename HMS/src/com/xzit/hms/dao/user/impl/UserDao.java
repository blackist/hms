/**  
* @Title: UserDaoImpl.java <br>
* @Package com.xzit.hms.dao.user.impl <br>
* @Description: TODO <br>
* @author Mr.Black <br>
* @date 2016年1月5日 下午11:26:52 <br>
* @version V1.0 <br>
*/
package com.xzit.hms.dao.user.impl;

import java.util.Map;

import com.xzit.hms.bean.page.PageBean;
import com.xzit.hms.bean.user.User;
import com.xzit.hms.dao.impl.BaseDaoImpl;

/**
 * @ClassName: UserDaoImpl <br>
 * @Description: TODO UserDao<br>
 * @author Mr.Black <br>
 * @date 2016年1月5日 下午11:26:52 <br>
 * @version V1.0 <br>
 */
public class UserDao extends BaseDaoImpl<User> {

	@SuppressWarnings({ "unchecked" })
	public PageBean<Map<String, Object>> queryUsers(int pagecode, int pagesize, String queryStr) {
		PageBean<Map<String, Object>> pb = new PageBean<>();

		pb.setPagecode(pagecode);
		pb.setPagesize(pagesize);

		String where = "where (u.userName like '%" + queryStr + "%' or r.roleName like '%" + queryStr
				+ "%') and r.roleId = u.userRole";

		String sqlRows = "select count(*) from User u, Role r " + where;
		int totalrecards = ((Number) session.createQuery(sqlRows).uniqueResult()).intValue();

		pb.setTotalrecards(totalrecards);

		String sql = "select new map(u.userId as userId, u.userName as userName, r.roleName as roleName) from User u, Role r "
				+ where;
		pb.setBeanlist(
				session.createQuery(sql).setFirstResult((pagecode - 1) * pagesize).setMaxResults(pagesize).list());
		session.close();
		return pb;
	}
}
