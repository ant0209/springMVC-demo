package cn.boy2b.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 * @desc 日期工具
 * @author zhouwei
 * @date 2015年11月19日 下午8:17:58
 */
public class DateUtil {

	public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public static final String NORMAL_FORMAT = "yyyy-MM-dd HH:mm";

	public static final String DATE_FORMAT = "yyyy-MM-dd";

	/**
	 *@desc 得到当前时间的默认格式
	 *@author zhouwei
	 *@date 2019-6-17 10:45
	 */
	public static String getCurrentDateString() {
		return toDefaultString(new Date());
	}

	/**
	 * @desc 将字符串转化为指定格式的日期
	 * @param dateStr
	 * @param format
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:28:28
	 */
	public static Date toDate(String dateStr, String format) {
		if (StringUtils.isBlank(dateStr)) {
			return null;
		}
		if (StringUtils.isBlank(format)) {
			format = DEFAULT_FORMAT;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(dateStr);
		}
		catch (ParseException e) {
		}
		return null;
	}
	
	/**
	 * @desc 转换为yyyy-MM-dd HH:mm:ss格式的日期
	 * @param dateStr
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:32:14
	 */
	public static Date toDefaultDate(String dateStr) {
		return toDate(dateStr, DEFAULT_FORMAT);
	}
	
	/**
	 * @desc 转换为yyyy-MM-dd HH:mm格式的日期
	 * @param dateStr
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:32:44
	 */
	public static Date toNormalDate(String dateStr) {
		return toDate(dateStr, NORMAL_FORMAT);
	}
	
	/**
	 * @desc 转换为yyyy-MM-dd格式的日期
	 * @param dateStr
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:32:57
	 */
	public static Date toDate(String dateStr) {
		return toDate(dateStr, DATE_FORMAT);
	}
	
	/**
	 * @desc 将日期转换为指定格式的字符串
	 * @param date
	 * @param format
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:37:00
	 */
	public static String toString(Date date, String format) {
		if (date == null) {
			return null;
		}
		if (StringUtils.isBlank(format)) {
			format = DEFAULT_FORMAT;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	/**
	 * @desc 将日期转换为yyyy-MM-dd HH:mm:ss字符串
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:39:03
	 */
	public static String toDefaultString(Date date) {
		return toString(date, DEFAULT_FORMAT);
	}
	
	/**
	 * @desc 将日期转换为yyyy-MM-dd HH:mm字符串
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:39:36
	 */
	public static String toNormalString(Date date) {
		return toString(date, NORMAL_FORMAT);
	}
	
	/**
	 * @desc 将日期转换为yyyy-MM-dd字符串
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:39:47
	 */
	public static String toString(Date date) {
		return toString(date, DATE_FORMAT);
	}
	
	/**
	 * @desc 将日期转换为指定格式的日期
	 * @param date
	 * @param format
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:44:14
	 */
	public static Date toDate(Date date, String format) {
		String dateStr = toString(date, format);
		if (StringUtils.isBlank(dateStr)) {
			return null;
		}
		return toDate(dateStr, format);
	}
	
	/**
	 * @desc 将日期转换为yyyy-MM-dd HH:mm:ss格式的日期
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:44:30
	 */
	public static Date toDefaultDate(Date date) {
		return toDate(date, DEFAULT_FORMAT);
	}
	
	/**
	 * @desc 将日期转换为yyyy-MM-dd HH:mm格式的日期
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:44:52
	 */
	public static Date toNormalDate(Date date) {
		return toDate(date, NORMAL_FORMAT);
	}
	
	/**
	 * @desc 将日期转换为yyyy-MM-dd格式的日期
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2015年11月19日 下午8:45:05
	 */
	public static Date toDate(Date date) {
		return toDate(date, DATE_FORMAT);
	}
	
	/**
	 * @desc 将日期字符串中的符号和空格去掉
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2016年3月8日 下午1:50:46
	 */
	public static String toNumberDate(String date) {
		if (StringUtils.isBlank(date)) {
			return "";
		}
		// 将-或者:或者空格替换为空串
		return date.replaceAll("-|:| ", "");
	}
	
	/**
	 * @desc 将日期转换为20160310的字符串
	 * @param date
	 * @return 
	 * @author zhouwei
	 * @date 2016年3月8日 下午1:56:34
	 */
	public static String toDateNumberDate(Date date) {
		String dateStr = toString(date);
		return toNumberDate(dateStr);
	}
}
