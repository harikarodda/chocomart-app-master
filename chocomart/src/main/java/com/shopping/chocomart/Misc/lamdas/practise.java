package com.shopping.chocomart.Misc.lamdas;

import java.util.ArrayList;

public class practise {

    public static void main(String args[]){
        ArrayList<Integer> series= new ArrayList<>();
        series.add(1);
        series.add(2);
        series.add(3);
        series.add(4);
        series.add(5);
        series.add(6);
        series.add(7);

        System.out.println(series.size());
        System.out.println(series.size()/2);
        System.out.println(series.size()%2);
       // double median= (((ArrayList<Integer>) series).size())%2!=0 ? series.get(((series.size())/2)): (series.get((series.size())/2)+series.get(((series.size())/2))-1)/2;
        //System.out.println(median);
        MedianFinder mf= new MedianFinder();
        mf.findMedian(series);
    }
}

interface medianInterf{
    public  double findMedian(ArrayList<Integer> array);
}

class MedianFinder implements medianInterf{
    @Override
    public double findMedian(ArrayList<Integer> iAL) {

        double median= (((ArrayList<Integer>) iAL).size())%2!=0 ? iAL.get(((iAL.size())/2)): (iAL.get((iAL.size())/2)+iAL.get(((iAL.size())/2))-1)/2;
        System.out.println(median);
        return median;
    }

}
