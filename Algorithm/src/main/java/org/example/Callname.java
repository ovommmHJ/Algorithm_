package org.example;

import java.util.HashMap;
import java.util.Map;

public class Callname {

    public static void main(String arg[]) {
        System.out.println("hi");

        String players[] = {"mumu", "soe", "poe", "kai", "mine"};
        String callings[] = {"kai", "kai", "mine", "mine"};

        String[] a = solution(players,callings);
    }


    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();
        for(int i = 0; i<players.length;i++){
            map.put(players[i],i);
            map2.put(i,players[i]);
        }


            for(int j=0;j<callings.length;j++){

                if(map.containsKey(callings[j])){
                    int idx = map.get(callings[j]);
                    String a = map2.get(idx);

                    String b = map2.get(idx-1);
                    int idxb = map.get(b);

                    map.put(a,idxb);
                    map2.put(idxb,a);
                    map.put(b,idx);
                    map2.put(idx,b);
                }

            }


            return answer;
        }




}
