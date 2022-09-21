package com.hwTwenty.repository.impl;

import com.hwTwenty.base.impl.BaseRepositoryImpl;
import com.hwTwenty.domain.User;
import com.hwTwenty.repository.UserRepository;

public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {
    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public boolean existsByUsername(String username) {
        return em.createQuery("select (count (p) > 0) from User p where p.username =: username", Boolean.class)
                .setParameter("username", username).getSingleResult();
    }

    @Override
    public User findByUsername(String username) {
        return em.createQuery("select p from User p where p.username =: username", User.class)
                .setParameter("username", username).getSingleResult();
    }

}
