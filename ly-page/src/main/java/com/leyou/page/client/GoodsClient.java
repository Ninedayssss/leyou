package com.leyou.page.client;

import com.leyou.item.api.GoodsAPi;
import org.springframework.cloud.openfeign.FeignClient;


/**
 * @author itsNine
 * @create 2019-04-06-11:25
 */
@FeignClient("item-service")
public interface GoodsClient extends GoodsAPi {

}
