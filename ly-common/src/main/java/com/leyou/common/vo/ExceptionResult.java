package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author itsNine
 * @create 2019-03-28 20:53
 */
@Data
public class ExceptionResult {
	private int status;
	private String message;
	private Long timetamp;

	public ExceptionResult(ExceptionEnum em) {
		this.status = em.getCode();
		this.message = em.getMsg();
		this.timetamp = System.currentTimeMillis();

	}
}
