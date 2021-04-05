package com.techonic.customermanagement.api.entity.audit;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;

import static com.techonic.customermanagement.api.configuration.AppConsts.DB_AUDIT_PROGRAM_NAME;

@Getter
@Setter
@MappedSuperclass
public class AuditEntity {

    @Column(name = "create_user_id", length = 8)
    private String createUserId;

    @Column(name = "last_update_user_id", length = 8)
    private String lastUpdateUserId;

    @Column(name = "create_timestamp", nullable = false)
    private OffsetDateTime createTimestamp;

    @Column(name = "last_update_timestamp", nullable = false)
    private OffsetDateTime lastUpdateTimestamp;


    /**
     * Sets the audit fields for insert. Called before saving any entity in to database.
     */
    @PrePersist
    public void prePersist() {
        setCreateUserId((DB_AUDIT_PROGRAM_NAME));
        setLastUpdateUserId((DB_AUDIT_PROGRAM_NAME));
        setCreateTimestamp(OffsetDateTime.now());
        setLastUpdateTimestamp(OffsetDateTime.now());
    }

    /**
     * Sets the audit fields for update. Called before saving any entity in to database.
     */
    @PreUpdate
    public void preUpdate() {
        setLastUpdateUserId(DB_AUDIT_PROGRAM_NAME);
        setLastUpdateTimestamp(OffsetDateTime.now());
    }
}
