package com.shopping.chocomart.Misc;

import java.util.ArrayList;

public class ArrayListMedianLamdaExpressions {
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
        //MedianFinder mf= new MedianFinder();
        medianInterface mi= (arrayList)-> {
            //double medianValueLamda = arrayList.size() % 2 != 0 ? (((arrayList.size() / 2) - 1) + (arrayList.size() / 2)) / 2 : (arrayList.sloooize() / 2);
            double medianValueLamda = arrayList.size() % 2 != 0 ? (arrayList.get(arrayList.size()/2)):(arrayList.get((((arrayList.size()/2)-1)+(arrayList.size()/2))/2));
            System.out.println(medianValueLamda+"Lamda Invocated");
            return medianValueLamda;
        };
        mi.findMedian(series);
    }
}

interface medianInterface{
    public  double findMedian(ArrayList<Integer> arrayList);
}


