package com.leyou.search.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author itsNine
 * @create 2019-04-06-11:46
 */
@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {

}
