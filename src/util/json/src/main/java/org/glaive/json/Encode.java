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
public class Encode {
    public static void main(String[] args) {
        Encode obj = new Encode();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        MetaData staff = createDummyObject();

        try {
                // Convert object to JSON string and save into a file directly
                mapper.writeValue(new File("metainfo.json"), staff);

                // Convert object to JSON string
                String jsonInString = mapper.writeValueAsString(staff);
                System.out.println(jsonInString);

                // Convert object to JSON string and pretty print
                jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
                System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private MetaData createDummyObject() {

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");
        
        MetaData staff = new MetaData("mkyong", 33, "Developer", new BigDecimal("7500"), skills);

        return staff;

    }
}
