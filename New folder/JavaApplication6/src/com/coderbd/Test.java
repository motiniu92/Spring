/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Md Abdul Motin
 */
public class Test {
    public static void main(String[] args) {
          ApplicationContext context = new ClassPathXmlApplicationContext("com/coderbd/applicationContext.xml");
        Hello hello = (Hello) context.getBean("motin");
        hello.setName("Motin vai");
        System.out.println(hello.getName());
    }
}
