package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author itsNine
 * @create 2019-03-29 22:51
 */
@Data
@Table(name = "tb_brand")
public class Brand {

	@Id
	@KeySql(useGeneratedKeys = true)
	private Long id;
	private String name;
	private String image;
	private Character letter;
}
