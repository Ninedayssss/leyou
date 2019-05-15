package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author itsNine
 * @create 2019-03-29 9:29
 */
public interface CategoryMapper extends Mapper<Category>, IdListMapper<Category,Long> {
}
