package com.dctmz.demo.controller;

import java.util.List;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("discovery")
public class DiscoveryController {

  @NacosInjected
  private NamingService namingService;

  @RequestMapping(value = "/service")
  @ResponseBody
  public List<Instance> get(String serviceName) throws NacosException {
    return namingService.getAllInstances(serviceName);
  }
}
