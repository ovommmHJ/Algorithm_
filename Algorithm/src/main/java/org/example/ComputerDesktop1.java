package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerDesktop1 {

    public static void main(String args[]){
        String[] sam = {"..", "#."};
        solution(sam);
    }


    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        List<Integer> indexList = new ArrayList<Integer> ();
        int start = -1;
        int end = 0;
        String word="#";

        for(int i =0 ; i< wallpaper.length ; i++ ){
            int index = wallpaper[i].indexOf("#");
            if(start == -1 && index > -1 ){
                start = i;
                end = i;
                while(index != -1) {
                    indexList.add(index);
                    index = wallpaper[i].indexOf(wallpaper[i], index+word.length());
                }
            }else{
                if(index > -1 ){
                    end = i;
                    while(index != -1) {
                        indexList.add(index);
                        index = wallpaper[i].indexOf("#", index+word.length());
                    }
                }
            }
        }

        answer[0] = start;
        answer[1] = Collections.min(indexList);
        answer[2] = end+1;
        answer[3] = Collections.max(indexList)+1;


        return answer;
    }

}
