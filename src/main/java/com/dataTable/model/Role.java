package com.dataTable.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;




//    @OneToMany(mappedBy = "role",fetch = FetchType.LAZY)
//    private Set<User> users;

    public Role() {
    }

//    public Role(Set<User> users) {
//        this.users = users;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Set<User> getUsers() {
//        return users;
//    }

//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }


}

