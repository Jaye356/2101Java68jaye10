package com.jaye.entity;

/**
 * @author shkstart
 * @create 2021-01-30-1:49
 */
public class Apple {

    public String brand;
    private float size;
    private String ison;

    public Apple() {
    }

    public Apple(String brand) {
        this.brand = brand;
        System.out.print(brand);
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        if(size < 0){
            System.out.println("尺寸不能小于0");
        }else{
            this.size = size;
        }
    }

    public String getIson() {
        return ison;
    }

    public void setIson(String ison) {
        if(ison.trim()!="开机"&&ison.trim()!="关机"){
            System.out.println("手机开关机状态异常");
        }
        this.ison = ison;
    }

    @Override
    public String toString() {
        return "这是toString方法";
    }

    public void call(){
        System.out.println("打电话");
    }

    public void onNet(){
        System.out.println("上网");
    }

}
