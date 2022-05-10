package com.example.learn_english.base.domain.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@Data
@MappedSuperclass
public class BaseModel<Audit> {
    @CreatedDate
    @Column(
            insertable = true,
            updatable = false,
            name = "create_time",
            columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'")
    private LocalDateTime createTime;

    @CreatedBy
    @Column(insertable = true, updatable = false, name = "created_by")
    private Audit createdBy;

    @LastModifiedDate
    @Column(
            insertable = true,
            updatable = true,
            name = "update_time",
            columnDefinition =
                    "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'")
    private LocalDateTime updateTime;

    @LastModifiedBy
    @Column(name = "updated_by", insertable = true, updatable = true)
    private Audit updatedBy;

}
