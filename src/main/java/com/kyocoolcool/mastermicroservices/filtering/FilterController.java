package com.kyocoolcool.mastermicroservices.filtering;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/6 4:49 PM
 */
@RestController
public class FilterController {
    @RequestMapping(value = "/retrievedSomeBean")
    public SomeBean retrievedSomeBean() {
        return new SomeBean("value1","value2","value3");
    }

    @RequestMapping(value = "/retrievedAllSomeBean")
    public List<SomeBean> retrievedAllSomeBean() {
        List<SomeBean> someBeans = List.of(new SomeBean("value1", "value2", "value3"),
                new SomeBean("value2-1", "value2-2", "value2-3"));
        return someBeans;
    }
}
