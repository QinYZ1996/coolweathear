package callback.demo.sunjb.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by P on 2017/10/17.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    private int getId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getGetId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }
}
