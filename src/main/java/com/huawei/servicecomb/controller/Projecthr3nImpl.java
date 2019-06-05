package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-06-05T11:38:24.304Z")

@RestSchema(schemaId = "projecthr3n")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projecthr3nImpl {

    @Autowired
    private Projecthr3nDelegate userProjecthr3nDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecthr3nDelegate.helloworld(name);
    }

}
