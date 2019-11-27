package demo.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * description:Users
 * author:zwj
 */
@Data
@Entity
@Table(name = "user")
public class Users {
    @Id
    @Column(name = "user_id")
    String userId;

    @Column(name = "user_name")
    String username;

    @Column
    String password;

    @Column
    String email;
}
