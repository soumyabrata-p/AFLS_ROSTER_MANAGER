package com.accenture.afls.controller;


import com.accenture.afls.util.ResourceUtility;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@Component
@RestController
@RequestMapping("/rest/file")
public class FileHandlingResource {
    private final Logger logger = Logger.getLogger(FileHandlingResource.class);

    @Autowired
    private ResourceUtility resourceUtility;

    //Save the uploaded file to this folder(To be configurable from app.properties)
    //private static String UPLOADED_FOLDER = "D://hibarnate_jar//";

    @Value("${upload_filepath}")
    private String uploadDir;

    @PostMapping("/upload")
    public String uploadExcel(@RequestParam("file") MultipartFile uploadedFile) throws Exception {
        logger.debug("Entering Upload REST api");

        if(uploadedFile.isEmpty()) {
            logger.debug("No File Uploaded");
            return "No File Uploaded";
        }

        try{
            resourceUtility.saveFileToDisk(Arrays.asList(uploadedFile),uploadDir);

        }catch (Exception e){
            logger.error("Error while uploading : " + e.getMessage());
            throw e;
        }

        return "Success!";
    }
}
