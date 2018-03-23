package com.service.ccdev.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-23T15:10:16.921Z")

@RestSchema(schemaId = "ccdev")
@RequestMapping(path = "/cc-dev", produces = MediaType.APPLICATION_JSON)
public class CcdevImpl {

    @Autowired
    private CcdevDelegate userCcdevDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCcdevDelegate.helloworld(name);
    }

}
