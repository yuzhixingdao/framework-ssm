package com.aac.framework.common.util.poi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.aac.framework.common.util.regex.RegexUtil;

/**
 * Time tools
 * 
 * @author ShenXiaoqiang
 * @date 2014-9-29
 * 
 */
public class DateUtil {

	/**
	 * yyyy-MM-dd
	 */
	public static final SimpleDateFormat format_one = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * yyyyMMdd
	 */
	public static final SimpleDateFormat format_two = new SimpleDateFormat("yyyyMMdd");
	/**
	 * yyyy.MM.dd
	 */
	public static final SimpleDateFormat format_three = new SimpleDateFormat("yyyy.MM.dd");
	/**
	 * yyyy/MM/dd
	 */
	public static final SimpleDateFormat format_five = new SimpleDateFormat("yyyy/MM/dd");
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final SimpleDateFormat format_threes = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * yyyyMMddHHmmss
	 */
	public static final SimpleDateFormat format_six = new SimpleDateFormat("yyyyMMddHHmmss");
	
	private static Calendar calendar = Calendar.getInstance();

	/**
	 * Obtaining this year
	 * 
	 * @return
	 */
	public static final Integer getYear() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		return year;
	}

	/**
	 * Obtain the year
	 * 
	 * @param date
	 * @return
	 */
	public static final Integer getYear(Date date) {
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		return year;
	}

	/**
	 * Obtain the year
	 * 
	 * @param date
	 * @return
	 */
	public static final Integer getYear(String date) {
		Integer year = null;
		try {
			Date dt = format_one.parse(date);

			calendar.setTime(dt);
			year = calendar.get(Calendar.YEAR);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return year;
	}
	
	/**
	 * Obtain the month
	 * @param date
	 * @return
	 */
	public static final Integer getMonth(Date date){
		calendar.setTime(date);
		int month = calendar.get(Calendar.MONTH);
		return month + 1;
	}
	
	/**
	 * Obtain the hour
	 * @param date
	 * @return
	 */
	public static final Integer getHour(Date date){
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR);
		return hour;
	}
	
	/**
	 * Obtain the minute
	 * @param date
	 * @return
	 */
	public static final Integer getMinute(Date date){
		calendar.setTime(date);
		int minute = calendar.get(Calendar.MINUTE);
		return minute;
	}
	
	/**
	 * Obtain the second
	 * @param date
	 * @return
	 */
	public static final Integer getSecond(Date date){
		calendar.setTime(date);
		int second = calendar.get(Calendar.SECOND);
		return second;
	}
	
	/**
	 * Obtain the day
	 * @param date
	 * @return
	 */
	public static final Integer getDay(Date date){
		calendar.setTime(date);
		int day = calendar.get(Calendar.DATE);
		return day;
	}
	
	/**
	 * 
	 * @return
	 */
	public static final String getStrDate(){
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		return "";
	}

	/**
	 * 
	 * @param str
	 * @return Date
	 */
	public static final Date str2Date(String str) {
		if (str != null) {
			try {
				if(str.indexOf("-") > 0){
					return format_one.parse(str);
				}
				if(str.indexOf(".") > 0){
					return format_three.parse(str);
				}
				if(str.indexOf("/") > 0){
					return format_five.parse(str);
				}
				if(RegexUtil.compareNumber(str)){
					return format_two.parse(str);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param str
	 * @param format
	 * @return
	 */
	public static final Date str2Date(String str, SimpleDateFormat format) {
		if (str != null) {
			try {
				return format.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 
	 * @param date
	 * @return yy-MM-dd
	 */
	public static final String date2Str(Date date){
		Integer year = getYear(date);
		Integer month = getMonth(date);
		Integer day = getDay(date);
		return year + "-" + month + "-" + day;
	}
	
	/**
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static final String date2Str(Date date, SimpleDateFormat format){
		if(date != null && format != null){
			return format.format(date);
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(getYear());
		System.out.println(getYear(new Date()));
		System.out.println(getYear("2014-09-25"));
		System.out.println(str2Date("20140515"));
		System.out.println(date2Str(new Date(), format_six));
	}

}
