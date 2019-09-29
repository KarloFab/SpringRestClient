package com.karlo.springrest.service;

import com.karlo.springrest.domain.User;
import com.karlo.springrest.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate
                .getForObject("https://private-anon-a1ae473ace-apifaketory.apiary-mock.com/api/user?limit=" + limit,
                        UserData.class);
        return userData.getData();
    }
}
