package com.bonc.vms.gateway.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Title: vms
 * @Package: com.bonc.vms.gateway.util
 * @Description: 常量
 * @Author: dreamcc
 * @Date: 2019/12/11 17:27
 * @Version: V1.0
 */
public class Const {
	/**
	 * 消息体解码常量
	 */
	@Getter
	@AllArgsConstructor
	public enum XMLFramework{
		/**
		 * 消息头长度
		 */
		HEAD_LENGTH("消息头长度",28),
		/**
		 * 版本信息
		 */
		VERSION("版本",0x0100),
		/**
		 * 指令类型 ：二进制
		 */
		CMDTYPE_BINARY("指令类型",1);
		/**
		 * 说明
		 */
		private String name;
		/**
		 * 值
		 */
		private int value;
	}

	/**
	 * 厂家
	 */
	public static final String XMLFRAMEWORK_COMPANY_TYPE= "BST.";

}
