package com.dctmz.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("config")
public class ConfigController {

  @NacosValue("${useLocalCache:false}")
  private boolean useLocalCache;

  @RequestMapping(value = "/get")
  @ResponseBody
  public boolean get() {
    return useLocalCache;
  }

}
