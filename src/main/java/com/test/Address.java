package com.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by deshan on 4/6/2018.
 */

public class Address
{
    private String no;
    private String lane;
    private String city;

    public Address()
    {

    }

    public Address(String no, String lane, String city)
    {
        this.no=no;
        this.lane=lane;
        this.city=city;
    }

    public String getNo()
    {
        return no;
    }

    public void setNo( String no )
    {
        this.no = no;
    }

    public String getLane()
    {
        return lane;
    }

    public void setLane( String lane )
    {
        this.lane = lane;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity( String city )
    {
        this.city = city;
    }
}
