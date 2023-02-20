package com.cybersoft.DemoJPA.repository;

import com.cybersoft.DemoJPA.dto.RoleDTO;
import com.cybersoft.DemoJPA.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Annotation bean: class đã khởi tạo và gán giá trị đưa lên ioc(container dùng chung)
//Vd: @Component, @Service, @Repository, @Bean: là giống nhau nhưng khác tên để thể hiện chức năng
//                              khác nhau, và thường được khai báo ở @Configuration

@Repository
// JpaRepository<Tên Entity, Kiểu dữ liệu khóa chính(khóa của Entity)>
public interface RoleRepository extends JpaRepository<Roles, Integer> {
    List<Roles> findByName(String name);
}
