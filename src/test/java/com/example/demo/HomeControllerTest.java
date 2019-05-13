package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    private HomeController homeController = new HomeController();

    @Test
    public void index() {
        assertEquals("index",homeController.index());
    }
}