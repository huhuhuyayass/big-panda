package com.example.daxiongmao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName daily_record
 */
@TableName(value ="daily_record")
@Data
public class DailyRecord implements Serializable {
    /**
     * 
     */
    @TableId
    private String recordNumber;

    /**
     * 
     */
    private Integer number;

    /**
     * 
     */
    private String date;

    /**
     * 
     */
    private String food;

    /**
     * 
     */
    private Integer duration;

    /**
     * 
     */
    private Integer height;

    /**
     * 
     */
    private Integer weight;

    /**
     * 
     */
    private Double temperature;

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
        DailyRecord other = (DailyRecord) that;
        return (this.getRecordNumber() == null ? other.getRecordNumber() == null : this.getRecordNumber().equals(other.getRecordNumber()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getFood() == null ? other.getFood() == null : this.getFood().equals(other.getFood()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getTemperature() == null ? other.getTemperature() == null : this.getTemperature().equals(other.getTemperature()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordNumber() == null) ? 0 : getRecordNumber().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getFood() == null) ? 0 : getFood().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordNumber=").append(recordNumber);
        sb.append(", number=").append(number);
        sb.append(", date=").append(date);
        sb.append(", food=").append(food);
        sb.append(", duration=").append(duration);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", temperature=").append(temperature);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}