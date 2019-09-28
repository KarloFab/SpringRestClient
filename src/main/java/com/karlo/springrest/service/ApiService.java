package com.karlo.springrest.service;

import com.karlo.springrest.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
