
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonAutoDetect
public class ConverterImpl implements Converter{
    @JsonIgnore
    private String unit;
    @JsonIgnore
    private Double value;
    @JsonProperty("distance")
    private Map<String, Double> map;
    private String convert_to;

    public Map<String, Double> getMap() {
        return map;
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }

    public String getUnit() {
        return unit;
    }

    public Double getValue() {
        return value;
    }

    public String getConvert_to() {
        return convert_to;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setConvert_to(String convert_to) {
        this.convert_to = convert_to;
    }
}
