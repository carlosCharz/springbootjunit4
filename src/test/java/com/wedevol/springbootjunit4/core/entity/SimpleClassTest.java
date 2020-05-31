package com.wedevol.springbootjunit4.core.entity;

import org.junit.Test;
import org.springframework.util.Assert;

public class SimpleClassTest {

    @Test
    public void lineArraySplitNotEmptyTest() {
        String line = "4567|arturo|perez|teleport engineering manager|Germany|Telecommunications|3|176";
        String[] lineParts = line.split("\\|");
        Assert.notEmpty(lineParts, "The array should not be empty");
    }

}
