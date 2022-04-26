package com.rudy.ryanto.redisom.repository;

import com.redis.om.spring.repository.RedisDocumentRepository;
import com.rudy.ryanto.redisom.domain.SearchboxModel;

public interface SearchboxModelRepository extends RedisDocumentRepository<SearchboxModel,String> {
}
