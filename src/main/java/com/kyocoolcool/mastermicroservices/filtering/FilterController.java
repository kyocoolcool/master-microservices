package com.kyocoolcool.mastermicroservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
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

    //field1,field2
    @RequestMapping(value = "/retrievedAllSomeBean")
    public MappingJacksonValue retrievedAllSomeBean() {
        List<SomeBean> someBeans = List.of(new SomeBean("value1", "value2", "value3"),
                new SomeBean("value2-1", "value2-2", "value2-3"));
        MappingJacksonValue mapping = new MappingJacksonValue(someBeans);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mapping.setFilters(filters);
        return mapping;
    }

    //field2,field3
    @RequestMapping(value = "/retrievedAllSomeBean-list")
    public MappingJacksonValue retrievedAllSomeBeanList() {
        List<SomeBean> someBeans = List.of(new SomeBean("value1", "value2", "value3"),
                new SomeBean("value2-1", "value2-2", "value2-3"));
        MappingJacksonValue mapping = new MappingJacksonValue(someBeans);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2","field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
        mapping.setFilters(filters);
        return mapping;
    }
}
