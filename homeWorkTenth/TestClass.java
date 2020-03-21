package yarchuk;

import java.util.Objects;

public class TestClass {
    private String param;
    private int intParam;
    private boolean boolParam;

    public TestClass(String param, int intParam, boolean boolParam) {
        this.param = param;
        this.intParam = intParam;
        this.boolParam = boolParam;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }

        if (obj instanceof TestClass) {
            TestClass temp = (TestClass) obj;
            return this.intParam == temp.intParam && this.boolParam == temp.boolParam
                    && Objects.equals(this.param, temp.param);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.boolParam, this.param, this.intParam);
    }

    @Override
    public String toString() {
        return this.param + " " + this.boolParam + " " + this.intParam;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getIntParam() {
        return intParam;
    }

    public void setIntParam(int intParam) {
        this.intParam = intParam;
    }

    public boolean isBoolParam() {
        return boolParam;
    }

    public void setBoolParam(boolean boolParam) {
        this.boolParam = boolParam;
    }
}
