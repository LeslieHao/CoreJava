package com.td.section7_exception;

import com.td.BaseObject;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * DESC:
 * Created by Hh on 2017/11/16
 */
public class PrintStackTracy extends BaseObject {


    @Test
    public void test(){
        Throwable t = new Throwable();
        StringWriter out = new StringWriter() ;
        t.printStackTrace(new PrintWriter(out));
        String description = out.toString();
        log.info(description);
    }

    public void test2(){

    }
}
