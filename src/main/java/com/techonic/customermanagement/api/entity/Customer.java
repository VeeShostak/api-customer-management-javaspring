package com.techonic.customermanagement.api.entity;



import com.techonic.customermanagement.api.entity.audit.AuditEntity;
import lombok.*;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer", schema = "crm")
public class Customer extends AuditEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    // Freshman, Sophomore... Grad
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_level_code_type_code", nullable = false)
    private SchoolLevelCode schoolLevelCode;


}
