package com.kyocoolcool.mastermicroservices.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/3/6 7:18 PM
 */
@RestController
public class VersioningController {
    @GetMapping("/v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Chris Chen");
    }

    @GetMapping("/v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Chris", "Chen"));
    }

    @GetMapping(value = "/person/param", params = "version=1")
    public PersonV1 paramV1() {
        return new PersonV1("Chris Chen");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Chris", "Chen"));
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 headerV1() {
        return new PersonV1("Chris Chen");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2() {
        return new PersonV2(new Name("Chris", "Chen"));
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 produceV1() {
        return new PersonV1("Chris Chen");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 produceV2() {
        return new PersonV2(new Name("Chris", "Chen"));
    }
}
