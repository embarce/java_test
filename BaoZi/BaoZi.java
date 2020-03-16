package BaoZi;

public class BaoZi {
    private String pi;
    private String xian;
    private boolean flag=false;

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "BaoZi{" +
                "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                '}';
    }
}
