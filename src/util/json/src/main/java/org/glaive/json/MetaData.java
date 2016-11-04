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
        private int dx, dy, dz;

        public int getDx() {
            return dx;
        }

        public int getDy() {
            return dy;
        }

        public int getDz() {
            return dz;
        }

        public void setDx(int dx) {
            this.dx = dx;
        }

        public void setDy(int dy) {
            this.dy = dy;
        }

        public void setDz(int dz) {
            this.dz = dz;
        }
    }
    
    public static class Origin {
        private double ox, oy, oz;

        public double getOx() {
            return ox;
        }

        public double getOy() {
            return oy;
        }

        public double getOz() {
            return oz;
        }

        public void setOx(double ox) {
            this.ox = ox;
        }

        public void setOy(double oy) {
            this.oy = oy;
        }

        public void setOz(double oz) {
            this.oz = oz;
        }
    }
    
    public static class VoxelSize {
        private double vx, vy, vz;

        public double getVx() {
            return vx;
        }

        public double getVy() {
            return vy;
        }

        public double getVz() {
            return vz;
        }

        public void setVx(double vx) {
            this.vx = vx;
        }

        public void setVy(double vy) {
            this.vy = vy;
        }

        public void setVz(double vz) {
            this.vz = vz;
        }
    }
    
    public static class Size {
        private double sx, sy, sz;

        public double getSx() {
            return sx;
        }

        public double getSy() {
            return sy;
        }

        public double getSz() {
            return sz;
        }

        public void setSx(double sx) {
            this.sx = sx;
        }

        public void setSy(double sy) {
            this.sy = sy;
        }

        public void setSz(double sz) {
            this.sz = sz;
        }
    }
     
    private String name; // name of the specimen
    private String unit; // "micrometer"/"nanometer"
    private Dimension dimension;
    private Origin origin;
    private VoxelSize voxelsize;
    private Size size;
    private int bits; // bits_per_voxel;
    private int channels; // number_of_channels
    
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

    public int getBits() {
        return bits;
    }

    public int getChannels() {
        return channels;
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

    public void setBits(int bits) {
        this.bits = bits;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    
}
