package com.mattfiriton.cbc.cucumber.stepdefs;

import com.mattfiriton.cbc.CbcApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CbcApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
