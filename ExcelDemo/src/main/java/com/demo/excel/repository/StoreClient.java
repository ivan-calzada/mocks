package com.demo.excel.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.excel.model.CreateRequest;

@FeignClient(name = "store", url = "http://127.0.0.1:3000")
public interface StoreClient {
	
    //@RequestMapping(method = RequestMethod.GET, value = "/stores")
    //List<Store> getStores();

    @RequestMapping(method = RequestMethod.POST, value = "/server/ws/merchant", consumes = "application/json")
    ResponseEntity<?> process(@RequestBody CreateRequest createRequest );
}
