package com.pivotal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import com.pivotal.domain.*;


@FeignClient(name = "${feign-target}")
public interface CityClient {

    @GetMapping(value="/cities", consumes="application/hal+json")
    Resources<City> getCities();
}