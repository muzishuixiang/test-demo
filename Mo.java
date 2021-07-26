package com.lxg.utils;

public class Mo {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for(int i = 0; i < 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for(int i = 0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][1] = 1;
        map[2][2] = 1;
        map[3][4] = 1;
        map[3][5] = 1;
        map[2][4] = 1;
        map[2][5] = 1;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
        istrue(map,1,1);
        System.out.println("=============");
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
    }

    /**
     * 行动顺序右-下-左-上
     * @param map
     * @param i
     * @param j
     * @return
     */
    public static boolean istrue(int[][] map,int i,int j){
        if(i == 6 && j == 1 ){
            return true;
        }
        if(map[i][j] == 0){
            map[i][j] = 2;
            if(istrue(map,i,j + 1)){
                return true;
            }else if(istrue(map,i + 1,j)){
                return true;
            }else if(istrue(map,i ,j - 1)){
                return true;
            }else if(istrue(map,i - 1 ,j)){
                return true;
            }else{
                map[i][j] = 3;
                System.out.println("此路不同");
                return false;
            }
        }
        return false;
    }

}
