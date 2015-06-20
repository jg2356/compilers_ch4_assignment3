public class Val {
    public Object value;

    public Val(Double value) {
        this.value = value;
    }

    public Val(Boolean value) {
        this.value = value;
    }

    private <T> T getValue(Class<T> t) {
    	Class<?> vt = value.getClass();    
    	if (vt != t)
    		throw new RuntimeException("Type mismatch: expected " + t.getName() + " instead of " + vt.getName());
    	return t.cast(value);
    }
    
    public Object getValue() {
    	return value;
    }
    
    public Double getDouble() {
    	return getValue(Double.class);
    }
    
    public Boolean getBoolean() {
    	return getValue(Boolean.class);
    }
} 
