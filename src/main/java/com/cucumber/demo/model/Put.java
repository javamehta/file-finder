package com.cucumber.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Put implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Integer putId;
    @Column private Integer putSize;
    @Column private String putName;
    @Column private Integer putwallId;
    @Column private String itemName;
    @ManyToOne
    @JoinColumn(name = "userId", updatable = true, insertable = true) private User userId;
    @Column private Integer putCapacity;
    @Column private boolean putLight;
    @ManyToOne(fetch = FetchType.LAZY) private Putwall putwallInPutClass;


}