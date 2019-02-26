package com.bind;

import com.example.Example;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class TestExampleBind {

    public static void main(String[] args){
        try {
            String fileName = "sample01.json";
            String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + fileName;
            File jsonFile = new File(filePath);
            ObjectMapper objectMapper = new ObjectMapper();
            Example example = objectMapper.readValue(jsonFile, Example.class);

            System.out.println(example.getInApplication().getAssessments().get(0).getContent().get3().get(0).get0().getOptions().get(0).getText());

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
