package springboot01.entity;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2018-11-08 11:55
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer deptno;

    private String dname;

    private String db_source;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
