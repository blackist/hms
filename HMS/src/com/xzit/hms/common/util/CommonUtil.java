/**  
* @Title: CommonUtil.java
* @Package com.xzit.ar.common.util
* @Description: TODO
* @author Mr.Black
* @date 2015年12月10日 下午5:09:50
* @version V1.0  
*/
package com.xzit.hms.common.util;

import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import com.xzit.hms.common.exception.ExceptionCode;
import com.xzit.hms.common.exception.UtilException;

/**
 * @ClassName: CommonUtil
 * @Description: TODO 通用工具类
 * @author Mr.Black
 * @date 2015年12月10日 下午5:09:50
 * @version V1.0
 */
public class CommonUtil {

	/**
	 * random
	 */
	private static final Random RANDOM = new Random();

	/**
	 * @Title: isEmpty @Description: TODO 判断字符串是否为空 @param @param
	 *         str @param @return @return boolean @author Mr.Black @date
	 *         2015年12月10日 下午5:19:15 @throws
	 */
	public static boolean isEmpty(String str) {
		if (str == null || "".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @Title: isNotEmpty @Description: TODO 字符串是否不为空 @param @param
	 *         str @param @return @return boolean @author Mr.Black @date
	 *         2015年12月10日 下午5:18:05 @throws
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * 
	 * @Title: isEmpty @Description: TODO 判断字符串是否为空 @param @param
	 *         t @param @return @return boolean @author Mr.Black @date
	 *         2015年12月10日 下午5:18:44 @throws
	 */
	public static <T> boolean isEmpty(T[] t) {
		return t == null || t.length == 0;
	}

	/**
	 * 
	 * @Title: isNotEmpty @Description: TODO 判断字符串是否不为空 @param @param
	 *         t @param @return @return boolean @author Mr.Black @date
	 *         2015年12月10日 下午5:19:42 @throws
	 */
	public static <T> boolean isNotEmpty(T[] t) {
		return !isEmpty(t);
	}

	/**
	 * 
	 * @Title: isEmpty <br>
	 * @Description: TODO 判断集合是否为空<br>
	 * @param @param
	 *            col
	 * @param @return
	 *            <br>
	 * @return boolean <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:23:30 <br>
	 * @throws <br>
	 */
	public static boolean isEmpty(Collection<?> col) {
		return col == null || col.isEmpty();
	}

	/**
	 * @Title: isNotEmpty <br>
	 * @Description: TODO 集合不为NULL也不为空 <br>
	 * @param @param
	 *            col
	 * @param @return
	 *            <br>
	 * @return boolean <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:23:56 <br>
	 * @throws <br>
	 */
	public static boolean isNotEmpty(Collection<?> col) {
		return !isEmpty(col);
	}

	/**
	 * @Title: isEmpty <br>
	 * @Description: TODO 集合不为NULL也不为空 <br>
	 * @param @param
	 *            map
	 * @param @return
	 *            <br>
	 * @return boolean <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:24:12 <br>
	 * @throws <br>
	 */
	public static boolean isEmpty(Map<?, ?> map) {
		return map == null || map.isEmpty();
	}

	/**
	 * @Title: isNotEmpty <br>
	 * @Description: TODO 集合不为NULL也不为空 <br>
	 * @param @param
	 *            map
	 * @param @return
	 *            <br>
	 * @return boolean <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:24:27 <br>
	 * @throws <br>
	 */
	public static boolean isNotEmpty(Map<?, ?> map) {
		return !isEmpty(map);
	}

	/**
	 * @Title: lowerCaseFirstChar <br>
	 * @Description: TODO 字符串第一个字母小写<br>
	 * @param @param
	 *            str
	 * @param @return
	 *            <br>
	 * @return String <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:24:41 <br>
	 * @throws <br>
	 */
	public static String lowerCaseFirstChar(String str) {
		if (isNotEmpty(str)) {
			char firstChar = str.charAt(0);
			if (Character.isUpperCase(firstChar)) {
				StringBuilder sb = new StringBuilder(str);
				sb.setCharAt(0, Character.toLowerCase(firstChar));
				str = sb.toString();
			}
		}
		return str;
	}

	/**
	 * 
	 * @Title: isNull <br>
	 * @Description: TODO 判断是否是空对象 <br>
	 * @param @param
	 *            obj
	 * @param @return
	 *            <br>
	 * @return boolean <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:27:00 <br>
	 * @throws <br>
	 */
	public static boolean isNull(Object obj) {
		return null == obj;
	}

	/**
	 * @Title: getUUID <br>
	 * @Description: TODO 获取UUID值 <br>
	 * @param @return
	 *            <br>
	 * @return String <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:27:54 <br>
	 * @throws <br>
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 
	 * @Title: getRandomNumber <br>
	 * @Description: TODO 获取指定位数的随机数 <br>
	 * @param @param
	 *            size
	 * @param @return
	 *            <br>
	 * @return String <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:29:19 <br>
	 * @throws <br>
	 */
	public static String getRandomNumber(int size) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append((char) ('0' + RANDOM.nextInt(10)));
		}
		return sb.toString();
	}

	/**
	 * 
	 * @Title: messageFormat <br>
	 * @Description: TODO 消息格式化<br>
	 * @return String <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月21日 下午1:10:20 <br>
	 * @throws <br>
	 */
	public static String messageFormat(String message, Object... params) {
		return isNotEmpty(params) ? MessageFormat.format(message, params) : message;
	}

	/**
	 * 
	 * @Title: getRandomChar <br>
	 * @Description: TODO 获取指定位数随机字符串 <br>
	 * @param @param
	 *            size
	 * @param @return
	 *            <br>
	 * @return String <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月10日 下午5:31:53 <br>
	 * @throws <br>
	 */
	public static String getRandomChar(int size) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			switch (RANDOM.nextInt(10) % 3) {
			case 0:
				sb.append((char) ('0' + RANDOM.nextInt(10)));
				break;
			case 1:
				sb.append((char) ('a' + RANDOM.nextInt(26)));
				break;
			case 2:
				sb.append((char) ('A' + RANDOM.nextInt(26)));
				break;
			default:
				;
			}
		}
		return sb.toString();
	}

	/**
	 * @Description: TODO 对字符串进行md5加密<br>
	 * @param @param
	 *            s
	 * @param @return
	 * @param @throws
	 *            UtilException <br>
	 * @return String <br>
	 * @author Mr.Black <br>
	 * @date 2015年12月30日 下午6:44:58 <br>
	 */
	public static final String md5(String s) throws UtilException {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = s.getBytes();
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			throw new UtilException(ExceptionCode.MD5_ERROR_10036, "MD5加密失败");
		}
	}

	/**
	* @Description: TODO 数组转换为字符串<br>
	* @param @param objs
	* @param @return <br>
	* @return String <br>
	* @author Mr.Black <br>
	* @date 2015年12月30日 下午6:48:38 <br>
	 */
	public static String arr2String(Object[] objs) {
		StringBuffer sb = new StringBuffer();
		if ((objs != null) && (objs.length != 0)) {
			for (int i = 0; i < objs.length; i++) {
				if (objs[i] instanceof String[]) {
					String[] strArray = (String[]) objs[i];
					for (String str : strArray) {
						sb.append(str);
					}
				} else {
					sb.append(objs[i]);
				}
			}
		}
		return sb.toString();
	}
	
	
}
