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
            MetaData staff = mapper.readValue(new File("metainfo.json"), MetaData.class);
            System.out.println(staff);
            
            //Pretty print
            String prettyStaff = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            System.out.println(prettyStaff);

            // Convert JSON string to Object
            String jsonInString = "{\"name\":\"mkyong1\",\"salary\":7500,\"skills\":[\"java\",\"python\"]}";
            MetaData staff1 = mapper.readValue(jsonInString, MetaData.class);
            System.out.println(staff1);

            //Pretty print
            String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff1);
            System.out.println(prettyStaff1);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
