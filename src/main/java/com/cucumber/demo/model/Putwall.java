package com.cucumber.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Putwall implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Integer putwallId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "putwallInPutClass",updatable = true,insertable = true)
    private List<Put> puts;
    @Column private String putwallName;
    @Column private Integer putsCapacity;
    @Column private boolean putwallLight;
}
