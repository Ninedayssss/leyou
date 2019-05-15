package com.leyou.page.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author itsNine
 * @create 2019-04-06-11:47
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
