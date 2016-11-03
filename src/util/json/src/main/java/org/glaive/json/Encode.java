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
                mapper.writeValue(new File("MetaData.json"), info);

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

        info.setBits_per_voxel(16);
        info.setNumber_of_channels(2);
        
        MetaData.Dimension dimension = new MetaData.Dimension();
        dimension.setDim_x(640);
        dimension.setDim_y(552);
        dimension.setDim_z(204);
        info.setDimension(dimension);
        
        info.setName("2015-07-11-johan");
        
        MetaData.Origin origin = new MetaData.Origin();
        origin.setOrigin_x(72739.042);
        origin.setOrigin_y(41644.696);
        origin.setOrigin_z(14966.719);
        info.setOrigin(origin);
        
        MetaData.Size size = new MetaData.Size();
        size.setSize_x(16001.76875);
        size.setSize_y(16099.7807971014);
        size.setSize_z(64066.5882352941);
        info.setSize(size);
        
        info.setUnit("micrometer");
        
        MetaData.VoxelSize voxelsize = new MetaData.VoxelSize();
        voxelsize.setVoxelsize_x(0.25002763671875);
        voxelsize.setVoxelsize_y(0.25155907495471);
        voxelsize.setVoxelsize_z(1.00104044117647);
        info.setVoxelsize(voxelsize);
        
        return info;

    }
}
