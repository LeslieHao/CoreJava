package com.td.section5;


/**
 * DESC:
 * Created by Hh on 2017/10/19
 */
 class Man extends Animal {

    private boolean language;

    public Man(int age) {
        super(age);
    }

    public boolean isLanguage() {
        return language;
    }

    public void setLanguage(boolean language) {
        this.language = language;
    }


}
