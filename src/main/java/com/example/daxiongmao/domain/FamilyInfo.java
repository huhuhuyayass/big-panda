package com.example.daxiongmao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName family_info
 */
@TableName(value ="family_info")
@Data
public class FamilyInfo implements Serializable {
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
    private String dna;

    /**
     * 
     */
    private Integer parentNumber;

    /**
     * 
     */
    private Integer femaleNumber;

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
        FamilyInfo other = (FamilyInfo) that;
        return (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDna() == null ? other.getDna() == null : this.getDna().equals(other.getDna()))
            && (this.getParentNumber() == null ? other.getParentNumber() == null : this.getParentNumber().equals(other.getParentNumber()))
            && (this.getFemaleNumber() == null ? other.getFemaleNumber() == null : this.getFemaleNumber().equals(other.getFemaleNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDna() == null) ? 0 : getDna().hashCode());
        result = prime * result + ((getParentNumber() == null) ? 0 : getParentNumber().hashCode());
        result = prime * result + ((getFemaleNumber() == null) ? 0 : getFemaleNumber().hashCode());
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
        sb.append(", dna=").append(dna);
        sb.append(", parentNumber=").append(parentNumber);
        sb.append(", femaleNumber=").append(femaleNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}