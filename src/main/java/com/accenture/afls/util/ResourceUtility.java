package com.accenture.afls.util;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class ResourceUtility {

    public void saveFileToDisk(List<MultipartFile> files,String filePath) throws IOException {
         try{
             for(MultipartFile file : files){
                 if(file.isEmpty()){
                     continue;
                 }
                 byte[] bytes = file.getBytes();
                 Path path = Paths.get(filePath + file.getOriginalFilename());
                 Files.write(path,bytes);
             }

         }catch (IOException e){
             throw e;
         }
    }
}
