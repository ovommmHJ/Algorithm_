package org.example;

import java.util.ArrayList;
import java.util.List;

public class ComputerDesktop2 {

    public static void main(String args[]){
        String[] sam = {"..", "#."};
        solution(sam);
    }


    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        List<Integer> indexList = new ArrayList<Integer> ();
        int start = -1;
        int end = 0;
        int max = 0;
        int min = 0;
        String word="#";

        for(int i =0 ; i< wallpaper.length ; i++ ){
            int index = wallpaper[i].indexOf(word);
            int lastindex = wallpaper[i].lastIndexOf(word);
            if(start == -1 && index > -1 ){
                start = i;
                end = i;
                min = index;
                max = lastindex;
            }else{
                if(index > -1 ){
                    end = i;
                    if(index<min){
                        min = index;
                    }
                    if(lastindex>max){
                        max = lastindex;
                    }
                }
            }
        }

        answer[0] = start;
        answer[1] = min;
        answer[2] = end+1;
        answer[3] = max+1;

        return answer;
    }

}
