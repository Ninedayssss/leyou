package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author itsNine
 * @create 2019-03-28 20:42
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

	CATEGORY_NOT_FOND(404,"商品分类未查到"),
	BRAND_NOT_FOUND(404,"品牌未找到"),
	BRAND_SAVE_ERROR(500,"新增品牌失败"),
	UPLOAD_FILE_ERROR(500,"文件上传失败"),
	SPEC_GROUP_CREATE_FAILED(500,"商品规格组创建失败"),
	SPEC_PARAM_NOT_FOND(404,"商品规格参数不存在"),
	GOODS_NOT_FOND(404,"商品不存在"),
	GOODS_DETAIL_NOT_FOND(404,"商品详情不存在"),
	GOODS_SKU_NOT_FOND(404,"商品SKU不存在"),
	GOODS_STOCK_NOT_FOND(404,"商品库存不存在"),
	DELETE_SPEC_GROUP_FAILED(500,"商品规格组删除失败"),
	UPDATE_SPEC_GROUP_FAILED(500,"商品规格组更新失败"),
	INVALID_PARAM(400,"参数错误"),
	SPEC_PARAM_CREATED_FAILED(500,"商品规格参数创建失败"),
	DELETE_SPEC_PARAM_FAILED(500,"商品规格参数删除失败"),
	UPDATE_SPEC_PARAM_FAILED(500,"商品规格参数更新i"),
	SPEC_GROUP_NOT_FOND(404,"商品规格组不存在"),
	INVALID_FILE_TYPE(400,"无效文件类型"),
	GOODS_SAVE_ERROR(500,"新增商品失败"),
	GOODS_UPDATE_ERROR(500,"商品更新失败"),
	GOODS_ID_CANNOT_BE_NULL(400,"商品id不能为空")
	;
	private int code;
	private String msg;


}
