
package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer
{
    private ArrayList<String> consumerList = new ArrayList<>();

    public ArrayListConsumer(ArrayList list)
    {
        consumerList=list;

    }

    public String consume()
    {
        // TODO change the returned value
        String current= consumerList.get(0);
        consumerList.remove(0);
        return  current;
    }

}