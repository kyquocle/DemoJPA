package com.cybersoft.DemoJPA.repository;

import com.cybersoft.DemoJPA.dto.UserDTO;
import com.cybersoft.DemoJPA.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    List<Users> findByEmailAndPassword(String email, String password);
    //Thêm xóa sửa JPA đã hỗ trợ không cần phải tạo hàm

    @Query("select u from users as u")
    List<Users> getAllUser();

    @Query("select u from users as u join roles r on u.roles.id = r.id where u.email = ?1 and r.name = ?2")
    public List<Users> getByEmailAndRoleName(String email, String roleName);
}
