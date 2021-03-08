package com.kyocoolcool.mastermicroservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/8 10:28 AM
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
