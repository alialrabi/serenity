package com.mycompany.myapp.cucumber.stepdefs;

import com.mycompany.myapp.CucumberserenityApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CucumberserenityApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
