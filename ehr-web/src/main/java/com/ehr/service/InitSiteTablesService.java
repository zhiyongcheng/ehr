package com.ehr.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


public interface InitSiteTablesService {
    public boolean initSiteTables(String name,Integer siteId,String status,String type);
}
