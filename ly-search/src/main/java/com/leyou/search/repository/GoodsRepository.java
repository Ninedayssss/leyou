package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author itsNine
 * @create 2019-04-06-11:50
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
