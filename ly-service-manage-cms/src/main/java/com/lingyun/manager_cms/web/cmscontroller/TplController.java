package com.lingyun.manager_cms.web.cmscontroller;

import com.lingyun.api.cmsapi.TplControllerApi;
import com.lingyun.manager_cms.service.cmsservice.TplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@RestController
public class TplController implements TplControllerApi{
    @Autowired
    private TplService tplService;

}