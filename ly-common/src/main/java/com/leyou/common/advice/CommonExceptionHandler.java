package com.leyou.common.advice;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author itsNine
 * @create 2019-03-28 20:11
 */
@ControllerAdvice
public class CommonExceptionHandler {

	@ExceptionHandler(LyException.class)
	public ResponseEntity<ExceptionResult> handleException(LyException e){
		ExceptionEnum em = e.getExceptionEnum();
		return ResponseEntity.status(e.getExceptionEnum().getCode())
				.body(new ExceptionResult(e.getExceptionEnum()));
	}
}
