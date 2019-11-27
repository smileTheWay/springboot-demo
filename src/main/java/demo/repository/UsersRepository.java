package demo.repository;

import demo.dto.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * description:UsersRepository
 * author:zwj
 */
@Repository
public interface  UsersRepository extends JpaRepository<Users, String> {
    Users findByUsername(String username);
}
