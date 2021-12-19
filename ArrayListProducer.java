package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer
{
    private  ArrayList<String> producerList = new ArrayList<>();

    public ArrayListProducer(ArrayList list)
    {
        producerList=list;
    }

    public void produce(int i, String string)
    {
        producerList.add(i,string);
    }

}