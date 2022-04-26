package com.rudy.ryanto.redisom.domain;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import com.redis.om.spring.annotations.Searchable;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;


@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Builder
@Document
public class SearchboxModel implements Serializable {
    @Id
    @Indexed
    private String id;
    @Indexed
    @NonNull
    private String menuId;
    private String subMenuId;
    @Indexed
    @NonNull
    @Searchable
    private String autoKeyword;
    @NonNull
    @Indexed
    private String additionalKeyword;
    @NonNull
    @Indexed
    private Integer priority;
    @NonNull
    @Indexed
    private Integer isNew;
    @NonNull
    @Indexed
    private Integer isDeleted;
}