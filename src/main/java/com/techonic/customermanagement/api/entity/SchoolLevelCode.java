package com.techonic.customermanagement.api.entity;

import com.techonic.customermanagement.api.entity.audit.AuditEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "school_level_code", schema = "crm")
public class SchoolLevelCode extends AuditEntity implements Serializable {

    @Id
    @Column(name = "school_level_code_type_code", nullable = false)
    private long schoolLevelCodeTypeCode;

    @Column(name = "school_level_code_type_desc", length = 80)
    private String SchoolLevelCodeTypeDesc;

}
