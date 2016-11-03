/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glaive.json;

/**
 *
 * @author yy
 */
public class MetaData {

    public static class Dimension {
        private int dim_x, dim_y, dim_z;
        
        public int getDim_x() {
            return dim_x;
        }

        public int getDim_y() {
            return dim_y;
        }

        public int getDim_z() {
            return dim_z;
        }
        
        public void setDim_x(int dim_x) {
            this.dim_x = dim_x;
        }

        public void setDim_y(int dim_y) {
            this.dim_y = dim_y;
        }

        public void setDim_z(int dim_z) {
            this.dim_z = dim_z;
        }
    }
    
    public static class Origin {
        private double origin_x, origin_y, origin_z;

        public double getOrigin_x() {
            return origin_x;
        }

        public double getOrigin_y() {
            return origin_y;
        }

        public double getOrigin_z() {
            return origin_z;
        }

        public void setOrigin_x(double origin_x) {
            this.origin_x = origin_x;
        }

        public void setOrigin_y(double origin_y) {
            this.origin_y = origin_y;
        }

        public void setOrigin_z(double origin_z) {
            this.origin_z = origin_z;
        }
    }
    
    public static class VoxelSize {
        private double voxelsize_x, voxelsize_y, voxelsize_z;

        public double getVoxelsize_x() {
            return voxelsize_x;
        }

        public double getVoxelsize_y() {
            return voxelsize_y;
        }

        public double getVoxelsize_z() {
            return voxelsize_z;
        }

        public void setVoxelsize_x(double voxelsize_x) {
            this.voxelsize_x = voxelsize_x;
        }

        public void setVoxelsize_y(double voxelsize_y) {
            this.voxelsize_y = voxelsize_y;
        }

        public void setVoxelsize_z(double voxelsize_z) {
            this.voxelsize_z = voxelsize_z;
        }
    }
    
    public static class Size {
        private double size_x, size_y, size_z;

        public double getSize_x() {
            return size_x;
        }

        public double getSize_y() {
            return size_y;
        }

        public double getSize_z() {
            return size_z;
        }

        public void setSize_x(double size_x) {
            this.size_x = size_x;
        }

        public void setSize_y(double size_y) {
            this.size_y = size_y;
        }

        public void setSize_z(double size_z) {
            this.size_z = size_z;
        }
    }
     
    private String name; // name of the specimen
    private String unit; // "micrometer"/"nanometer"
    private Dimension dimension;
    private Origin origin;
    private VoxelSize voxelsize;
    private Size size;
    private int bits_per_voxel;
    private int number_of_channels;
    
    public MetaData()
    {
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Origin getOrigin() {
        return origin;
    }

    public VoxelSize getVoxelsize() {
        return voxelsize;
    }

    public Size getSize() {
        return size;
    }

    public int getBits_per_voxel() {
        return bits_per_voxel;
    }

    public int getNumber_of_channels() {
        return number_of_channels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public void setVoxelsize(VoxelSize voxelsize) {
        this.voxelsize = voxelsize;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setBits_per_voxel(int bits_per_voxel) {
        this.bits_per_voxel = bits_per_voxel;
    }

    public void setNumber_of_channels(int number_of_channels) {
        this.number_of_channels = number_of_channels;
    }
}
