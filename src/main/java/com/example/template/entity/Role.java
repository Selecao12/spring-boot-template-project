package com.example.template.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role", schema = "template_schema")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users = new ArrayList<>();

}
