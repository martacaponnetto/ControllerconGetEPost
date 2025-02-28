package com.develhope.ControllerConGetEPost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    public String getName(@RequestParam String name){
        return name;

    }
    @RequestMapping(method = RequestMethod.POST, path = "/reverseName")
    public String reverseName(@RequestBody String name){
        StringBuilder reversedName =new StringBuilder().append(name).reverse();
        return reversedName.toString();
    }
}
