package com.example.daxiongmao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName basic_info
 */
@TableName(value ="basic_info")
@Data
public class BasicInfo implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer number;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String englishName;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private String dna;

    /**
     * 
     */
    private String image;

    /**
     * 
     */
    private String roostPosition;

    /**
     * 
     */
    private String birth;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BasicInfo other = (BasicInfo) that;
        return (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEnglishName() == null ? other.getEnglishName() == null : this.getEnglishName().equals(other.getEnglishName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getDna() == null ? other.getDna() == null : this.getDna().equals(other.getDna()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getRoostPosition() == null ? other.getRoostPosition() == null : this.getRoostPosition().equals(other.getRoostPosition()))
            && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEnglishName() == null) ? 0 : getEnglishName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getDna() == null) ? 0 : getDna().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getRoostPosition() == null) ? 0 : getRoostPosition().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", englishName=").append(englishName);
        sb.append(", gender=").append(gender);
        sb.append(", dna=").append(dna);
        sb.append(", image=").append(image);
        sb.append(", roostPosition=").append(roostPosition);
        sb.append(", birth=").append(birth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}