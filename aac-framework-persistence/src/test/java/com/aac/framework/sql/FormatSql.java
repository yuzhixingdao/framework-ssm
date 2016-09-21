package com.aac.framework.sql;

public class FormatSql {

	public static String formatColumn(String sql, String aliase) {

		//sql = sql.toUpperCase();
		//aliase = aliase.toUpperCase();

		String[] columns = sql.split(", +");

		String sqlFormat = "";

		for (int i = 0; i < columns.length; i++) {
			sqlFormat += aliase + "." + columns[i] + " " + (aliase + "_" + columns[i]);
			if (i < columns.length - 1) {
				sqlFormat += ", ";
			}
		}

		return sqlFormat;
	}
	
	/**
	 * 
	 * @param sql
	 * @param aliase
	 * @return <result property="conName" column="NT_CONTRACTOR_CON_NAME" />
	 */
	public static String formatResultMap(String sql, String aliase){
		
		//aliase = aliase.toUpperCase();
		sql = sql.toLowerCase();
		
		String[] columns = sql.split(", +");

		String resultMapFormat = "";

		for (int i = 0; i < columns.length; i++) {
			
			String column = columns[i];
			String[] strs = column.split("_");
			for (int j = 1; j < strs.length; j++) {
				String upperCase = strs[j].substring(0, 1).toUpperCase();
				strs[j] = upperCase + strs[j].substring(1);
			}
			String property = "";
			for (int j = 0; j < strs.length; j++) {
				property += strs[j];
			}
			
			//column = aliase  + "_" +  column.toUpperCase();
			column = aliase  + "_" +  column;
			
			
			resultMapFormat += "<result property=\""+property+"\" column=\""+column+"\" />";
			
		}
		
		return resultMapFormat;
	}
	
	/**
	 * 
	 * @param sql
	 * @return #{conId}, #{conName,jdbcType=VARCHAR}
	 */
	public static String formatInsertValue(String sql){
		
		sql = sql.toLowerCase();
		
		String[] columns = sql.split(", +");

		String valueFormat = "";

		for (int i = 0; i < columns.length; i++) {
			
			String column = columns[i];
			String[] strs = column.split("_");
			for (int j = 1; j < strs.length; j++) {
				String upperCase = strs[j].substring(0, 1).toUpperCase();
				strs[j] = upperCase + strs[j].substring(1);
			}
			String property = "";
			for (int j = 0; j < strs.length; j++) {
				property += strs[j];
			}
			
			valueFormat += "#{"+property+"}";
			
			if (i < columns.length - 1) {
				valueFormat += ", ";
			}
			
		}
		
		return valueFormat;
		
	}
	
	/**
	 * 
	 * @param sql
	 * @param jdbcType
	 * @return #{conId}, #{conName,jdbcType=VARCHAR}
	 */
	public static String formatInsertValue(String sql, String jdbcType){
		
		sql = sql.toLowerCase();
		
		String[] columns = sql.split(", +");
		
		String valueFormat = "";
		
		for (int i = 0; i < columns.length; i++) {
			
			String column = columns[i];
			String[] strs = column.split("_");
			for (int j = 1; j < strs.length; j++) {
				String upperCase = strs[j].substring(0, 1).toUpperCase();
				strs[j] = upperCase + strs[j].substring(1);
			}
			String property = "";
			for (int j = 0; j < strs.length; j++) {
				property += strs[j];
			}
			
			valueFormat += "#{"+property+",jdbcType="+jdbcType+"}";
			
			if (i < columns.length - 1) {
				valueFormat += ", ";
			}
			
		}
		
		return valueFormat;
		
	}
	
	/**
	 * 
	 * @param sql
	 * @return <set>
					<if test="conName != null">CON_NAME=#{conName},</if>
				</set>
	 */
	public static String formatUpdate(String sql){
		sql = sql.toLowerCase();
		
		String[] columns = sql.split(", +");

		String updateFormat = "<set>";

		for (int i = 0; i < columns.length; i++) {
			
			String column = columns[i];
			String[] strs = column.split("_");
			for (int j = 1; j < strs.length; j++) {
				String upperCase = strs[j].substring(0, 1).toUpperCase();
				strs[j] = upperCase + strs[j].substring(1);
			}
			String property = "";
			for (int j = 0; j < strs.length; j++) {
				property += strs[j];
			}
			
			if(i < columns.length-1){
				//updateFormat += "<if test=\""+property+" != null\">"+column.toUpperCase()+"=#{"+property+"},</if>";
				updateFormat += "<if test=\""+property+" != null\">"+column+"=#{"+property+"},</if>";
			}else{
				//updateFormat += "<if test=\""+property+" != null\">"+column.toUpperCase()+"=#{"+property+"}</if>";
				updateFormat += "<if test=\""+property+" != null\">"+column+"=#{"+property+"}</if>";
			}
			
		}
		
		return updateFormat + "</set>";
	}

	public static void main(String[] args) {

		String sql = "id, task_id, claim_code, task_type, flow_id, org_id, dispatch_date, updated_by, updated_date, gg_vehicle_id, gg_vehicle_code, person_name, person_phone, state_code, person_id, predict_arrive_date, predict_finish_date, dispatch_person_id, dispatch_person_name, submit_date, submit_sum, invoice_no, repair_site_name, send_phone_flag, auto_send_phone_flag, auto_flag, auto_model, mobile_receiver_date, mobile_accept_date, trail_car_start_date, trail_car_start_lng, trail_car_start_lat, trail_car_end_date, trail_car_end_lng, trail_car_end_lat, arrive_scene_date, arrive_scene_lng, arrive_scene_lat, vehicle_status, invoice_flag, out_car_price, trailer_mileage, price_standardid, price_standard, save_price, wait_price, loss_sum, price_type, receive_date, deal_date, drive_line, bespeak_date, survey_place, survey_lng, survey_lat, eval_place, eval_place_lng, eval_place_lat, pay_company, update_flag, cancel_date, create_date, cancel_descrip, toll_price, toll_pay_type, start_odometer, arrive_odometer, end_odometer, number_plate, product_model, vehicle_name, rescue_item_type, rescue_remark, moble_phone, jieche_phone, moble_phone_name, jieche_phone_name, save_vehicle_type, dispatch_descrip, is_five_ring, acceptance_ask_date, acceptance_success_date, devolve_flag, sms_send_flag, lx_btgs_state, lx_btwh_state, lx_dpwz_state, lx_fdls_state, lx_hhdl_state, lx_htgj_state, lx_jygj_state, lx_kj_state, lx_rylx_state, lx_sfgz_state, lx_sfybt_state, lx_wz_state, lx_yh, lx_ss, tc_clwz_type, tc_fxp_state, tc_jsd_state, tc_pd_state, tc_shousha_type, tc_tcg_state, tc_tckj_state, tc_wd_state, tc_xg_state, tc_dw_state, tc_ck, await_date, await_state";
		String aliase = "lp_flow_task";
		
		String sqlFormat = formatColumn(sql, aliase);
		System.out.println(sqlFormat);
		
		String resultMapFormat = formatResultMap(sql, aliase);
		System.out.println(resultMapFormat);
		
		String insertValueFormat = formatInsertValue(sql);
		System.out.println(insertValueFormat);
		
		insertValueFormat = formatInsertValue(sql, "VARCHAR");
		System.out.println(insertValueFormat);
		
		String updateFormat = formatUpdate(sql);
		System.out.println(updateFormat);

	}
	
}
