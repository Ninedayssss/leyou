package com.leyou.search.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author itsNine
 * @create 2019-04-06-11:21
 */
@FeignClient("item-service")
public interface CategoryClient extends CategoryApi {

}
