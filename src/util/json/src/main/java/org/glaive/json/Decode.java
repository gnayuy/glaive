/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glaive.json;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author yy
 */
public class Decode {
    public static void main(String[] args) {
        Decode obj = new Decode();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            MetaData info = mapper.readValue(new File("MetaData.json"), MetaData.class);
            System.out.println(info);
            
            //Pretty print
            String prettyInfo = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(info);
            System.out.println(prettyInfo);
            
            // test
            System.out.println("channels: " + info.getChannels());
            
            System.out.println("dimx: " + info.getDimension().getDy());

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
