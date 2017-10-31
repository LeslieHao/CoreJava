package com.td.section5;


/**
 * DESC:
 * Created by Hh on 2017/10/19
 */
 class Man extends Animal {

    private boolean language;

    public boolean isLanguage() {
        return language;
    }

    public void setLanguage(boolean language) {
        this.language = language;
    }

    /**
     * 文档注释
     * 可以生成文档
     * 调用方法时可以查看
     * @param args
     */
    public static void main(String[] args) {
        Man A = new Man();
        Man B = new Man();
        Animal animal = new Man();
        A.setLanguage(true);
        B.setLanguage(false);
        System.out.println(A.getClass()+""+ A.getClass().equals(B.getClass()));

    }

}
