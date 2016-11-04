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

        MetaData info = createDummyObject();

        try {
                // Convert object to JSON string and save into a file directly
                //mapper.writeValue(new File("MetaData.json"), info);
                mapper.writerWithDefaultPrettyPrinter().writeValue(new File("MetaData.json"), info);

                // Convert object to JSON string
                String jsonInString = mapper.writeValueAsString(info);
                System.out.println(jsonInString);

                // Convert object to JSON string and pretty print
                jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(info);
                System.out.println(jsonInString);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private MetaData createDummyObject() {
        
        MetaData info = new MetaData();

        info.setBits(16);
        info.setChannels(2);
        
        MetaData.Dimension dimension = new MetaData.Dimension();
        dimension.setDx(640);
        dimension.setDy(552);
        dimension.setDz(204);
        info.setDimension(dimension);
        
        info.setName("2015-07-11-johan");
        
        MetaData.Origin origin = new MetaData.Origin();
        origin.setOx(72739.042);
        origin.setOy(41644.696);
        origin.setOz(14966.719);
        info.setOrigin(origin);
        
        MetaData.Size size = new MetaData.Size();
        size.setSx(16001.76875);
        size.setSy(16099.7807971014);
        size.setSz(64066.5882352941);
        info.setSize(size);
        
        info.setUnit("micrometer");
        
        MetaData.VoxelSize voxelsize = new MetaData.VoxelSize();
        voxelsize.setVx(0.25002763671875);
        voxelsize.setVy(0.25155907495471);
        voxelsize.setVz(1.00104044117647);
        info.setVoxelsize(voxelsize);
        
        return info;

    }
}
