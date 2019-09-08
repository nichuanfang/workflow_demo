package com.vencenter.workflow_demo.controller;

import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class ActivitiController {

    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private HistoryService historyService;

    @Autowired
    private ManagementService managementService;

    @RequestMapping(value = "/deploy",method = RequestMethod.GET)
    public void deploy() {
        Deployment first = repositoryService.createDeployment().addClasspathResource("processes/first.bpmn20.xml").tenantId("1").name("first").deploy();

    }


}
