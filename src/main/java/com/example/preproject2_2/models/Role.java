package com.example.preproject2_2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;


import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements GrantedAuthority{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    public Role(Long id) {
        this.setId(id);
    }
    @Override
    public String getAuthority() {
        return name;
    }
    @Override
    public String toString() {
        return  String.format("Role [id = %d; name = %s;]", this.getId(), name);
    }
}
