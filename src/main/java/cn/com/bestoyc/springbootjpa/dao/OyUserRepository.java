package cn.com.bestoyc.springbootjpa.dao;


import cn.com.bestoyc.springbootjpa.entity.OyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户JPA接口类，继承JPA的JpaRepository,利用Spring Data JPA 的JpaRepository实现数据的操作
 *
 */
public interface OyUserRepository extends JpaRepository<OyUser,String> {
}
