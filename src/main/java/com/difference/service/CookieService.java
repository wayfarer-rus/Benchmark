package com.difference.service;

import com.difference.repository.CookieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.difference.model.Cookie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aleksandrprendota on 05.08.17.
 */
@Service
public class CookieService {

    @Autowired
    private CookieRepository cookieRepository;

    public List<Cookie> getAllCookie(){
        List<Cookie> cookies = new ArrayList<>();
        cookieRepository.findAll().forEach(cookies::add);
        return cookies;
    }
}
