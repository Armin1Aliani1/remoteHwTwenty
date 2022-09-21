package com.hwTwenty.repository;

import com.hwTwenty.base.BaseRepository;
import com.hwTwenty.domain.User;

public interface UserRepository extends BaseRepository<User> {
    boolean existsByUsername(String username);

    User findByUsername(String username);
}
